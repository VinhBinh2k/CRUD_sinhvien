package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDAO;

@WebServlet(urlPatterns = { "/delete" })
public class DeleteController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("sid");
		StudentDAO dao = new StudentDAO();
		dao.delete(id);
		resp.sendRedirect("getAll");
		//delete xong phải trở về servlet getAll để trả dữ liệu lên đó chứ không trở về trang giao diện
		//liền được
	}
}
