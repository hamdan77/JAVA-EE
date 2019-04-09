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

<title>Edit Incentives</title>
</head>
<body>
<div class="container">
<div class="row row-content">
<h2>Incentive Editor</h2>


<%  Incentive bev = (Incentive) request.getAttribute("myinc"); %>

		<form role="form" action="/frontend/EditIncentive" method="post">	
		
		<input type="hidden" name="id" value="<%= bev.getId() %>" >
		
		<div class="form-group">
				<div class="input-group">
					<span class="input-group-addon">Incentive Name</span>
					<input name="name" type="text" class="form-control" value="<%= bev.getName() %>">
				</div>
			
			</div>
			
			<a href="/frontend/IncentiveServlet" class="btn btn-default">Cancel</a>
			<button type="submit" class="btn btn-success">Save</button>
			
			
			
		</form>		


</div>

</div>


</body>
</html>