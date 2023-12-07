<%@page import="com.pharmacysystem.model.suppliers"%>
<%@page import="com.pharmacysystem.dao.suppliersdao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Modify</title>
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
	<%
	String name = request.getParameter("name");
	suppliersdao supp = new suppliersdao();
	suppliers supplier = supp.select(name);
	%>
	<div class="container my-5 ">
		<div
			class="col-lg-8 col-md-8 col-sm-7 container justify-content-center card  my-0">
			<form action="edit" method="post">
				<h2 class="text-center mb-0">Modify the Supplier</h2>
				<input type="hidden" name="id" value=<%=supplier.getId()%>
					class="form-control mb-0" /> <label class="form-label">Name</label>
				<input type="text" name="name"
					value=<%=supplier.getsupplier_name()%> class="form-control mb-0" />
				<label class="form-label">Address </label> <input type="text"
					name="address" value=<%=supplier.getAddress()%>
					class="form-control mb-0" /> <label class="form-label">Tax
					Number</label> <input type="text" name="tax_number"
					value=<%=supplier.getTax_number()%> class="form-control mb-0" /> <label
					class="form-label">Phone Number</label> <input type="text"
					name="phone_number" value=<%=supplier.getPhone_number()%>
					class="form-control mb-3" /> <input type="submit" value="update"
					class="btn btn-primary d-grid gap-2 col-6 mx-auto mb-3">
			</form>
		</div>
	</div>
</body>
</html>