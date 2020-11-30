<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr><th>번호</th><td>${read.bno }</td></tr>
	<tr><th>제목</th><td>${read.title }</td></tr>
	<tr><th>내용</th><td>${read.content }</td></tr>
	<tr><th>작성자</th><td>${read.writer }</td></tr>
	<tr><th>조회수</th><td>${read.readcount }</td></tr>
	<tr><th>날짜</th><td>${read.regdate }</td></tr>
	<tr>
		<td>
			<input type="button" value="수정폼" onclick="location.href='/board/modify?bno=${read.bno}'">
			<input type="button" value="삭제" onclick="location.href='/board/remove?bno=${read.bno}'">
			<input type="button" value="목록보기" onclick="location.href='/board/list'">
		</td>
	</tr>
</table>
</body>
</html>