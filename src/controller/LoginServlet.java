package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.UserDao;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//TODO try to validate login. 
		String user = req.getParameter("user");
		String pass = req.getParameter("pass");
		String fileName;
		if(UserDao.getInsnce().validLogin()) {
			fileName = "main.html";
			
		}
		else {
			fileName = "loginFailed.html";
		}
		System.out.println("You are logged in as user: " + user);
		RequestDispatcher rd = req.getRequestDispatcher(fileName);
		rd.forward(req, resp);
	}
}
