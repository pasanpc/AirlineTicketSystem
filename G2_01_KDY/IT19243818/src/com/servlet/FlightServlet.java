package com.servlet;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Flight;
import com.util.FlightDBUtil;

/**
 * Servlet implementation class FlightServlet
 */
@WebServlet("/FlightServlet")
public class FlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
		
	    String depAir = request.getParameter("depair");
	    String arrAir = request.getParameter("desair");
	    String depdate = request.getParameter("depDate");
	    String arrdate = request.getParameter("arrDate");
	    
	    try {
        	  List<Flight> fliDetails = FlightDBUtil.validate(depAir, arrAir,depdate,arrdate);
        	  request.setAttribute("fliDetails", fliDetails);
	    }
	    catch (Exception e) {
		e.printStackTrace();
	    }
	    
	    
	    RequestDispatcher dis = request.getRequestDispatcher("flightList.jsp");
	    dis.forward(request, response);    
	}

}
