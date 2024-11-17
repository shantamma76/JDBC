<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Form</title>
</head>
<body>
<h2>Item order Form</h2>

<form action="order" method="post">
<pre>
Name<input type="text" name="name">

Email<input type="text" name="email">

phone<input type="number" name="phone">

Street Address<input type="text" name="address" >

City<input type="text" name="city">

Pincode<input type="number" name="pincode">

item Name<input type="text" name="item">

Quantity<input type="number" name="quantity">

<input type="submit" value="Submit">

</pre>
</form>

</body>
</html>