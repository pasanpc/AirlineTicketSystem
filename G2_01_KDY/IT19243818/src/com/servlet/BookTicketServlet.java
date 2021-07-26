package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Ticket;
import com.util.TicketDBUtil;

/**
 * Servlet implementation class BookTicketServlet
 */
@WebServlet("/BookTicketServlet")
public class BookTicketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String flightId = request.getParameter("flightId");
		String depAir = request.getParameter("depAir");
		String arrAir = request.getParameter("arrAir");
		String depDate = request.getParameter("depDate");
		String arrDate = request.getParameter("arrDate");
		String airline = request.getParameter("airline");
		String price = request.getParameter("price");
		String custNo = request.getParameter("custNo");
		String tcls = request.getParameter("tcls");
		
		boolean isTrue;
		
		isTrue = TicketDBUtil.bookticket(flightId,depAir,arrAir, depDate, arrDate, airline, price,custNo,tcls);
		
		if(isTrue == true) {
			List<Ticket> tickDetails = TicketDBUtil.getTicketDetails(custNo);
			request.setAttribute("tickDetails", tickDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("myticketssearch.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
	}

}