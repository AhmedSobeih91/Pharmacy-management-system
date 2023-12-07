<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>change password</title>
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
			class="col-lg-6 col-md-10 col-sm-6 container justify-content-center card  mb-5">
			<h1 class="text-center mb-3">Reset the password</h1>
			<form action="resetpassword" method="post">

				<label class="form-label">username</label> <input type="text"
					name="username" placeholder="enterusername"
					class="form-control mb-2" /> <label class="form-label">newpassword</label>
				<input type="password" name="password"
					placeholder="enter new password" class="form-control mb-4" /> <input
					type="submit" value="exchange"
					class="btn btn-primary d-grid gap-2 col-6 mx-auto mb-3" />
			</form>
		</div>
	</div>
</body>
</html>