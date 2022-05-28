package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDAO;
import model.StudentModel;

@WebServlet("/getAll")
public class HomeController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		StudentDAO dao = new StudentDAO();
		List<StudentModel> list = dao.findAll();
		req.setAttribute("lists", list);
		req.getRequestDispatcher("view/Home.jsp")
			.forward(req, resp);
	}
}
