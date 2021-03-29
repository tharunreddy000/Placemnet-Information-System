<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="placementselection"  method="POST">
  <div class="container">
  
    <h1>APPRIOVE STUDENTS</h1>
    <hr>
    <input type="text" placeholder="Enter Student email" name="studentemail" required><br>
    <br>
    <button type="submit">approve</button>
    </form>
    
    
    <form action="deleteapplication" method="POST"> 
       <input type="text" placeholder="ReEnter Student email" name="reenteremail" required><br>
    <button type="submit">delete</button>
    </form>
 
  </div>

</body>
</html>