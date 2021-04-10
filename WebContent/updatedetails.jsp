	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="qwerty.user" %>
 <!DOCTYPE html>
<html>
  <head>
    <title>Training Application Form</title>
    <style>
      html, body {
      min-height: 100%;
      }
      body, div, form, input, select, p { 
      padding: 0;
      margin: 0;
      outline: none;
      font-family: Roboto, Arial, sans-serif;
      font-size: 14px;
      color: #666;
      line-height: 22px;
      }
      h1 {
      position: absolute;
      margin: 0;
      font-size: 32px;
      color: #fff;
      z-index: 2;
      }
      h2 {
      font-weight: 400;
      }
      .testbox {
      display: flex;
      justify-content: center;
      align-items: center;
      height: inherit;
      padding: 20px;
      }
      form {
      width: 100%;
      padding: 20px;
      border-radius: 6px;
      background: #fff;
      box-shadow: 0 0 20px 0 #095484; 
      }
      .banner {
      position: relative;
      height: 210px;
      background-image: url("/uploads/media/default/0001/01/3f0d2969f2cffeb123ab1a6fa7408bf87bd34bd3.jpeg");  
      background-size: cover;
      display: flex;
      justify-content: center;
      align-items: center;
      text-align: center;
      }
      .banner::after {
      content: "";
      background-color: rgba(0, 0, 0, 0.4); 
      position: absolute;
      width: 100%;
      height: 100%;
      }
      input, select {
      margin-bottom: 10px;
      border: 1px solid #ccc;
      border-radius: 3px;
      }
      input {
      width: calc(100% - 10px);
      padding: 5px;
      }
      select {
      width: 100%;
      padding: 7px 0;
      background: transparent;
      }
      .item:hover p, .item:hover i, .question:hover p, .question label:hover, input:hover::placeholder, a {
      color: #095484;
      }
      .item input:hover, .item select:hover {
      border: 1px solid transparent;
      box-shadow: 0 0 6px 0 #095484;
      color: #095484;
      }
      .item {
      position: relative;
      margin: 10px 0;
      }
      input[type="date"]::-webkit-inner-spin-button {
      display: none;
      }
      .item i, input[type="date"]::-webkit-calendar-picker-indicator {
      position: absolute;
      font-size: 20px;
      color: #a9a9a9;
      }
      .item i {
      right: 2%;
      top: 30px;
      z-index: 1;
      }
      [type="date"]::-webkit-calendar-picker-indicator {
      right: 1%;
      z-index: 2;
      opacity: 0;
      cursor: pointer;
      }
     .btn-block {
      margin-top: 10px;
      text-align: center;
      }
      button {
      width: 150px;
      padding: 10px;
      border: none;
      border-radius: 5px; 
      background: #095484;
      font-size: 16px;
      color: #fff;
      cursor: pointer;
      }
      button:hover {
      background: #0666a3;
      }
      @media (min-width: 568px) {
      .name-item, .city-item {
      display: flex;
      flex-wrap: wrap;
      justify-content: space-between;
      }
      .name-item input, .city-item input {
      width: calc(50% - 20px);
      }
      .item{
        width:520px;
      }
      .city-item select {
      width: calc(50% - 8px);
      }
      }
    </style>
  </head>
  <body>
    <div class="testbox">
      <form action="apply" method="post">
        <div class="banner">
          <h1>Training Application Form</h1>
        </div>
        <%
        user u =(user) request.getAttribute("u");
        %>
        <div class="item">
          <p>Name</p>
          <div class="name-item">
            <input type="text" name="name"  value="<%=u.getName() %>"/>
          </div>
        </div>
        <div class="item">
          <p>Mobile Number:</p>
          <input type="text" name="mobilenumber" value="<%=u.getMobile() %>"/>
        </div>
        <div class="item">
          <p>Email:</p>
          <input type="text" name="email"  value="<%=u.getEmail1() %>"/>
        </div>
        <div class="item">
          <p>AADHAR CARD NUMBER:</p>
          <input type="text" name="adhar"  value="<%=u.getAdar() %>"/>
        </div>
         <div class="item">
          <p>Date of Birth</p>
          <input type="date" name="bdate" value="<%=u.getDob() %>"/>
          <i class="fas fa-calendar-alt"></i>
        </div>
        <div class="item">
          <p>Address:</p>
          <input type="text" name="address" value="<%=u.getAdd() %>"/>
        </div>
      
        <div class="item">
          <p>Branch:</p>
        <div class="city-item">
            	
            <select name="branch" >
            <option value="" disabled selected hidden>Choose Your branch</option>
              <option value="CSE">CSE</option>
              <option value="ECE">ECE</option>
              <option value="MSC">MSC</option>
              <option value="BSC">BSC</option>
              <option value="MECH">MECH</option>
            </select>
          </div>
        </div>
        
     
        <div class="item">
          <p>CGPA:</p>
          <input type="text" name="CGPA" value="<%=u.getCgpa() %>"/>
        </div>
        <div class="item">
          <p>Certificate Link:</p>
          <input type="text" name="Link" value="<%=u.getLink() %>"/>
        </div>
        <div class="item">
          <p>Choose your category:</p>
          <div class="city-item">
            
            <select name="category" style="width:300px">
			<option value="" disabled selected hidden>Choose Your Degree</option>
           <option value="UG">UG</option>
           <option value="PG">PG</option>
            </select>
          </div>
        </div>
        
       
        <div class="btn-block">
          <button type="submit">Update</button>
        </div>
      </form>
    </div>
  </body>
</html>