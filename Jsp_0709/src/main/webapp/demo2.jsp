<!-- page 지시자(directive : 디렉티브) -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!-- 기존 JEE JSTL core -->
<%--@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" --%>
<!-- Jakata EE JSTL 3.0 JSTL core -->
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%
// 스크립트릿(scriptlet) : JEE code
System.out.println("콘솔 출력"); // 표준 출력
// out : JSP 기본(내장) 객체
// \n : 텍스트 문장(콘솔 상황) 줄바꿈
// <br> : 웹 브라우저 출바꿈F
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<%
	printCode("JSP/Servlet");
	// this.printCode("JSP/Servlet");
	
	out.println("웹 브라우저 출력-1<br>"); // 웹 브라우저 출력
	out.println("웹 브라우저 출력-2<br>"); // 웹 브라우저 출력

	String str = "JSP";
	out.println("str : " + str + "<br>");
	%>
	<!-- 표현식(expression) -->
	1 ~ 5까지의 합 : <%=1 + 2 + 3 + 4 + 5%><br>
	임의의 수(난수) : <%=Math.random()%><br>
	str : <%=str%>
	<%-- // JSP 주석
	out.println("주석");
	--%>
	<%
	// request : JSP 기본 객체(Http 요청 객체)
	request.setAttribute("spring", "6");
	%>
	spring : <%= request.getAttribute("spring") %><br>
	spring : ${spring}
</body>
</html>
	<%!
	// 선언부(declaration) : JSE code
	// out.println("abcd"); // JEE code X
	public void printCode(String str) {
		System.out.println("str : " + str);
	}
	%>