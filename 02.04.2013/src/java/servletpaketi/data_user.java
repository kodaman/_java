package servletpaketi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="data_user", urlPatterns={"/data_user"})
public class data_user extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

PrintWriter out = response.getWriter();
out.println("<!DOCTYPE html>\n" +
"<html>\n" +
"<head><title>Data User</title></head>\n" +
"<body style = \" margin-top:50px;margin-left: 5in\">\n<h1>Data User</h1>");
String isim = request.getParameter("ad");
if(isim.length() == 0)
out.println("<h1>ad kisimi bos olmaz</h1>");
else {
out.println("<TABLE BORDER=1 ALIGN=CENTER style = \" margin-top:50px;margin-left: 0in\">\n" +
"<TR BGCOLOR=\"#FFAD00\">\n" +
"<TR><TH>ISIM<TD></b>"+request.getParameter("ad") + "\n"+
"<TR><TH> SOYAD <TD>"+request.getParameter("soyad") + "\n"+
"<TR><TH> CINSIYET <TD>"+request.getParameter("cinsiyet") + "\n"+
"<TR><TH> MESLEK <TD>"+request.getParameter("meslek") + "\n"+
"<TR><TH> MESAJ <TD>"+request.getParameter("mail") + "\n<TABLE>");
}
out.println("</body></html>");
}

}

