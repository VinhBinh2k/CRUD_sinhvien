package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import connection.DBContext;
import model.StudentModel;

public class StudentDAO {

	Connection conn = null;
	PreparedStatement statement = null;
	ResultSet rs = null;

	public List<StudentModel> findAll() {
		List<StudentModel> listStudent = new ArrayList<>();
		String sql = "select * from student";
		try {
			conn = new DBContext().getConnection();
			statement = conn.prepareStatement(sql);
			rs = statement.executeQuery();
			while (rs.next()) {
				StudentModel std = new StudentModel();
				std.setStudentID(rs.getInt("studenID"));
				std.setName(rs.getString("name"));
				std.setGender(rs.getString("gender"));
				std.setDob(rs.getDate("dob"));
				listStudent.add(std);
			}
			return listStudent;
		} catch (Exception e) {
			return null;
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				return null;
			}
		}

	}

	public void delete(String id) {
		String sql = "delete student  where  studenID = ?";
		try {
			conn = new DBContext().getConnection();
			statement = conn.prepareStatement(sql);
			statement.setString(1, id);
			statement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void insert(String name, String gender, String dob) {
		String sql = "insert into student (name, gender, dob) values(?, ?, ?)";
		try {
			conn = new DBContext().getConnection();
			statement = conn.prepareStatement(sql);
			statement.setString(1, name);
			statement.setString(2, gender);
			statement.setString(3, dob);
			statement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public StudentModel getStudentById(String id) {
		StudentModel std = new StudentModel();
		String sql = "select * from student where studenID = ?";
		try {
			conn = new DBContext().getConnection();
			statement = conn.prepareStatement(sql);
			statement.setString(1, id);
			rs = statement.executeQuery();
			while(rs.next()) {
				std.setStudentID(rs.getInt("studenID"));
				std.setName(rs.getString("name"));
				std.setGender(rs.getString("gender"));
			    std.setDob(rs.getDate("dob"));
				
//				return new StudentModel( rs.getInt("studenID"), 
//						rs.getString("name"), 
//						rs.getString("gender"),
//						rs.getDate("dob"));
			    
			}
			return std;
		} catch (Exception e) {
			return null;
		}
	}
	
//	update dbo.student 
//	set name = ?, gender=?, dob=? where studenID = 14

	public void updateStudent(String id, String name, String gender, String dob) {
		String sql = "update dbo.student set name = ?, gender=?, dob=? where studenID = ?";
		try {
			conn = new DBContext().getConnection();
			statement = conn.prepareStatement(sql);
			statement.setString(1, name);
			statement.setString(2, gender);
			statement.setString(3,  dob);
			statement.setString(4, id);
			statement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
					
	}
	
}
