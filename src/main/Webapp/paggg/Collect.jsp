<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WebPage</title>
</head>
<body>
<p>Insert Information</p>
<form action="/Collect" method="post">
        <label for="id">ID:</label><br>
        <input type="text" id="id" name="id"><br><br>

        <label for="name">Name:</label><br>
        <input type="text" id="name" name="name"><br><br>

        <label for="points">Points:</label><br>
        <input type="number" id="points" name="points"><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>