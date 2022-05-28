<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

</head>
<body>

	<table class="table">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Name</th>
				<th scope="col">Gender</th>
				<th scope="col">Day of birth</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${lists}" var="x">
				<tr>
					<td>${x.getStudentID()}</td>
					<td>${x.getName()}</td>
					<td>${x.getGender()}</td>
					<td>${x.getDob()}</td>
					<td>
						<button type="button" class="btn btn-success">
							<a href="update?sid=${x.getStudentID()}">Update</a> 
						</button>
					
						 <button type="button" class="btn btn-danger">
						 	<a href="#" onclick="showMesage(${x.getStudentID()})">Delete</a>
						 </button>
						
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<button type="button" class="btn btn-warning">
		<a href="add">Create student</a>
	</button>
	

	<script>
         	function showMesage(id) {
				var option = confirm('are you sure');
				if(option === true){
					window.location.href = 'delete?sid='+id;
				}
			}
         </script>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>

</body>
</html>