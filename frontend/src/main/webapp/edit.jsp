<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

<title>Edit Beverages</title>
</head>
<body>
<div class="container">
<div class="row row-content">
<h2>Beverages Editor</h2>

<%  Beverage bev = (Beverage) request.getAttribute("mybev"); %>
		<form role="form" action="/frontend/EditBeverages" method="post">
			<input type="hidden" name="bev_id" value="<%= bev.getId() %>">
			
			
			
			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">Beverage Name</span>
					<input name="bev_name" type="text" class="form-control" value="<%= bev.getName() %>">
				</div>
			</div>
			
			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">Manufacturer Name</span>
					<input name="bev_manufacturer" type="text" class="form-control" value="<%= bev.getManufacturer() %>">
				</div>
			</div>
			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon"></span>
					<input hidden name="bev_promotion" type="hidden" class="form-control" value="<%=  bev.getPromotion() %>">
				</div>
			</div>
			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">Quantity</span>
					<input name="bev_quantity" type="text" class="form-control" value="<%= bev.getQuantity() %>">
				</div>
			</div>
			<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">Price</span>
					<input name="bev_price" type="text" class="form-control" value="<%= bev.getPrice() %>">
				</div>
			</div>
		
			<a href="/frontend/BeveragesServlet" class="btn btn-default">Cancel</a>
			<button type="submit" class="btn btn-success">Save</button>
		</form>		
</div>

</div>


</body>
</html>