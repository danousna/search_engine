package com.lo17.server;

import com.lo17.database.SQLInterface;
import com.lo17.predictor.Predictor;
import com.lo17.speller.SpellParser;
import com.lo17.speller.SpellParserResult;
import com.lo17.syntaxer.SyntaxParser;
import com.lo17.syntaxer.SyntaxParserResult;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public class QueryServlet extends HttpServlet {
    SpellParser spellParser = new SpellParser();
    SyntaxParser syntaxParser = new SyntaxParser();
    Predictor predictor = Predictor.getInstance();

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException
    {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Access-Control-Allow-Origin", "*");
        PrintWriter out = response.getWriter();
        JSONObject data = new JSONObject();

        String query = request.getParameter("q");

        if (query != null) {
            SpellParserResult spellParserResult = spellParser.process(query);

            data.put("query", query);
            data.put("corrected", spellParserResult.simplified);

            if (spellParserResult.suggestions.size() > 0) {
                JSONObject dataSuggestions = new JSONObject();
                for (Map.Entry entry : spellParserResult.suggestions.entrySet()) {
                    JSONArray arr = new JSONArray();
                    arr.addAll((List<String>) entry.getValue());
                    dataSuggestions.put(entry.getKey(), arr);
                }
                data.put("suggestions", dataSuggestions);
            }

            try {
                SyntaxParserResult result = syntaxParser.process(spellParserResult.simplified);

                data.put("tree", result.tree.toString());
                data.put("sql", result.sql);

                JSONArray dataResults = new JSONArray();
                SQLInterface sqlInterface = new SQLInterface();
                List<Map<String, String>> results = sqlInterface.query(result.sql);
                for (Map<String, String> entry : results) {
                    JSONObject dataResult = new JSONObject();
                    for (Map.Entry<String, String> subEntry : entry.entrySet()) {
                        dataResult.put(subEntry.getKey(), subEntry.getValue());
                    }
                    dataResults.add(dataResult);
                }
                data.put("results", results);

                // Query worked, so store it to predict new ones.
                predictor.saveQuery(query);
            } catch (Exception e) {
                data.put("error", e.toString());
            }
        }

        out.print(data.toJSONString());
        out.flush();
    }
}
