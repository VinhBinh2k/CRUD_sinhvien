
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <form action="update" method="post">
            <table>
                <tr>
                    <td>ID</td>
                    <td>
                        <input value="${st.getStudentID()}" type="text" name="id" readonly>
                    </td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td>
                        <input value="${st.getName()}" type="text" name="name">
                    </td>
                </tr>
                
                
                <tr>
                    <td>Gender</td>
                    <td>
                        <input value="${st.getGender()}" type="text" name="gender">
                    </td>
                </tr>
                
                <tr>
                    <td>Dob</td>
                    <td><input value="${st.getDob()}" type="text" name="dob"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><button class="btn btn-success" type="submit">Update</button></td>
                </tr>
            </table>
        </form>
        
        -->
        
   
   <form action="update" method="post">
   		<div class="form-group row mx-sm-3 mb-2">
			<label for="exampleInputEmail1" class="col-sm-1 col-form-label">Id</label> 
			<div class="col-sm-11">
				<input type="text" class="form-control" value="${st.getStudentID()}" name="id" readonly>
			</div>
		</div>
		
		<div class="form-group row mx-sm-3 mb-2">
			<label for="exampleInputEmail1" class="col-sm-1 col-form-label">Name</label> 
			<div class="col-sm-11">
				<input type="text" class="form-control" value="${st.getName()}"  name="name">
			</div>
		</div>
		
		<div class="form-group row mx-sm-3 mb-2">
			<label for="exampleInputEmail1" class="col-sm-1 col-form-label">Gender</label> 
			<div class="col-sm-11">
				<input type="text" class="form-control" value="${st.getGender()}"  name="gender">
			</div>
		</div>
		
		<div class="form-group row mx-sm-3 mb-2">
			<label for="exampleInputEmail1" class="col-sm-1 col-form-label">Day of birth</label> 
			<div class="col-sm-11">
				<input type="text" class="form-control" value="${st.getDob()}"  name="dob">
			</div>
		</div>
	
		<button type="submit" class="btn btn-primary">Update</button>
   
   </form>
		
	
        
        
    </body>
</html>
