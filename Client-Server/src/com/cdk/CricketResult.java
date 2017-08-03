package com.cdk;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class CricketResult extends HttpServlet {

    List<CricketMatch> matchInfo = new ArrayList<>();

    public void init() throws ServletException {

        matchInfo.add(new CricketMatch("INDIA", "ENGLAND", "TEST", 90, "London", "INDIA"));
        matchInfo.add(new CricketMatch("INDIA", "ENGLAND", "T-20", 20, "PUNE", "ENGLAND"));
        matchInfo.add(new CricketMatch("ENGLAND", "INDIA", "ODI", 50, "DELHI", "INDIA"));
    }

    public void destroy() {
        matchInfo.clear();
        matchInfo = null;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String matchType = request.getParameter("matchType");
        String country1 = request.getParameter("country1");
        String country2 = request.getParameter("country2");

        PrintWriter pw = response.getWriter();
        pw.write("Details of the match is : ");

        Iterator<CricketMatch> itr = matchInfo.iterator();

        while (itr.hasNext()) {
            CricketMatch match = itr.next();
            if (match.getCountry1().equals(country1) && match.getCountry2().equals(country2) && match.getMatchType().equals(matchType)) {
                pw.write(match.toString());
                break;
            }
        }


    }
}