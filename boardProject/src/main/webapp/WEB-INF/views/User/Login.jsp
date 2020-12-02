<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
</style>
</head>
<body>
<form method="post" action="Login">
	<h2>Login</h2>
	<div class="content">
		<input type="text" name="id" placeholder="id를 입력해주세요"/><br/>
		<input type="password" name="pw" placeholder="password를 입력해주세요"/><br/>
		<input type="submit" value="로그인" style="margin:5px"/>
		<input type="button" value="회원가입" style="margin:5px" onclick="location.href='./Register'"/>
		<input type="button" value="취소" style="margin:5px" onclick="location.href='../board/list'"/>
	</div>
	<c:if test="${msg == 'success' }">
		<span style="color: red">회원가입 성공.</span>
	</c:if>
	<c:if test="${LoginCheck == 'fail' }">
		<span style="color: red">로그인 실패</span>
	</c:if>
	
</form>

</body>
</html>