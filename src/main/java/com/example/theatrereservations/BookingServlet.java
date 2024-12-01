package com.example.theatrereservations;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/booking")
public class BookingServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String play = request.getParameter("play");
        String date = request.getParameter("date");
        String ticketType = request.getParameter("ticketType");

        // Validare simplă
        if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || play.isEmpty() || date.isEmpty() || ticketType.isEmpty()) {
            response.getWriter().write("Toate câmpurile sunt obligatorii!");
            return;
        }

        if (name.length() < 4) {
            response.getWriter().write("Name is too short");
            return;
        }

        // Setăm atributele pentru a le trimite mai departe
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("phone", phone);
        request.setAttribute("play", play);
        request.setAttribute("date", date);
        request.setAttribute("ticketType", ticketType);

        // Forward către ConfirmationServlet
        RequestDispatcher dispatcher = request.getRequestDispatcher("/confirm");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("Do get called");
    }
}

