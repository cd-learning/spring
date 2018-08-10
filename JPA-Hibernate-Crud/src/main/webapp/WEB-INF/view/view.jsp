<%@page import="java.util.List"%>
<%@page import="com.example.demo.model.Student"%>
<%@page import="java.util.List.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	background-color: #286090e0;
}
th{
color: #31708f;
font-weight: bold;
    font-size: 18px;
}

</style>
</head>
<body>
	<div class="container">
	   	<div class="jumbotron" style="margin-top: 74px">
	<%
		List<Student> listStu = (List<Student>) request.getAttribute("listStudent");
	List<Student> searchStudentList = (List<Student>) request.getAttribute("searchStudentList");
	if(listStu.size() > 0)
	{
		%>
	
 		<table class="table table-hover">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Customer Id</th>
					<th scope="col">Customer Name</th>
					<th scope="col">Customer Address</th>
					<th scope="col">Customer Phone Number</th>
				</tr>
			</thead>
			<tbody>
				<%
					for (int i = 0; i < listStu.size(); i++) {
				%>
				<tr>
			 
					<td><%=listStu.get(i).getId()%></td>
					<td><%=listStu.get(i).getName()%></td>
					<td><%=listStu.get(i).getAddress()%></td>
					<td><%=listStu.get(i).getPhone()%></td>
				</tr>

				<%
					}
				%>
			</tbody>
		</table>
	
		
		<% 
		
	}
	else{
	
		%>
		<table class="table table-hover">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Customer Id</th>
					<th scope="col">Customer Name</th>
					<th scope="col">Customer Address</th>
					<th scope="col">Customer Phone Number</th>
				</tr>
			</thead>
			<tbody>
				<%
					for (int i = 0; i < searchStudentList.size(); i++) {
				%>
				<tr>
			 
					<td><%=searchStudentList.get(i).getId()%></td>
					<td><%=searchStudentList.get(i).getName()%></td>
					<td><%=searchStudentList.get(i).getAddress()%></td>
					<td><%=searchStudentList.get(i).getPhone()%></td>
				</tr>

				<%
					}
				%>
			</tbody>
		</table>
		
		<% 
	}
	
	%>
 
		</div>
		<nav aria-label="...">
			<ul class="pager">
				<li><a href="/welcome">Previous</a></li>

			</ul>
		</nav>

	</div>
</body>
</html>