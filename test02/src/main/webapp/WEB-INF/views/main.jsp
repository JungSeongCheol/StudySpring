<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<body>
		<h2>Main 페이지</h2>
		<%@ include file="include/head.jsp" %>
		<br>내용내용<br>
		3 + 5 : ${3+5 }<br>
		10 == 5 : ${10 == 5 }<br>
		10 >= 5 : ${10 >= 5 }<br>
		
		10>5 && 3<5 : ${10>5 && 3<5 }<br>
		10>5 || 3<5 : ${10>5 || 3<5 }<br>
		
		<%@ include file="./include/footer.jsp" %>
	</body>
</html>