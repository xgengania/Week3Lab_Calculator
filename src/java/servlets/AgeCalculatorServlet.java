/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Roxan
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String message = "--";
        
        request.setAttribute("message", message);

        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request,response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String ageString = request.getParameter("age"); //retrieving from the form
            int age = Integer.parseInt(ageString);
            
            request.setAttribute("age", age);

            if(age<=0 ){
                request.setAttribute("age", age);
                String message = "Please enter a valid number";
                request.setAttribute("message", message);
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request,response);
                
                return;
            }
            
            int newAge = age + 1;
            String message = "You are " + age + " and are going to be " + newAge;
            request.setAttribute("message", message);

            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request,response);
    }
}
