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


<!-- Spring boot form tag lib  -->



<!-- Spring boot form tag lib over -->
<title>Insert title here</title>
<style>
body {
	background-color: gray;
}

#btn-sub {
	margin-left: 72px;
	margin-top: 14px;
	width: 103px;
	height: 40px;
}

#temp_btn {
	margin-top: 13px;
	text-decoration: none;
	margin-left: 66px;
	width: 103px;
	height: 39px;
}

.star {
	color: red;
}
</style>
</head>
<body>

	<div class="container">

		<div class="jumbotron" style="margin-top: 74px">
			<h3 style="margin-left: 105px">Customer Registration Form.</h3>
			<br>
			<form:form method="POST" action="/addCustomer">
				<table style="margin-left: 108px">
					<tr>
						<td><form:label path="id">Id<span class="star">*</span> &nbsp;</form:label></td>
						<td><form:input path="id" placeholder="Enter Customer Id."
								class="form-control" /></td>
						<td><a href="/update" id="btn-sub" class="btn btn-info"
							style="text-decoration: none">Update</a></td>
						<td><a href="delete" id="btn-sub" class="btn btn-danger"
							style="text-decoration: none">Delete</a>
						<td><a href="/getAllRecord" id="btn-sub"
							class="btn btn-default" style="text-decoration: none">View</a></td>
					</tr>
					<tr></tr>
					<tr>
						<td><form:label path="name">Name<span
									class="star">*</span>&nbsp;</form:label></td>
						<td><form:input path="name" placeholder="Enter Name:"
								class="form-control" style="    margin-top: -4px;" /></td>
						<td><a href="/searchPage" id="btn-sub"
							class="btn btn-warning" id="temp_btn"
							style="text-decoration: none">Search </a></td>
					</tr>
					<tr>
						<td><form:label path="address">Address<span
									class="star">*</span> &nbsp;</form:label></td>
						<td><form:input path="address" placeholder="Enter Address:"
								class="form-control" /><br /></td>
					</tr>
					<tr>
						<td><form:label path="phone">Phone<span
									class="star">*</span> &nbsp;</form:label></td>
						<td><form:input path="phone" style="    margin-top: -8px;"
								class="form-control" /><br /></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit"
							style="margin-top: -4px;" class="btn btn-success" id="btn-sub"
							value="Add" /></td>
					</tr>
				</table>
			</form:form>

		</div>


	</div>
	${wel}
</body>
</html>