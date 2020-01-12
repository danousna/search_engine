package com.lo17.server;

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

public class PredictServlet extends HttpServlet {
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

            try {
                SyntaxParserResult result = syntaxParser.process(spellParserResult.simplified);
                data.put("sql", result.sql);
            } catch (Exception e) {
                data.put("error", e.toString());
            }

            JSONArray predictions = new JSONArray();
            predictions.addAll(predictor.predict(query));
            data.put("predictions", predictions);
        }

        out.print(data.toJSONString());
        out.flush();
    }
}
