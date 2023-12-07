<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>log in</title>
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
	</nav>
	<div class="container my-5">
		<div
			class="col-lg-6 col-md-10 col-sm-6 container justify-content-center card ">
			<h1 class="text-center">Pharmacy system</h1>
			<h1 class="text-center">log in</h1>
			<form action="login" method="post">
				<div class="mb-3">
					<label class="form-label">username</label> <input type="text"
						name="login" placeholder="enter username" class="form-control" />
				</div>
				<div class="mb-3">
					<label class="form-label">password</label> <input type="password"
						name="pass" placeholder="enterpassword" class="form-control" />
				</div>
				<div class="d-grid gap-2 col-6 mx-auto mb-3">
					<input type="submit" value="login" class="btn btn-primary" />
				</div>
			</form>
			<div class="d-grid gap-2 col-6 mx-auto mb-3 text-center">
				<a href="changepassword.jsp">Forgot your password ?</a>
			</div>
			<form action="newregstration.jsp" method="get">
				<input type="submit" value="Registration"
					class="btn btn-primary active d-grid gap-2 col-6 mx-auto mb-4">
			</form>
		</div>
	</div>
</body>
</html>