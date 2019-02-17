package Servlets;

import Classes.Account;
import Database.DatabaseConnector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sign_up")

public class SignupServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Account newAccount = null;
        DatabaseConnector db = new DatabaseConnector();
        boolean result;
        try {
            newAccount = new Account(
                    req.getParameter("fullname"),
                    req.getParameter("login"),
                    req.getParameter("email"),
                    req.getParameter("birthdate"),
                    req.getParameter("password"),
                    req.getParameter("gender")
            );
            result = db.addAccount(newAccount);
        }
        catch (NullPointerException ex){
            System.out.println(ex.getMessage());
            result = false;
        }
        PrintWriter out = resp.getWriter();
        out.println(result ? "Заявка успешно добавлена" : "Не получилось добавить заявку");
        out.print("<a style=\"display: inline-block; color: white; text-decoration: none; margin: 10px; padding: 10px; border-radius: 3px; background-color: green;\" href=\"index.jsp\">Back</a>");
        System.out.println(newAccount);
    }
}
