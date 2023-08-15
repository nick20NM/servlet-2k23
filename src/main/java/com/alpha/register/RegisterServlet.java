package com.alpha.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	public RegisterServlet() {
        super();
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String course = request.getParameter("course");
		String checkbox = request.getParameter("checkbox");
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		System.out.println(checkbox);
		writer.println(checkbox);
		
		if (checkbox!=null) {
			if (checkbox.equals("checked")) {
				writer.println("<h2>");
				writer.println(name+"<br>");
				writer.println(password+"<br>");
				writer.println(email+"<br>");
				writer.println(gender+"<br>");
				writer.println(course);
				writer.println("</h2>");
				
				// JDDC code can be written to save form data to DB
				
				// call to SuccessServlet
				RequestDispatcher dispatcher = request.getRequestDispatcher("success");
				dispatcher.forward(request, response);
			} else {
				writer.println("<h2>Please check the checkbox</h2>");
			}
		} else {
			writer.println("<h2>Please check the checkbox</h2>");
			
			// include output of register.html
			
			// first get RequestDispatcher object
			RequestDispatcher dispatcher = request.getRequestDispatcher("register.html");
			
			// then include using
			dispatcher.include(request, response);
		}
		
		
	}

}
