    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<html>
 <head>
  <title> Login form </title> 
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
 <form name="form" action="login">
  <h1>Login Form</h1>  
  <label for="name">Username<sup>*</sup></label><br><br>
  <input type="text" id="name" name="name" value="" class="input" required><br><br>
  <label for="password">Password<sup>*</sup></label><br><br>
  <input type="text" id="password" name="password" value="" class="input" required><br><br>
   	<button type="submit" onClick="Submit()" value="login">Login</button>   
  </form>
  </div>
 </body>
</html>
        