<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h1>UPDATE</h1>
	
	<form action="/myboard/updateres" method="post">
	<input type="hidden" name="myno" value="${dto.myno }">
	<table border="1">
		<tr>
			<th>작성자</th>
			<td><input type="text" name="myname" value="${dto.myname }"></td>
		</tr>

		<tr>
			<th>제목</th>
			<td><input type="text" name="mytitle" value="${dto.mytitle }"></td>
		</tr>
		
		<tr>
			<th>내용</th>
			<td><textarea rows="10" cols="50" name="mycontent">${dto.mycontent }</textarea></td>
		</tr>
		
		<tr>
			<td colspan="4"  align="right">
				<input type="submit" value="수정하기">
				<input type="button" value="목록으로" onclick="location.href='/myboard/list'">
			</td>
		
		</tr>
	
	
	</table>
`	</form>
</body>
</html>

</body>
</html>