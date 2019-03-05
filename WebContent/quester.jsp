<%@page import="com.chainsys.quiz.Topics"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>c_questers</title>
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

</head>
<body>
	<form method="post" action="CheckServlet">
		<h2>Start Test</h2>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">SNO</th>
					<th scope="col">QUESTERS</th>
					<!-- <th scope="col">OPTION1</th>
					<th scope="col">OPTION2</th>
					<th scope="col">OPTION3</th> -->
				</tr>
			</thead>

			<tbody>
			
			
			
				<c:forEach var="quester" items="${QUESTER}">	
					<tr>
						<td>${quester.id}</td>
						<td>${quester.question}</td>
						<td><input type="radio" name="${quester.id}" value="a">${quester.option1}</td>
						<td><input type="radio" name="${quester.id}" value="b">${quester.option2}</td>
						<td><input type="radio" name="${quester.id}" value="c">${quester.option3}</td>
						
					</tr>
					
			           <%  String s="${quester.id}";
			           ArrayList<String> list=new ArrayList<>();
			           list.add(s);
			           request.setAttribute("ANSWER", list);
			           %>
				</c:forEach>
			
			</tbody>
		
		</table>
	

	<button type="submit" class="btn btn-success">Check</button>
			</form>
	
	


</body>
</html>