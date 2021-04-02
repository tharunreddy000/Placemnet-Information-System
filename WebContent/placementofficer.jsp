<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<style>
.button{
  height: 2px;
  position: relative;
  border: 3px solid green;
}
.button {
  margin: 0;
  position: absolute;
  top: 50%;
  -ms-transform: translateY(-50%);
  transform: translateY(-50%);
}
input[type=text],[type=password] {
  width: 15%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
}


input[type=text],[type=password] {
  border: 2px solid black;
  border-radius: 4px;
}
</style>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="placementselection"  method="POST">
  <div class="container">
  
    <h1>APPROVE STUDENTS</h1>
    <hr>
    <input type="text" placeholder="Enter Student email" name="studentemail" required>
    <button type="submit">Approve</button>
    </form>
    
    
    <form action="deleteapplication" method="POST"> 
       <input type="text" placeholder="Enter Student email" name="reenteremail" required>
    <button type="submit">Reject</button>
    </form>
 
  </div>

</body>
</html>