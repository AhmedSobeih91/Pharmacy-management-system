<%@page import="com.pharmacysystem.model.purchases"%>
<%@page import="com.pharmacysystem.dao.purchasesdao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Add Purchases</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>

	<nav class="navbar bg-dark border-bottom border-body"
		data-bs-theme="dark">
		<a class="navbar-brand" href="startpage.jsp">Pharmacy system</a>
		<a class="navbar-brand"  href="logout">log out</a>
	</nav>
	<div class="container my-2 ">
		<div
			class="col-lg-6 col-md-10 col-sm-6 container justify-content-center card  my-3">
			<%
			purchases p = new purchases();
			%>
			<form action="newProduct" method="post">
				<h2 class="text-center mb-0">Add new purchases</h2>
				<label class="form-label">Code *</label> <input type="text"
					name="code" class="form-control mb-0" /> <label class="form-label">Product
					Name *</label> <input type="text" name="pro_name" class="form-control mb-0" />
				<label class="form-label">Production Date </label> <input
					type="text" name="pur_date" class="form-control mb-0" /> <label
					class="form-label">Expiration Date *</label> <input type="text"
					name="ex_date" class="form-control mb-0" /> <label
					class="form-label">Quantity *</label> <input type="text" name="qu"
					class="form-control mb-0" /> <label class="form-label">Purchasing
					price *</label> <input type="text" name="pur_p" class="form-control mb-0" />
				<label class="form-label">Selling price *</label> <input type="text"
					name="sell_p" class="form-control mb-0" /> <input type="hidden"
					name="total" value=<%=p.getTotal()%> class="form-control mb-0" />
				<label class="form-label">Supplier Name *</label> <input type="text"
					name="supp_name" class="form-control mb-1" /> <input type="submit"
					value="Add" class="btn btn-primary">
			</form>
			<div class="container my-0 ">
				<div
					class="col-lg-6 col-md-10 col-sm-6 container justify-content-center card  mb-3">
					<form action="showpurchases.jsp" method="get">
						<input type="text" name="code" placeholder="enter the code"
							class="form-control my-2"> <input type="submit"
							value="search"
							class="btn btn-secondary d-grid gap-2 col-6 mx-auto mb-1">
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>