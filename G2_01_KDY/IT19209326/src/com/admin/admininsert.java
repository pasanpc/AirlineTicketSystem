package com.admin;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@WebServlet("/admininsert")
public class admininsert extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String Flightld = request.getParameter("flightid");
		String DepAirport= request.getParameter("depAir");
		String ArrAirport = request.getParameter("arrAir");
		String depDate = request.getParameter("depDate");
		String arrDate = request.getParameter("arrDate");
		String Airline = request.getParameter("airline");
		String Price = request.getParameter("price");
		
		boolean isTrue;
		
		isTrue = adminDBUtil.insertadmin(Flightld, DepAirport, ArrAirport, depDate, arrDate,Airline, Price );
		
		if(isTrue == true) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Data entered successfully!');");
			out.println("location='admininsert.jsp'");
			out.println("</script>");
			
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
		
	}

}
