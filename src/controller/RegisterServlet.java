package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.dao.UserDao;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO add new user
		String name = req.getParameter("name");
		String user = req.getParameter("user");
		String pass = req.getParameter("pass");
		String checkPass = req.getParameter("pass2");
		// validate data and check did pass match pass2
		// if not valid data --> forward register page
	
		String fileName = "register.html";
		
		if(pass.equals(checkPass)) {
			fileName = "index.html";
			User u = new User(name, user, pass);
			try {
				UserDao.getInsnce().addUser(u);
			} 
			catch (SQLException e) {
				System.out.println(e.getMessage());
				fileName = "registerFailed.html";
			}
		}
		RequestDispatcher rd = req.getRequestDispatcher(fileName);
		rd.forward(req, resp);
	}
}
