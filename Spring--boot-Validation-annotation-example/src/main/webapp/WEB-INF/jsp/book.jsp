<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- Bootstrap core CSS -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Material Design Bootstrap -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.5.9/css/mdb.min.css"
	rel="stylesheet">

<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!-- Bootstrap tooltips -->
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.13.0/umd/popper.min.js"></script>
<!-- Bootstrap core JavaScript -->
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.min.js"></script>
<!-- MDB core JavaScript -->
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.5.9/js/mdb.min.js"></script>
<style>
body {
	background-color: rgba(158, 158, 158, 0.57);
}

.container {
	margin-top: 64px;
}

selected {
	text-align: center;
}
</style>
</head>

<body>
	<div class="container">
		<div class="jumbotron">
			<div class="card">
				<div class="card-body" style="background-color: #38a7d0b8;">
					<h3 style="text-align: center;">Book Registration Application</h3>
				</div>
			</div>
			<br /> <br />
			<form:form action="addBookInfo" method="post" name="bookForm">
				<div class="row">
					<div class="col-md-6">
						<form:input path="bookName" placeholder="Enter Book Name:"
							class="form-control" />
					</div>
					<div class="col-md-6">
						<form:input path="publisher" placeholder="Enter Book publisher Name:"
							class="form-control" />
					</div>
				</div>

				<br />
				<div class="row">
					<div class="col-md-6">
						<form:input path="author" placeholder="Enter Book author name:"
							class="form-control" />
					</div>
					<div class="col-md-6">
						<form:input path="isbn" placeholder="Enter Book isbn number:"
							class="form-control" />
					</div>
				</div>

				<br />


				<div class="row">
					<div class="col-md-6">


						<form:select path="copyrightYear" class="form-control">
							<form:option value="2018" label="Select Book Copyright Year" />
							<form:option value="2017">2017</form:option>
							<form:option value="2016">2016</form:option>
							<form:option value="2015">2015</form:option>
							<form:option value="2014">2014</form:option>
							<form:option value="2013">2013</form:option>
							<form:option value="2012">2012</form:option>
						</form:select>

					</div>
					<div class="col-md-6">
						<form:select path="copyrightYear" class="form-control">
							<form:option value="2018" label="Select Book Language" />
							<form:option value="2017">English</form:option>
							<form:option value="2016">Hindi</form:option>
							<form:option value="2015">Gujrati</form:option>
							<form:option value="2014">Urdu</form:option>
						</form:select>

					</div>
				</div>

				<br />
				<div class="row">
					<div class="col-md-6">
						<label>Video Copy</label>
						<form:radiobutton path="videoCopy" value="True" />
						True

						<form:radiobutton path="videoCopy" value="False" />
						False
					</div>
					<div class="col-md-6">
						<label>Abridged</label>
						<form:radiobutton path="abridged" value="True" />
						True

						<form:radiobutton path="abridged" value="False" />
						False
					</div>

				</div>



				<br />

				<div class="row">
					<div class="col-md-6">
						<form:input path="editor" placeholder="Enter Book editor name:"
							class="form-control" />
					</div>
					<div class="col-md-6">
						<form:input path="illustrator"
							placeholder="Enter Book illustrator :" class="form-control" />
					</div>
				</div>
				<br />
				<div class="row">
					<div class="col-md-6">
						<form:input path="bookEdition"
							placeholder="Enter Book bookEdition :" class="form-control" />
					</div>
					<div class="col-md-6">
						<form:input path="url" placeholder="Enter Book Online url :"
							class="form-control" />
					</div>
				</div>
				<br />
				<div class="row">
					<div class="col-md-12">

						<form:textarea path="about" rows="5" class="form-control"
							placeholder="Enter Book description :" />
					</div>

				</div>
				<div class="row">
					<div class="col-md-12">
						<input type="submit" class="btn btn-info"
							style="text-align: center; width: 280px" id="btn-sub"
							value="Add Book" />
					</div>
				</div>
			</form:form>
		</div>
	</div>

</body>
</html>