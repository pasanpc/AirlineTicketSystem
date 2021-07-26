package com.servelet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.FeedbackDbUtil;
import com.util.InsertedFeedback;


@WebServlet("/UpdateFeedback")
public class UpdateFeedback extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = request.getParameter("userName");
		String feedback = request.getParameter("userFeedback");
		
		boolean isTrue;
		
		isTrue = FeedbackDbUtil.updateFeedback(id, name, feedback);
		
		if(isTrue==true)
		{
			List<InsertedFeedback> InFeedback = FeedbackDbUtil.getFeedback(id);
			request.setAttribute("InFeedback", InFeedback);
			
			RequestDispatcher dis = request.getRequestDispatcher("DisplayFeedbacks.jsp");
			dis.forward(request, response);
		}
		else
		{
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
	}

}
