package com.example.meme;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/generate")
public class MemeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String top = request.getParameter("top");
        String bottom = request.getParameter("bottom");

        if (top == null || top.isBlank()) {
            top = "HELLO";
        }

        if (bottom == null || bottom.isBlank()) {
            bottom = "JENKINS";
        }

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("<title>Generated Meme</title>");
            out.println("<link rel='stylesheet' href='" +
                    request.getContextPath() + "/css/style.css'>");
            out.println("</head>");

            out.println("<body>");
            out.println("<div class='container'>");

            out.println("<h1>Generated Meme</h1>");

            out.println("<div class='meme'>");

            out.println("<div class='top-text'>"
                    + escapeHtml(top)
                    + "</div>");

            out.println("<div class='bottom-text'>"
                    + escapeHtml(bottom)
                    + "</div>");

            out.println("</div>");

            out.println("<a class='button' href='"
                    + request.getContextPath()
                    + "/'>Create Another</a>");

            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    private String escapeHtml(String value) {
        return value.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&#39;");
    }
}
