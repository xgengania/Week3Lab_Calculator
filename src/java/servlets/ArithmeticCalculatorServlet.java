/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Roxan
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/arithmetic"})
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request,response);
        String result = "--";
                    request.setAttribute("result", result);

        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String numberOneString = request.getParameter("numberOne"); //retrieving from the form
            String numberTwoString = request.getParameter("numberTwo"); //retrieving from the form

            String submit = request.getParameter("submit");
            int numberOne = Integer.parseInt(numberOneString);
            int numberTwo= Integer.parseInt(numberTwoString);

            
            request.setAttribute("numberOne", numberOne);
            request.setAttribute("numberTwo", numberTwo);


            if(numberOne ==0 || numberTwo == 0){
            request.setAttribute("numberOne", numberOne);
            request.setAttribute("numberTwo", numberTwo);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request,response);
                String result = "invalid";
                    request.setAttribute("result", result);

                return;
            }else{
                int resultInt = 0;
                
                switch(submit){
                    case "+":
                        //add
                         resultInt = numberOne + numberTwo;
                        
                    break;
                    
                    case "-":
                        //subtract
                         resultInt = numberOne - numberTwo;
                        
                        break;
                        
                    case "*":
                        //multiply
                         resultInt = numberOne * numberTwo;
                        
                        break;
                    case "/":
                        //divide
                         resultInt = numberOne / numberTwo;
                     
                        break;
                        
                    default:
                        break;
                }
                
                String result = Integer.toString(resultInt);
                    request.setAttribute("result", result);
            }
            
            
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
;
    }
}
