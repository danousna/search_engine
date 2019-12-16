package com.lo17.server;

import com.lo17.database.SQLInterface;
import com.lo17.speller.SpellParser;
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

public class QueryServlet extends HttpServlet {
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
            String corrected = spellParser.process(query);
            String sql = syntaxParser.process(corrected);

            data.put("query", query);
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
        }

        out.print(data.toJSONString());
        out.flush();
    }
}
