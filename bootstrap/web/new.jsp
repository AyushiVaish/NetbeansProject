<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
		<style>
		header {
		background-color:black;
		color:"white";
		size:"80px";
		}
		</style>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <header style="background:black;color:white;"><h1 align="center">FOODUDE</h1></header>
	 <header><marquee><h2 style="color:white; background:red">Welcome to our website </h2></marquee></header>
       <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">Menu<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Veg</a></li>
			<li><a href="#">Non-Veg</a></li>
            <li><a href="#">Offer</a></li>
            <li><a href="#">Exit</a></li>
          </ul>
        </li>
        <li><a href="#">Discount</a></li>
        <li><a href="#">Exit</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>
<!--Carousel-->
<div class="container">
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">

      <div class="item active">
        <img  alt="Los Angeles" style="width:100%;">
        <div class="carousel-caption">
          <h3>Pasta Sauce Recipe</h3>
          <p>Try it!!</p>
        </div>
      </div>

      <div class="item">
        <img src="2.jpg" alt="Chicago" style="width:100%;">
        <div class="carousel-caption">
          <h3>Recipes for left over rice...</h3>
          <p>Make your taste bud yuumm!</p>
        </div>
      </div>
    
      <div class="item">
        <img src="3.jpg" alt="New York" style="width:100%;">
        <div class="carousel-caption">
          <h3>Soup without recipe</h3>
          <p>Time to open your mind and cook the yum one!</p>
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
  
		<h2>Pizza</h2>
		<img src="pizza.jpg">
		<h2>Salad</h2>
		<img src="salad.jpg">
		<h2>Soup</h2>
		<img src="soup.jpg">
        <p>Press the key <kbd>Ctrl+S</kbd></p>
		<footer style="background:black; color:red; font-size:50px; text-align:center;"><b>I hope you enjoyed</b></footer>
    </body>
</html>

