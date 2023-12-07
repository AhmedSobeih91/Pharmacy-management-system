<%@page import="com.pharmacysystem.model.suppliers"%>
<%@page import="java.util.List"%>
<%@page import="com.pharmacysystem.dao.suppliersdao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add supplier</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<div class="container my-4 ">
		<div
			class="col-lg-8 col-md-10 col-sm-7 container justify-content-center card  my-0">
			<form action="newsupplier" method="post">
				<h2 class="text-center mb-0">Add New supplier</h2>
				<label class="form-label">Name*</label>
				<input type="text" name="name" class="form-control mb-0" /> <label
					class="form-label">Address </label> <input type="text"
					name="address" class="form-control mb-0" /> <label
					class="form-label">Tax Number*</label> <input type="text"
					name="tax_number" class="form-control mb-0" /> <label
					class="form-label">Phone Number</label> <input type="text"
					name="phone_number" class="form-control mb-2" /> <input
					type="submit" value="save"
					class="btn btn-primary d-grid gap-2 col-6 mx-auto mb-1">
			</form>
		</div>
	</div>
	<div class="container my-4 ">
		<table class="table">
			<thead class="table-dark">
				<tr>
					<td>Id</td>
					<td>Name</td>
					<td>Address</td>
					<td>Tax_number</td>
					<td>Phone_number</td>
					<td>Edit</td>
					<td>Delete</td>
				</tr>
			</thead>
			<%
			suppliersdao supplierdao = new suppliersdao();
			List<suppliers> Allsupplier = supplierdao.selectallsuppliers();
			%>
			<%
			for (suppliers supplier : Allsupplier) {
			%>
			<tbody>
				<tr>
					<td><%=supplier.getId()%></td>
					<td><%=supplier.getsupplier_name()%></td>
					<td><%=supplier.getAddress()%></td>
					<td><%=supplier.getTax_number()%></td>
					<td><%=supplier.getPhone_number()%></td>
					<td><a
						href="updatesupplier.jsp?name=<%=supplier.getsupplier_name()%>"
						class="btn btn-info">edit</a></td>
					<td><a href="delete?id=<%=supplier.getId()%>"
						class="btn btn-danger">delete</a></td>
				</tr>
			</tbody>
			<%
			}
			%>
		</table>
	</div>
</body>
</html>