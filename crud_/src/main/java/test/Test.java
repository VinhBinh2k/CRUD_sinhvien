package test;

import dao.StudentDAO;
import model.StudentModel;

public class Test {
	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		StudentModel std = dao.getStudentById("5");
		System.out.println("thong tin: "+std);
	}
}
