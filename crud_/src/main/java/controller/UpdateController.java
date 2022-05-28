package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDAO;
import model.StudentModel;

@WebServlet(urlPatterns = {"/update"})
public class UpdateController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("sid");
		StudentDAO dao = new StudentDAO();
		StudentModel std = dao.getStudentById(id);
		req.setAttribute("st", std);
		req.getRequestDispatcher("view/Update.jsp")
		.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sid = req.getParameter("id");
		String sname = req.getParameter("name");
		String sgender = req.getParameter("gender");
		String sdob = req.getParameter("dob");
		
		StudentDAO dao = new StudentDAO();
		dao.updateStudent(sid, sname, sgender, sdob);
		resp.sendRedirect("getAll");
	}
}
