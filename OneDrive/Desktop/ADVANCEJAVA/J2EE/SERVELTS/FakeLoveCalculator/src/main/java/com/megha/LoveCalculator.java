package com.megha;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/info")
public class LoveCalculator extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user1 = req.getParameter("user");
		String crush1 = req.getParameter("crush");
		
		int result = Math.abs((user1+crush1).hashCode())%101;
		
		req.setAttribute("user", user1);
		req.setAttribute("crush", crush1);
		req.setAttribute("result", result);
		
		RequestDispatcher rd = req.getRequestDispatcher("Display");
		rd.forward(req, resp);
		
	}
	
}
