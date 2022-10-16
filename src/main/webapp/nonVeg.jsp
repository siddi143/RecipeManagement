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
.container {
	max-width: 640px;
	margin: 30px auto;
	background: #fff;
	border-radius: 8px;
	padding: 20px;
}
.comment {
	display: block;
	transition: all 1s;
}
.commentClicked {
	min-height: 0px;
	border: 1px solid #eee;
	border-radius: 5px;
	padding: 5px 10px
}
.container textarea {
	width: 100%;
	border: none;
	background: #E8E8E8;
	padding: 5px 10px;
	height: 50%;
	border-radius: 5px 5px 0px 0px;
	border-bottom: 2px solid #016BA8;
	transition: all 0.5s;
	margin-top: 15px;
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
 <form name="form" action="nonveg">
  <h1>Non Veg Recipe Form</h1>  
  <label for="name">Name of the Recipe<sup>*</sup></label><br><br>
  <input type="text" id="name" name="name" value="" class="input" required><br><br>
  <label for="ingredients">Ingredients<sup>*</sup></label><br><br>
  <input type="text" id="ingredients" name="ingredients" value="" class="input" required><br><br>
   <section id="app">
    <div class="container">
      <div class="row">
        <div class="col-6">
          <div class="comment">
        <p v-for="items in item" v-text="items"></p>
          </div><!--End Comment-->
          </div><!--End col -->
          </div><!-- End row -->
      <div class="row">
        <div class="col-6">
      <textarea type="text" class="input" value="" placeholder="Descrption about the receipe" v-model="newItem" @keyup.enter="addItem()"></textarea>
      </div><!-- End col -->
      </div><!--End Row -->
    </div><!--End Container -->
  </section><!-- end App -->
	<button type="submit" onClick="Submit()" value="signup">SignUp</button>   
  </form>
  </div>
 </body>
</html>