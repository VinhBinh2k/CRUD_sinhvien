package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDAO;

@WebServlet(urlPatterns = {"/add"})
public class AddController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("view/Add.jsp")
		.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String sname = req.getParameter("name");
		String sgender = req.getParameter("gender");
		String sdob = req.getParameter("dob");
		
		StudentDAO dao = new StudentDAO();
		dao.insert(sname, sgender, sdob);
		resp.sendRedirect("getAll");
	}
}
