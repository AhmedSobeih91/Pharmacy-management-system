<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.Console"%>
<%@page import="java.util.List"%>
<%@page import="com.pharmacysystem.dao.purchasesdao"%>
<%@page import="com.pharmacysystem.model.purchases"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>item card</title>
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
	<div class="container my-5 ">
		<div
			class="col-lg-12 col-md-10 col-sm-6 container justify-content-center card  my-3">
			<h1 class="text-center mb-3">Item Card</h1>
			<table class="table">
				<thead class="table-light">
					<tr>
						<td>code</td>
						<td>Product_Name</td>
						<td>Production_Date</td>
						<td>expiry_Date</td>
						<td>Quantity</td>
						<td>Purchasing_price</td>
						<td>selling_price</td>
						<td>total</td>
						<td>supplier_name</td>
						<td>Edit</td>
						<td>Delete</td>
					</tr>
				</thead>
				<%
				int code = Integer.parseInt(request.getParameter("code"));
				purchasesdao purchasesdao = new purchasesdao();
				List<purchases> purchase1 = purchasesdao.select(code);
				System.out.print(purchase1.size());
				if (purchase1 == null || purchase1.isEmpty()) {
					RequestDispatcher a = request.getRequestDispatcher("errorpurchase.jsp");
					a.forward(request, response);

				}
				%>
				<tbody>
					<%
					for (purchases x : purchase1) {
					%>
					<tr>
						<td><%=x.getCode()%></td>
						<td><%=x.getProduct_Name()%></td>
						<td><%=x.getProduction_Date()%></td>
						<td><%=x.getExpiry_Date()%></td>
						<td><%=x.getQuantity()%></td>
						<td><%=x.getPurchasing_price()%></td>
						<td><%=x.getSelling_price()%></td>
						<td><%=x.getTotal()%></td>
						<td><%=x.getSupplier_name()%></td>
						<td><a href="updatepurchases.jsp?code=<%=x.getCode()%>"
							class="btn btn-info">edit</a></td>
						<td><a href="deletepurchases?code=<%=x.getCode()%>"
							class="btn btn-danger">delete</a></td>
						<%
						}
						%>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>