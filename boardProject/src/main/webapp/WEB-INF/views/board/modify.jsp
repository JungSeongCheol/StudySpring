<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="modify">
	<table>
		<tr><th>번호</th>
		<td>
			<input type="text" name="bno" value="${board.bno}" readonly>
		</td>
		
		<tr><th>조회수</th><td><input type="text" name="readcount" value="${board.readcount }" readonly></td></tr>
		
		<tr><th>제목</th>
		<td>
			<input type="text" name="title" value="${board.title}">
		</td>
		
		<tr><th>내용</th><td><textarea rows="5" cols="30" name="content">${board.content }</textarea></td></tr>
		<tr><th>작성자</th><td><input type="text" name="writer" value="${board.writer }"></td></tr>
		
		<tr>
			<td>
			</td>
			<td colspan="2">
				<input type="submit" value="등록">
				<input type="reset" value="취소">
				<input type="button" value="목록보기" onclick="location.href='/board/list'">
			</td>
		</tr>
	</table>
</form>
</body>
</html>