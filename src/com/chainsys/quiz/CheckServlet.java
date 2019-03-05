package com.chainsys.quiz;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/CheckServlet")
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("insert");
		
		String[] option = request.getParameterValues("ANSWER");
		System.out.println( request.getParameterValues("ANSWER"));
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		String answer = "";
	
		int[] question_option = new int[option.length];
		for (int i = 0; i < question_option.length; i++) {
			answer = "";
			
			int temp = i++;
			for (int j = 0; j < question_option.length; j++) {
				
				answer = option[j];
			}
			map.put(temp, answer);
		}
		for(Map.Entry<Integer, String> answer1:map.entrySet()) {
			System.out.println(map.keySet()+""+map.values());
		}

	}
}
