package com.example.theatrereservations;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/confirm")
public class ConfirmationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = (String) request.getAttribute("name");
        String email = (String) request.getAttribute("email");
        String phone = (String) request.getAttribute("phone");
        String play = (String) request.getAttribute("play");
        String date = (String) request.getAttribute("date");
        String ticketType = (String) request.getAttribute("ticketType");

        if (name == null || email == null || phone == null || play == null || date == null || ticketType == null) {
            response.getWriter().write("A apărut o eroare în procesarea cererii.");
            return;
        }

        response.setContentType("text/html");
        response.getWriter().write("""
            <html>
                <head><title>Confirmare Rezervare</title></head>
                <body>
                    <h1>Rezervare Confirmată</h1>
                    <p><b>Nume:</b> """ + name + """
                    </p>
                    <p><b>Email:</b> """ + email + """
                    </p>
                    <p><b>Telefon:</b> """ + phone + """
                    </p>
                    <p><b>Piesa de teatru:</b> """ + play + """
                    </p>
                    <p><b>Data:</b> """ + date + """
                    </p>
                    <p><b>Tip bilet:</b> """ + ticketType + """
                    </p>
                    <p>Vă mulțumim pentru rezervare!</p>
                </body>
            </html>
        """);
    }
}

