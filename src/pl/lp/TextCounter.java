package pl.lp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;

@WebServlet("/convert")
public class TextCounter extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userText = request.getParameter("textSent");
        String[] table = userText.split(" ");
        String pureText = userText.replace(" ", "").replace(".", "").replace(",", "").toLowerCase();

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.println("<h3><p style=\"font-style:italic;\">"+(userText) + "</p></h3><br>");
        writer.println("<h2>Ilość słów: " + table.length + "<br>");
        writer.println("Ilość znaków: " + userText.length() + "<br>");
        writer.println("Ilość znaków (bez spacji): " + userText.replace(" ", "").length() + "<br>");
        writer.println("Palindom: " + palindrom(pureText) + "</h2>");
    }

    boolean palindrom(String text) {
        boolean state = false;
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                state = false;
                break;
            } else {
                state = true;
            }
        }
        return state;
    }
}
