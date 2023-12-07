<%@page import="com.pharmacysystem.model.purchases"%>
<%@page import="com.pharmacysystem.dao.purchasesdao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar bg-dark border-bottom border-body"
		data-bs-theme="dark">
		<p>Pharmacy system</p>
		<a href="logout">log out</a>
	</nav>
	<div class="container my-2 ">
		<div
			class="col-lg-7 col-md-8 col-sm-6 container justify-content-center card  my-3">
			<%
			int code = Integer.parseInt(request.getParameter("code"));
			purchasesdao purchasesdao = new purchasesdao();
			purchases purchase1 = purchasesdao.selectonepurchases(code);
			%>
			<form action="editpurchases" method="post">
				<h2 class="text-center mb-0">Modify purchases</h2>
				<label class="form-label">Code</label> <input type="text"
					name="code1" value=<%=purchase1.getCode()%>
					class="form-control mb-0" readonly /> <label class="form-label">Product
					Name</label> <input type="text" name="pro_name1"
					value=<%=purchase1.getProduct_Name()%> class="form-control mb-0"
					readonly /> <label class="form-label">Production Date </label> <input
					type="text" name="pur_date1"
					value=<%=purchase1.getProduction_Date()%>
					class="form-control mb-0" /> <label class="form-label">expiry
					Date</label> <input type="text" name="ex_date1"
					value=<%=purchase1.getExpiry_Date()%> class="form-control mb-0" />
				<label class="form-label">Quantity</label> <input type="text"
					name="qu1" value=<%=purchase1.getQuantity()%>
					class="form-control mb-0" /> <label class="form-label">Purchasing
					price</label> <input type="text" name="pur_p1"
					value=<%=purchase1.getPurchasing_price()%>
					class="form-control mb-0" /> <label class="form-label">selling
					price</label> <input type="text" name="sell_p1"
					value=<%=purchase1.getSelling_price()%> class="form-control mb-0" />
				<label class="form-label">Total</label> <input type="text"
					name="total1" value=<%=purchase1.getTotal()%>
					class="form-control mb-0" readonly /> <label class="form-label">Supplier
					Name</label> <input type="text" name="supp_name1"
					value=<%=purchase1.getSupplier_name()%> class="form-control mb-3" />
				<input type="submit" value="update"
					class="btn btn-secondary d-grid gap-2 col-6 mx-auto mb-3">
			</form>
		</div>
	</div>
</body>
</html>