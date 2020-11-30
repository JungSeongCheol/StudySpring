<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<form method="post" action="Register">
	<h2>회원가입</h2>
	<input type="text" placeholder="id를 입력해주세요" name="id"/><br/>
	<input type="password" placeholder="password를 입력해주세요" name="pw"/><br/>
	<input type="submit" value="등록" style="margin:5px"/>
	<input type="button" value="취소" style="margin:5px" onclick="location.href='./Login'"/>
</form>
</body>
</html>