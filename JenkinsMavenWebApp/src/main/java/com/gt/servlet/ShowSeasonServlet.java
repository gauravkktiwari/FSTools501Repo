package com.gt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/season")
public class ShowSeasonServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest re, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("ShowSeasonServlet.doGet()");
		PrintWriter pw = res.getWriter();
		
		res.setContentType("text/html");
		
		LocalDate ldate=LocalDate.now();
		
		int month = ldate.getMonthValue();
		
		if(month >= 3 && month <=6)
			pw.println("<h1 style='color:red;text-align:center;'>Summer Season</h1>");
		else if(month >= 7 && month <=10)
			pw.println("<h1 style='color:blue;text-align:center;'>Rainy Season</h1>");
		else
			pw.println("<h1 style='color:blue;text-align:center;'>Winter Season</h1>");
		
		pw.println("<br> <a href='index.jsp'>home</a>");
		pw.close();
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("ShowSeasonServlet.doPost()");
		doGet(req, resp);
	}
}
