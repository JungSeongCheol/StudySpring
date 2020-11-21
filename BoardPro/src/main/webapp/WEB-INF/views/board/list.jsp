<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<body>
		<table>
			<tr>
				<td>bno</td>
				<td>title</td>
				<td>writer</td>
				<td>regdate</td>
			</tr>
			<c:forEach items="${list }" var="board">
			<tr>
				<td>${board.bno }</td>
				<td><a href="read?bno=${board.bno }">${board.title }</td>
				<td>${board.writer }</td>
				<td><fmt:formatDate value="${board.regdate }" pattern="yyyy. MM. dd"/></td>
			</tr>
			</c:forEach>
		</table>
	</body>
</html>