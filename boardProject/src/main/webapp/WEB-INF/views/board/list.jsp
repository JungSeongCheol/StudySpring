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
	<body><a href="/board/register">새 글쓰기</a>
		<c:choose>
			<c:when test="${LoginCheck == 'success' }">
				<span style="display: red">회원님 환영합니다.</span>
			</c:when>
			<c:otherwise>
				<a href="/User/Login">로그인</a>
			</c:otherwise>
		</c:choose>
		<table>
			<tr>
				<td>번호</td>
				<td>제목</td>
				<td>작성자</td>
				<td>조회수</td>
				<td>등록날짜</td>
			</tr>
			<c:forEach items="${list }" var="board">
			<tr>
				<td>${board.bno }</td>
				<td><a href="read?bno=${board.bno }">${board.title }</a></td>
				<td>${board.writer }</td>
				<td>${board.readcount }</td>
				<td><fmt:formatDate value="${board.regdate }" pattern="yyyy. MM. dd"/></td>
			</tr>
			</c:forEach>
		</table>
	</body>
</html>