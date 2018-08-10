<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Bootstrap CDN links  -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- End of Bootstrap CDN Link -->

<title>Insert title here</title>
<style>
body {
	background-color: #333;
}
</style>
</head>
<body>
		<div class="container">

		<div class="jumbotron" style="margin-top: 74px">
			<h3 style="margin-left: 105px">Customer Registration Form.</h3>
			<br>
			<form:form method="POST" action="/updateRecord">
				<table style="margin-left: 108px">

					<tr>
						<td><form:label path="id">id<span class="s	tar">*</span>&nbsp;</form:label></td>
						<td><form:input path="id" placeholder="Enter Customer Id:"
								class="form-control" /></td>
					</tr>
					<tr>
						<td><form:label path="name">Name<span
									class="star">*</span>&nbsp;</form:label></td>
						<td><form:input path="name" placeholder="Enter Name:"
								class="form-control" /><br/></td>
					</tr>
					<tr>
						<td><form:label path="address">Address<span
									class="star">*</span> &nbsp;</form:label></td>
						<td><form:input path="address" placeholder="Enter Address:"
								class="form-control" /><br/></td>
					</tr>
					<tr>
						<td><form:label path="phone">Phone<span
									class="star">*</span> &nbsp;</form:label></td>
						<td><form:input path="phone" class="form-control" /><br/></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" class="btn btn-success"
							id="btn-sub" value="Update Record" /></td>
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