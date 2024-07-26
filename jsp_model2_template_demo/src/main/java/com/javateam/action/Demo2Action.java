package com.javateam.action;

import com.javateam.control.CommandAction;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Demo2Action implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		System.out.println("demo2.do");
		request.setAttribute("java", 21);
		return "demo2.jsp"; // jsp page
	}

}
