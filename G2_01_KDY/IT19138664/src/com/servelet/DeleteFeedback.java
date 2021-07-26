package com.servelet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.FeedbackDbUtil;


@WebServlet("/DeleteFeedback")
public class DeleteFeedback extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String id = request.getParameter("id");
			
			boolean isTrue;
			
			isTrue = FeedbackDbUtil.deleteFeedback(id);
			
			if(isTrue==true)
			{
				
				RequestDispatcher dis = request.getRequestDispatcher("Feedback.jsp");
				dis.forward(request, response);
			}
			else
			{
				RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
				dis2.forward(request, response);
			}
			
		}
		
}
