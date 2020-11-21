<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Read Page</title>
</head>
<body>
<table>
	<tr><th>번호</th><td>${read.bno }</td></tr>
	<tr><th>제목</th><td>${read.title }</td></tr>
	<tr><th>내용</th><td>${read.content }</td></tr>
	<tr><th>작성자</th><td>${read.writer }</td></tr>
	<tr><th>날짜</th><td>${read.regdate }</td></tr>
	<tr>
		<td>
			<button id="modify">수정</button>
			<button id="remove">삭제</button>
			<button id="list">목록보기</button>
		</td>
	</tr>
</table>
<%-- bno: ${read.bno }<br> --%>
<%-- title: ${read.title }<br> --%>
<%-- content: ${read.content }<br> --%>
<%-- writer: ${read.writer }<br> --%>
<%-- regdate: ${read.regdate }<br> --%>
<!-- <a href="./list">목록으로</a> -->
</body>
</html>