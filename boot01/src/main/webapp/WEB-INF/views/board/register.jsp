<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="register" method="post">
		<table>
			<tr>
				<td>제목</td>
				<td><input type="text" name="title"></input></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="4" cols="30" name="content"></textarea></td>
			</tr>
			<tr>
				<td>작성자</td>
				<td><input type="text" name="writer"></input></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="전송"/>
					<input type="reset" value="취소"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>