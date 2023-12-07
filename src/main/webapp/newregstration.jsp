<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>registration</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar bg-dark border-bottom border-body"
		data-bs-theme="dark">
		<h1 class="navbar-brand" >Pharmacy system</h1>
		
	</nav>
	<div class="container my-5 ">
		<div
			class="col-lg-6 col-md-10 col-sm-6 container justify-content-center card  my-3">
			<h1 class="text-center mb-3">New Registration</h1>
			<form action="regstration" method="post">
				<label class="form-label">username</label> <input type="text"
					name="username" placeholder="enter username"
					class="form-control mb-3" /> <label class="form-label">password</label>
				<input type="password" name="password" placeholder="enter password"
					class="form-control mb-4" /> <input type="submit" value="confirm"
					class="btn btn-primary d-grid gap-2 col-6 mx-auto mb-3" />
			</form>
		</div>
	</div>
</body>
</html>