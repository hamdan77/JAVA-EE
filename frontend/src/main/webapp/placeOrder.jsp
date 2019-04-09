<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="de.uniba.dsg.dsam.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">


<!-- Bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

<title>Place Order</title>



</head>
<body>



<div class="container"> 
<div class="row row-content">
<h2>Place your order</h2>
<div class="col-sm-3">

<form role="form" action="PlaceOrder" method="post">

  <div class="form-group">
  
    <label>Beverage Name</label>
    <input type="text" class="form-control .col-sm-*" name="BeverageName">
  </div>
  <div class="form-group">
    <label>Manufacturer Name</label>
    <input type="text" class="form-control inputsm" name="ManufacturerName">
  </div>
  
  
  
  <div class="form-group">
  <label>Required Quantity</label>
  <input type="text" class="form-control inputsm" name="quantity">
  </div>
  
  <button type="submit" class="btn btn-default">Submit</button>
</form>
</div>

</div>

<!-- displaying all beverages to the customer -->
<div class="row row-content">
	<h2>All available Beverages at our store</h2>
		<div class="col-md-3"><h4>Manufacturer Name</h4></div>
		<div class="col-md-2"><h4>Name</h4></div>
	
		<div class="col-md-2"><h4>Quantity</h4></div>
		<div class="col-md-2"><h4>Price</h4></div>
</div>

	<%  
		List<Beverage> beverages = (List<Beverage>) request.getAttribute("beverageList");
		
		for(Beverage bev: beverages) { 
		%>
		<div class="row">
			
			<div class="col-md-3"><h4><%= bev.getManufacturer() %></h4></div>
			<div class="col-md-2"><h4><%= bev.getName() %></h4></div>
			
			<div class="col-md-2"><h4><%= bev.getQuantity() %></h4></div>		
			<div class="col-md-2"><h4><%= bev.getPrice() %></h4></div>		
			
			
			
		</div>
		<% } %>




</div>




</body>
</html>
