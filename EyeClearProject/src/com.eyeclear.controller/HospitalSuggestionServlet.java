package com.eyeclear.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.eyeclear.service.HospitalService;

@WebServlet("/HospitalSuggestionServlet")
public class HospitalSuggestionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String locality = request.getParameter("locality");
        HospitalService service = new HospitalService();
        List<String> hospitals = service.getHospitalsByLocality(locality);

        response.setContentType("text/html");
        response.getWriter().println("<h3>Hospitals in " + locality + ":</h3><ul>");
        for (String hospital : hospitals) {
            response.getWriter().println("<li>" + hospital + "</li>");
        }
        response.getWriter().println("</ul>");
    }
}
