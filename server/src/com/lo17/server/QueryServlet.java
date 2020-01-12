package com.lo17.server;

import com.lo17.database.SQLInterface;
import com.lo17.speller.SpellParser;
import com.lo17.speller.SpellParserResult;
import com.lo17.syntaxer.SyntaxParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class QueryServlet extends HttpServlet {
    SpellParser spellParser = new SpellParser();
    SyntaxParser syntaxParser = new SyntaxParser();

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
                String sql = syntaxParser.process(spellParserResult.simplified);
                data.put("sql", sql);

                JSONArray dataResults = new JSONArray();
                SQLInterface sqlInterface = new SQLInterface();
                List<Map<String, String>> results = sqlInterface.query(sql);
                for (Map<String, String> result : results) {
                    JSONObject dataResult = new JSONObject();
                    for (Map.Entry<String, String> entry : result.entrySet()) {
                        dataResult.put(entry.getKey(), entry.getValue());
                    }
                    dataResults.add(dataResult);
                }
                data.put("results", results);
            } catch (Exception e) {
                data.put("error", e.toString());
            }
        }

        out.print(data.toJSONString());
        out.flush();
    }
}
