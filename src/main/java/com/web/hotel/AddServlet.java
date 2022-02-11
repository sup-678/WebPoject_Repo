package com.web.hotel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("nums1"));
		int j = Integer.parseInt(req.getParameter("nums2"));
		int k= i+j;
		PrintWriter pr = res.getWriter();
		pr.println("Result is :"+ k);
	}

}
