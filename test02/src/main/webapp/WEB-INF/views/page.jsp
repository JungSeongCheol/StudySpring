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
		<c:if test="${gender==1 }">
			성별 :<h1>남자</h1>
		</c:if>
		
		<c:if test="${gender==2 }">
			성별 :<h1>여자</h1>
		</c:if>
		
		<c:choose>
			<c:when test="${gender==1 }">남</c:when>
			<c:otherwise>여</c:otherwise>
		</c:choose>
		
		<table>
			<tr>
				<td>
					아이디
				</td>
				<td>
					비밀번호
				</td>
				<td>
					이름
				</td>
				<td>
					나이
				</td>
			</tr>
			<c:forEach items="${members }" var="member">
			<tr>
				<td>
					${member.id }
				</td>
				<td>
					${member.pw }
				</td>
				<td>
					${member.name }
				</td>
				<td>
					${member.age }
				</td>
			</tr>
			</c:forEach>
		</table>
		

	</body>
</html>