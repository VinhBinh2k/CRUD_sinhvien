
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
<!--   
	<form action="add" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type="radio" name="gender" value="nam">Male
					<input type="radio" name="gender" value="nu">Female</td>
			</tr>
			<tr>
				<td>Dob</td>
				<td><input type="text" name="dob" /></td>
			</tr>
			<tr>
				<td></td>
				<td><button type="submit">Add student</button></td>
			</tr>
		</table>
	</form>
-->


	<form action="add" method="post">
		<div class="form-group row mx-sm-3 mb-2">
			<label for="exampleInputEmail1" class="col-sm-1 col-form-label">Name</label> 
			<div class="col-sm-11">
				<input type="text" class="form-control" placeholder="Name" name="name">
			</div>
		</div>
		
		<div class="form-group row mx-sm-3 mb-2">
			<label for="exampleInputEmail1" class="col-sm-1 col-form-label">Gender</label> 
			<div class="col-sm-11">
				<input type="text" class="form-control" placeholder="Gender" name="gender">
			</div>
		</div>
		
		<div class="form-group row mx-sm-3 mb-2">
			<label for="exampleInputEmail1" class="col-sm-1 col-form-label">Day of birth</label> 
			<div class="col-sm-11">
				<input type="text" class="form-control" placeholder="Day of birth" name="dob">
			</div>
		</div>
		
		<button type="submit" class="btn btn-primary">Add student</button>
	</form>


</body>
</html>
