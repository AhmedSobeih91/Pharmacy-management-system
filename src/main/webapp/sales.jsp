<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>sales</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<div class="container my-5 ">
		<div
			class="col-lg-6 col-md-10 col-sm-6 container justify-content-center card  my-3">
			<h2 class="text-center mb-0">Search with invoice number</h2>
			<form action="search_inv_num.jsp" method="get">
				<input type="text" name="inv_num" class="form-control mb-3">
				<input type="submit" value="search"
					class="btn btn-secondary d-grid gap-2 col-6 mx-auto mb-3">
			</form>
		</div>
	</div>
	<div class="container my-2 ">
		<div
			class="col-lg-6 col-md-10 col-sm-6 container justify-content-center card  my-3">
			<h2 class="text-center mb-0">Search with invoice date</h2>
			<form action="search_inv_date.jsp" method="get">
				<input type="text" name="inv_date" class="form-control mb-3">
				<input type="submit" value="search"
					class="btn btn-secondary d-grid gap-2 col-6 mx-auto mb-3">
			</form>
		</div>
	</div>
	<div class="container ">
		<div
			class="col-lg-7 col-md-8 col-sm-5 container justify-content-center   my-5">
			<a href="search_All.jsp"
				class="btn btn-primary  d-grid gap-2 col-6 mx-auto  ">search All</a>
		</div>
	</div>
</body>
</html>