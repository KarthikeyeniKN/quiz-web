package com.chainsys.quiz;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/QuesterServlet")
public class QuesterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		QuesterDAO questerdao = new QuesterDAO();
		try {
			ArrayList<Quester> questerList = questerdao.findAll();
			request.setAttribute("QUESTER", questerList);
			RequestDispatcher rd = request.getRequestDispatcher("quester.jsp");
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
			// TODO Auto-generated catch block
			RequestDispatcher rd = request.getRequestDispatcher("Failure.html");
			rd.forward(request, response);
			e.printStackTrace();
		}

	}
}
