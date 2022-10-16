<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<html>
 <head>
  <title> Registration form </title> 
  <link rel="stylesheet" href="MyStyles.css">
  <script src="myjs.js"></script>
  <style>
  #div
{
 margin:10%;
 background-color:rgb(223,217,217);
 padding:2%;
	}
sup
{
color:red;
}
.input{
	width:70%;
	height:auto;
	padding:5px;
}

[type=submit]
{
color:white;
background-color:blue;
padding:5px;
border:none;
}
  </style>
 </head>
 <body>
 <div id="div">
 <form name="form" action = "register">
  <h1>Login Form</h1>  
  <label for="name">Your name<sup>*</sup></label><br><br>
  <input type="text" id="name" name="name" value="" class="input" required><br><br>
  <label for="Email">Email<sup>*</sup></label><br><br>
  <input type="text" id="email" name="email" value="" class="input" required><br><br>
   <label for="Password">Password<sup>*</sup></label><br><br>
  <input type="password" id="password" name="password" value="" class="input" required><br><br>
  <label for="gender">Gender<sup>*</sup></label><br>
   <input type="radio" name="radio" value="Female"><label>Female</label><br>
   <input type="radio" name="radio" value="male"><label>male</label><br><br>
   <label for="qualification">Qualification<sup>*</sup></label><br><br>
    <input type="text" id="qualification" name="qualification" value="" class="input" required><br><br>
    <label for="address">Address<sup>*</sup></label><br><br>
    <input type="text" id="address" name="address" value="" class="input" required><br><br>
    <label for="city">City<sup>*</sup></label><br><br>
    <input type="text" id="city" name="city" value="" class="input" required><br><br>
    <label for="state">State<sup>*</sup></label><br><br>
    <input type="text" id="state" name="state" value="" class="input" required><br><br>
     <label for="pin">Pincode<sup>*</sup></label><br><br>
    <input type="number" id="pin" name="pin" value="" class="input" required><br><br>
 
	<button type="submit" onClick="Submit()" value="signup" >SignUp</button>   
  </form>
  </div>
 </body>
</html>
        