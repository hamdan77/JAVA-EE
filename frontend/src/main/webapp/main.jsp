<%@ page import="java.util.*" %>
<%@ page import="de.uniba.dsg.dsam.model.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bamberg Beverage</title>

<!-- Bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>

<body style="background-color: #6D7B8A">
	
<form role="form" action="BeveragesServlet" method="GET">

<div class="container">

		<h1 style="color: white">Welcome to Bamberg Beverage Store</h1>
		<div class="row row-content">
		<div class="col-sm-2">
		
		<p><a  href="/frontend/beverageCreation" class="btn btn-primary">Create Beverages</a></p>
		<p><a  href="/frontend/BeveragesServlet" class="btn btn-primary">View beverages</a></p>
		<p><a  href="/frontend/PlaceOrder" class="btn btn-primary">Place Order</a></p>
		<p><a  href="/frontend/ViewOrders" class="btn btn-primary">View Orders</a></p>
		
		<p><a  href="/frontend/incentiveCreation" class="btn btn-primary">Create Incentives</a></p>
		<p><a  href="/frontend/IncentiveServlet" class="btn btn-primary">Manage Incentives</a></p>
		
		</div>
		</div>
	</div>
	
</form>
 	
</body>
</html>
