package com.systex.view;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * Servlet implementation class DumpServlet
 */
public class DumpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DumpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String croot = request.getContextPath();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet DumpServlet</title>");
		out.println("<link href=\""+croot+"/style/MyStyle.css\" rel=\"stylesheet\"></link>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>Dump Servlet</h2>");
		Enumeration<String> headerNames = request.getHeaderNames();
		out.println("<table border='1' style='margin:auto'>");
		out.println("<thead><tr><th>Header Name</th><th>Header Value</th></tr></thead>");
		out.println("<tbody>");
		while(headerNames.hasMoreElements()) {
			String Name = headerNames.nextElement();
			String Value = request.getHeader(Name);
			out.println("<tr><td>"+Name+"</td><td>"+Value+"</td></tr>");
		}
		out.println("</tbody>");
		out.println("</table>");
		out.println("<h2>Customer File</h2>");
		Enumeration<String> paramNames = request.getParameterNames();
		out.println("<table border='1' style='margin:auto'>");
		out.println("<thead><tr><th>Name</th><th>Value</th></tr></thead>");
		out.println("<tbody>");
		while(paramNames.hasMoreElements()) {
			String Name = paramNames.nextElement();
			String Value;
			if (Name.equals("habit")){
				Value = Arrays.toString(request.getParameterValues(Name));	
			}else {
				Value = request.getParameter(Name);
			}
			out.println("<tr><td>"+Name+"</td><td>"+Value+"</td></tr>");
		}
		out.println("</tbody>");
		out.println("</table>");
		out.println("<br><a href='"+croot+"/'>Home</a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
