package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/showadminServlet")
public class showadminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
			try {
				
				List<Admin> adminDetail = adminDBUtil.showadmin();
				request.setAttribute("adminDetail", adminDetail);
				
			}
			catch(Exception e) {
				e.printStackTrace();
				
			}
			
			RequestDispatcher dis = request.getRequestDispatcher("ShowAdmin.jsp");
			dis.forward(request, response);

	}

}
