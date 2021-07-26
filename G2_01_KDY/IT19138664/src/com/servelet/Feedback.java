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


@WebServlet("/Feedback")
public class Feedback extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("Fname");
		String feedback = request.getParameter("feedback");
		
		boolean isTrue;
		
		isTrue = FeedbackDbUtil.insertFeedback(name, feedback);
		
		try {
			List<InsertedFeedback> InFeedback = FeedbackDbUtil.validate(name, feedback);
			request.setAttribute("InFeedback", InFeedback);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		if(isTrue==true)
		{
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
