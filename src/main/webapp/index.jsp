<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link href="css/basic.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>

<!-- navbar -->
<%@ include file="navbar.jsp" %>

<div class="container-fluid p-0 m-0">

<div class="jumbotron primary-background text-white"> 	

<div class="container">

<h3 class="display-3">Welcome to Expenseso</h3>
<p>Expenseso is a way to manage and grow your money. 
Here you maintain all your transactions in a systematic manner. It's a way to know how much you spend and on which things you spend the most.
</p>

<p>
If you want to try this application just start now. Click on Start now button and enter to our family. Thank you...
</p>

<a href="register_page.jsp" class="btn btn-outline-light btn-lg"> <span class="fa fa-bell-o"></span> Start ! its Free</a>
<a href="login_page.jsp" class="btn btn-outline-light btn-lg"><span class="fa fa-user-circle fa-spin"></span> Login</a>

</div>

</div>

</div>

</body>
</html>	