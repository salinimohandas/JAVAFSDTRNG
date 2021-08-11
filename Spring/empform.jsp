<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
  
  <!DOCTYPE html>
 <head>
 <title>Edit Page</title> 
<link rel="stylesheet" type="text/css" href="style.css"/>
<style>
h1{
color:red;}
body{
background-color:#ff8080;
}
#submit{
background-color:red;
color:black;
border-radius:20px;
}
</style>

		<h1>Add New Employee</h1>
       <form:form method="post" action="save">  
      	<table >  
         <tr>  
          <td>Name : </td> 
          <td><form:input path="name"  /></td>
         </tr>  
         <tr>  
          <td>Salary :</td>  
          <td><form:input path="salary" /></td>
         </tr> 
         <tr>  
          <td>Designation :</td>  
          <td><form:input path="designation" /></td>
         </tr> 
          
         <tr>  
          <td>Address : </td> 
          <td><form:input path="address"  /></td>
         </tr> 
         <tr> 
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
