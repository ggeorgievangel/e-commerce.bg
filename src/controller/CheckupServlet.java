package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.dao.UserDao;

@WebServlet("/check")
public class CheckupServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// returns all users to the client
		ArrayList<User> allUsers = UserDao.getInsnce().getAllUsers();
		resp.getWriter().append(allUsers.toString());
	}
	
}
