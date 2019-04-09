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

<title>Assign Incentives</title>
</head>

<body>
<div class="container">
<div class="row row-content">
	
		<div class="col-md-2"><h4>Incentive Name</h4></div>
		<div class="col-md-2"><h4>Incentive Type</h4></div>
		
</div>


<%  

	 String x = String.valueOf(request.getAttribute("BeverageId"));



		List<Incentive> incentives = (List<Incentive>) request.getAttribute("incentiveList");
		%>
		<form role="form" action="AssignIncentive" method="post">
			<h4   hidden name="BeverageId"><%= x %></h4>
		<%
		for(Incentive inc: incentives) { 
			
		
		%>
		
		
			<h4   hidden name="IncentiveId"><%= inc.getId()%></h4>
		<div class="row ">
		
				
			
			<div class="col-md-2"><h4  name="IncentiveName"><%= inc.getName()%></h4></div>
			
			
			 <div class="col-md-2 radio">
  <label><input type="radio" name="IncentiveType" value = "<%= inc.getIncentiveType()%>" ><%= inc.getIncentiveType()%></label>
</div>
			
			</div>
		
		<% }%>
		
<div class="row row-content">

<div class="col-md-2 radio">
  <label><input type="radio" name="IncentiveType" value="None" checked>None</label>
</div>

 </div>
		 <button type="submit" class="btn btn-default">Assign</button>	 
</form>


</div>
</body>
</html>