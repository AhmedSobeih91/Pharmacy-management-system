<%@page import="com.pharmacysystem.model.item"%>
<%@page import="java.util.List"%>
<%@page import="com.pharmacysystem.model.purchases"%>
<%@page import="com.pharmacysystem.dao.purchasesdao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>invoice</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar bg-dark border-bottom border-body"
		data-bs-theme="dark">
		<a class="navbar-brand" href="startpage.jsp">Pharmacy system</a> <a
			class="navbar-brand" href="logout">log out</a>
	</nav>
	<div class="container my-4 ">
		<div
			class="col-lg-6 col-md-10 col-sm-6 container justify-content card  mb-3 ">
			<form action="inv" method="post">
				<input type="text" name="cod" placeholder="enter the code"
					class="form-control my-2"> <input type="text" name="quant"
					placeholder="enter the quantity" class="form-control mb-2">
				<input type="submit" value="add" class="btn btn-primary mb-2">
			</form>
		</div>
	</div>
	<div class="container my-4 ">

		<form action="inv2" method="get">
			<div class="row ">
				<div
					class="col-lg-8 col-md-10 col-sm-6 container justify-content card  mb-1 ">
					<label>invoice date </label> <input type="text" name="data"
						class="form-control mb-1" /> <label>invoice number</label> <input
						type="text" name="invoice_number" class="form-control mb-1">
					<label>customer name</label> <input type="text" name="customer"
						class="form-control mb-2" />
				</div>
			</div>

			<table class="table">
				<thead class="table-dark">
					<tr>
						<td>Code</td>
						<td>Product Name</td>
						<td>Quantity</td>
						<td>Price</td>
						<td>total</td>
					</tr>
				</thead>
				<%
				List<item> listitem = (List<item>) request.getSession().getAttribute("listitem");
				if (listitem != null) {
					for (item ite : listitem) {
				%>
				<tbody>
					<tr>
						<td><%=ite.getCode()%></td>
						<td><%=ite.getName()%></td>
						<td><%=ite.getQuantity()%></td>
						<td><%=ite.getPrice()%></td>
						<td><%=ite.getTotal()%></td>
					</tr>
				</tbody>
				<%
				}
				}
				%>
				<tfooter>
				<tr ALIGN="Center">
					<td colspan="3">totalprice:</td>
					<td colspan="2"><%=request.getAttribute("totalprice")%></td>
				</tr>
				</tfooter>
			</table>
			<div class="container my-1 ">
				<input type="submit" value="save" class="btn btn-primary ">
				
			</div>
		</form>
	</div>
</body>
</html>