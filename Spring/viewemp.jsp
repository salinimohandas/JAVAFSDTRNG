    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
	
	
	
    <style><%@include file="/main.css"%></style>
	
	<h1>Employees List</h1>
	<table border="2" width="70%" cellpadding="2">
	<style>
	 #customer th {
	
	padding-top: 12px;
	padding-bottom: 12px;
	test-align:left;
	background-color: #4CAF50;
	color:white;
	}
	</style>
	<tr><th>Id</th><th>Name</th><th>Salary</th><th>Designation</th><th>Address</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="emp" items="${list}"> 
    <tr>
    <td>${emp.id}</td>
    <td>${emp.name}</td>
    <td>${emp.salary}</td>
    <td>${emp.designation}</td>
     <td>${emp.address}</td>
    <td><a href="editemp/${emp.id}">Edit</a></td>
    <td><a href="deleteemp/${emp.id}">Delete</a></td>
    </tr>
    
    </c:forEach>
    </table>
    <br/>
    <a href="empform">Add New Employee</a>