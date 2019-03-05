<%@page import="com.chainsys.quiz.Topics"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- Bootstrap core CSS -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Material Design Bootstrap -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.5.8/css/mdb.min.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>topics</title>
</head>
<body>
	<h2>List of courses</h2>
	<h3>Choose topic to start test</h3>


	<table class="table table-hover">
		<thead>
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Topics</th>
				<th scope="col">Questions</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="topics" items="${TOPICS}">
				<tr>
					<td>${topics.id}</td>
					<td>${topics.topic}</td>
					<td>${topics.questions}</td>

					<td><form method="post" action="QuesterServlet">
		<button type="submit" class="btn btn-primary">View</button>
	</form></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>