package com.systex.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.LinkedList;

import com.systex.model.Customer;

/**
 * Servlet implementation class CreateCustomer
 */
public class CreateCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getParameter("action");
		switch(action) {
			case "cc1":
				processCC1(request , response);
				break;
			case "cc2":
				processCC2(request , response);
				break;
			default:
				//Error Handling
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void processCC1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view;
		LinkedList<String> errorMsgs = new LinkedList<>();
		request.setAttribute("errors", errorMsgs);
		
		//1. Retrieve Form Data
		String name 	 = request.getParameter("name");
		String email 	 = request.getParameter("email");
		String telephone = request.getParameter("telephone");
		String address   = request.getParameter("address");
		
		//2. Convert Form Data
		//N/A ->都是字串
		
		//3. Validate Form Data
		if (name == null || name.trim().isEmpty()) {
			errorMsgs.add("姓名欄位必須填寫");
		}
		if (email == null || email.trim().isEmpty()) {
			errorMsgs.add("電子郵件欄位必須填寫");
		}
		if (telephone == null || telephone.trim().isEmpty()) {
			errorMsgs.add("電話欄位必須填寫");
		}
		if (address == null || address.trim().isEmpty()) {
			errorMsgs.add("地址欄位必須填寫");
		}
		if (!errorMsgs.isEmpty()) {
			view = request.getRequestDispatcher("createCustomer1.jsp");
			view.forward(request, response);
			return; //<重要!>把控制權還給container , 不要再往下走了
		}
		
		//4. Invoke Business Logic
		try {
			Customer cust = new Customer();
			cust.setName(name);
			cust.setEmail(email);
			cust.setTelephone(telephone);
			cust.setAddress(address);
			
			HttpSession session = request.getSession();
			session.setAttribute("cust", cust);  //Request-Scope
			
			view = request.getRequestDispatcher("createCustomer2.jsp"); //成功->導到下一頁
			view.forward(request, response);
			
		}catch(Exception e){
			e.printStackTrace();
			errorMsgs.add(e.getMessage());
			view = request.getRequestDispatcher("createCustomer1.jsp"); //導回原本的表單
			view.forward(request, response);
		}
		
		//5. Select Next View
	}
	
	protected void processCC2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view;
		LinkedList<String> errorMsgs = new LinkedList<>();
		request.setAttribute("errors", errorMsgs);
		
		//1. Retrieve Form Data
		String birth 	 = request.getParameter("birth");
		String gender 	 = request.getParameter("gender");
		String[] habits  = request.getParameterValues("habit");
		
		//2. Convert Form Data
		//N/A ->都是字串
		
		//3. Validate Form Data
		if (birth == null || birth.trim().isEmpty()) {
			errorMsgs.add("請挑選您的生日欄位");
		}
		if (gender == null) {
			errorMsgs.add("請挑選您的性別");
		}
		if (habits == null) {
			errorMsgs.add("請至少勾選一項嗜好進去");
		}
		if (!errorMsgs.isEmpty()) {
			view = request.getRequestDispatcher("createCustomer2.jsp");
			view.forward(request, response);
			return; //<重要!>把控制權還給container , 不要再往下走了
		}
		
		//4. Invoke Business Logic
		try {
			HttpSession session = request.getSession();
			Customer cust = (Customer) session.getAttribute("cust");
			cust.setBirth(birth);
			cust.setGender(gender);
			cust.setHabits(habits);

			session.setAttribute("cust", cust);  //Request-Scope
			
			view = request.getRequestDispatcher("createSuccessful.jsp"); //成功->導到下一頁
			view.forward(request, response);
			
		}catch(Exception e){
			e.printStackTrace();
			errorMsgs.add(e.getMessage());
			view = request.getRequestDispatcher("createCustomer2.jsp"); //導回原本的表單
			view.forward(request, response);
		}
		
		//5. Select Next View
	}

}
