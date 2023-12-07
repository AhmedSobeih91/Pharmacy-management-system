<%@page import="com.pharmacysystem.model.sales"%>
<%@page import="java.util.List"%>
<%@page import="com.pharmacysystem.dao.salesdao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>search</title>
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
	List<sales> sale = null;
	try {
		String inv_date = request.getParameter("inv_date");
		salesdao sales = new salesdao();
		sale = sales.selectWithDate(inv_date);
	} catch (Exception ex) {
		RequestDispatcher req = request.getRequestDispatcher("errorpageinv_date.jsp");
		req.forward(request, response);
	}
	%>
	<div class="container my-5 ">
		<div
			class="col-lg-12 col-md-10 col-sm-6 container justify-content-center card  my-3">
			<h1 class="text-center my-3">sales show</h1>
			<table class="table">
				<thead class="table-dark">
					<tr>
						<td>Id</td>
						<td>Code</td>
						<td>Product_name</td>
						<td>Quantity</td>
						<td>Price</td>
						<td>total</td>
						<td>invoice_date</td>
						<td>invoice_number</td>
					</tr>
				</thead>
				
				<tbody>
					<tr>
					<%for (sales sal : sale) {%>
						<td><%=sal.getId()%></td>
						<td><%=sal.getCode()%></td>
						<td><%=sal.getProduct_name()%></td>
						<td><%=sal.getQuantity()%></td>
						<td><%=sal.getPrice()%></td>
						<td><%=sal.getTotal()%></td>
						<td><%=sal.getInvoice_date()%></td>
						<td><%=sal.getInvoice_number()%></td>
					</tr>
					<%}%>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>