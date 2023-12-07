<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>start page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar bg-dark border-bottom border-body"
		data-bs-theme="dark">
		<p class="navbar-brand">Pharmacy system</p>
		<a class="navbar-brand" href="logout">log out</a>
	</nav>
	<div class="container my-5 ">

		<a href="sales.jsp"
			class="btn btn-outline-success mb-4  d-grid gap-2 col-6 mx-auto">sales</a>

		<a href="addpurchases.jsp"
			class="btn btn-outline-success mb-4  d-grid gap-2 col-6 mx-auto">purchases</a>
		<div>
			<a href="addsupplier.jsp"
				class="btn btn-outline-secondary mb-4  d-grid gap-2 col-6 mx-auto">suppliers</a>

			<a href="invoice.jsp"
				class="btn btn-outline-secondary  mb-4  d-grid gap-2 col-6 mx-auto">point
				of sales</a>
		</div>
	</div>

</body>
</html>