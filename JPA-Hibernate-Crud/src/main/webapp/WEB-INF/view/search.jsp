<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
 body {
	background-color: #118594fc;
}

#btn-sub {
	margin-left: 72px;
	margin-top: 14px;
	width: 103px;
	height: 40px;
}
.star{
color:red;
} 

</style>
</head>
<body>
 
<div class="container">
		<div class="jumbotron" style="margin-top: 74px">
			<h3 style="margin-left: 105px">Search Customer Record</h3>
			<br>
			
			<h2 style="color:red">Pendig Search Functionality..............</h2>
			<form:form method="POST" name="search" action="searchRecord">
				<table style="margin-left: 108px">
					<tr>
						<td><form:label path="name">Search by Name <span class="star">*</span>&nbsp;</form:label></td>
						<td><form:input path="name" placeholder="Search  Name:"
								class="form-control" /></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" class="btn btn-default"
							id="btn-sub" value="Search"
							style="margin-top: 7px; margin-left: 125px" /></td>
					</tr>
				</table>
			</form:form>
		</div>
		<nav aria-label="...">
			<ul class="pager">
				<li><a href="/welcome">Previous</a></li>

			</ul>
		</nav>
	</div>

</body>
</html>