<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>클럽 생성</title>
</head>
<body>
	<h2>클럽생성폼</h2>
	<form name="form1" method="post" action="/club/createClub">
		<table border="1" width="400px">
			<tr>
				<td>개설자아이디</td>
				<td><input name="userId"></td>
			</tr>
			<tr>
				<td>모임아이디</td>
				<td><input name="clubId"></td>
			</tr>	
			<tr>
				<td>카테고리코드</td>
				<td><input name="categoryCode"></td>
			</tr>	
			<tr>
				<td>모임이름</td>
				<td><input name="clubName"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" value="확인">
				<input type="reset" value="취소">
				</td>
			</tr>			
		</table>
	</form>
</body>
</html>