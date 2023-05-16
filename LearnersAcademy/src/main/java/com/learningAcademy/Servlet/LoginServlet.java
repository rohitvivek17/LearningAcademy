package com.learningAcademy.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learningAcademy.Entity.User;
import com.learningAcademy.Util.HibernetUtil;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  	String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        String role = request.getParameter("role");

	        // Validate user credentials
	        User user = validateUser(username, password, role);

	        if (user != null && role.equals("admin")) {
	            // User is valid, do something (e.g., redirect to a different page)
	            response.sendRedirect("AdminDash.jsp");
	        } else if(user != null && role.equals("teacher")) {
	        	response.sendRedirect("TeacherDash.jsp");
	        }else if(user != null && role.equals("student")) {
	        	response.sendRedirect("StudentDash.jsp");
	        }
	        else {
	            // Invalid credentials, show an error message
	            request.setAttribute("error", "Invalid username, password, or role.");
	            request.getRequestDispatcher("index.jsp").forward(request, response);
	        }
	}
	 private User validateUser(String username, String password, String role) {
		 	SessionFactory sf=HibernetUtil.buildSessionFactory();
 			Session session=sf.openSession();
 			Transaction tx=session.beginTransaction();   
		      	            
	            User user = (User) session.createQuery(" FROM User WHERE username = :username AND password = :password AND role = :role ")
	                    .setParameter("username", username)
	                    .setParameter("password", password)
	                    .setParameter("role", role)
	                    .uniqueResult();

	            session.getTransaction().commit();
	            return user;
	       
	    }
	 
}
