<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<TITLE>Reading Three Request Parameters</TITLE>
<LINK REL=STYLESHEET
HREF="JSP-Styles.css"
TYPE="text/css">
</HEAD>
<BODY>
<H1>Reading Three Request Parameters</H1>
<UL>
<LI><B> param1 </B>: <%= request.getParameter("param1") %>
<LI><B> param2 </B>: <%= request.getParameter("param2") %>
<LI><B> param3 </B>: <%= request.getParameter("param3") %>
</UL>
</BODY></HTML>