<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Car ID</th>
			<th>Customer ID</th>
		</tr>
	
		<c:forEach items="${carhire}" var="car">
			<tr>
				<td>${car.carId}</td>
				<td>${car.customerId}</td>
				<td>${car.bookingId}</td>	
				<td>${car.TypeOfCar}</td>
				<td>${car.RegNo}</td>
				
				
				
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="/index.html">Home</a>
</body>
</html>