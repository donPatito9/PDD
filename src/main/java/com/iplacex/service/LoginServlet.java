package com.iplacex.service;

import com.iplacex.dao.LoginBean;
import com.iplacex.dao.LoginDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class LoginServlet
 */@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
        * @param request
        * @param response
        * @throws javax.servlet.ServletException
        * @throws java.io.IOException
	* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	*/
        @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	/**
        * @param request 
        * @param response 
        * @throws javax.servlet.ServletException
        * @throws java.io.IOException
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoginDao loginDao = new LoginDao();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		LoginBean usuario = new LoginBean();
		usuario.setUsername(username);
		usuario.setPassword(password);

		if (loginDao.validate(usuario)==true) {	
		   request.setAttribute("username", username);
		   RequestDispatcher rd= request.getRequestDispatcher("principal.jsp");
	           PrintWriter out=response.getWriter();
	           out.println("Bienvenido:"+username);
		   response.sendRedirect("principal.jsp");
		   HttpSession session = request.getSession();
                   session.setAttribute("user", username);
	        
		   rd.forward(request, response);	
		} else {
			response.sendRedirect("index.jsp");
		}
	}
}