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
</head>
<body>
	<div class="container">
		<div class="jumbotron" style="margin-top: 74px">
			<h3 style="margin-left: 105px">Delete Customer Record</h3>
			<br>
			<form:form method="POST" name="deleteForm" action="deleteRecord">
				<table style="margin-left: 108px">
					<tr>
						<td><form:label path="id">Id<span class="star">*</span>&nbsp;</form:label></td>
						<td><form:input path="id" placeholder="Enter Name:"
								class="form-control" /></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" class="btn btn-danger"
							id="btn-sub" value="Delete"
							style="margin-top: 7px; margin-left: 21px" /></td>
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