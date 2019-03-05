package com.chainsys.quiz;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		Login login = new Login();
		login.name = name;
		login.password = password;
		LoginDAO dao = new LoginDAO();
		TopicsDAO topicdao = new TopicsDAO();
		Topics topics = new Topics();
		try {
			//dao.addLogin(login);
			ArrayList<Topics> topicList = topicdao.findAll(topics);
			request.setAttribute("TOPICS", topicList);
			
			RequestDispatcher rd = request.getRequestDispatcher("topics.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("false");
		}

	}
}
