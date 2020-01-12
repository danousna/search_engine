package com.lo17.server;

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

public class SQLServlet extends HttpServlet {
    SpellParser spellParser = new SpellParser();
    SyntaxParser syntaxParser = new SyntaxParser();

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException
    {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        JSONObject data = new JSONObject();

        String query = request.getParameter("q");

        if (query != null) {
            SpellParserResult spellParserResult = spellParser.process(query);

            data.put("query", query);
            data.put("corrected", spellParserResult.simplified);

            JSONObject dataSuggestions = new JSONObject();
            if (spellParserResult.suggestions.size() > 0) {
                for (Map.Entry entry : spellParserResult.suggestions.entrySet()) {
                    JSONArray arr = new JSONArray();
                    arr.addAll((List<String>) entry.getValue());
                    dataSuggestions.put(entry.getKey(), arr);
                }
            }
            data.put("suggestions", dataSuggestions);

            try {
                String sql = syntaxParser.process(spellParserResult.simplified);
                data.put("sql", sql);
            } catch (Exception e) {
                data.put("error", e.toString());
            }
        }

        out.print(data.toJSONString());
        out.flush();
    }
}
