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
 * Servlet implementation class DeleteTicketServlet
 */
@WebServlet("/DeleteTicketServlet")
public class DeleteTicketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String ticketId = request.getParameter("ticketId");
		String custNo = request.getParameter("custNo");
		boolean isTrue;
		
		isTrue = TicketDBUtil.deleteticket(ticketId,custNo);
		
		if(isTrue == true) {
			
			List<Ticket> tickDetails = TicketDBUtil.getTicketDetails(custNo);
			request.setAttribute("tickDetails", tickDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("myticketssearch.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis = request.getRequestDispatcher("myticketssearch.jsp");
			dis.forward(request, response);
		}
	}

}
