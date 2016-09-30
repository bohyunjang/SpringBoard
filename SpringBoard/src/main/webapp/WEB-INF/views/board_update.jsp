<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 수정하기</title>

<style>
@import url(http://fonts.googleapis.com/earlyaccess/nanumgothic.css);

body {
	font-family: 'Nanum Gothic', sans-serif;
}
</style>

<script type="text/javascript">
	function move(url) {
		location.href = url;
	}
	function boardUpdateCheck() {
		var form = document.BoardUpdateForm;
		return true;
	}
</script>

</head>
<body>
	<form id="form"name="form"method="post"action="./update">
		<input type = "hidden" id="idx" name="idx" value="${board.idx}">
	</form>
	
	<table width=300 border=1 cellspacing=0 cellpadding=5>
	<caption>게시판 수정</caption>
				<tr>
					<td>제 목</td>
					<td><input type="text" name="title" value="${board.title }"
						size=30></td>
				</tr>
				<tr>
					<td>작성자</td>
					<td><input type="text" name="userName"
						value="${board.userName }" size=10 maxlength="8"></td>
				</tr>
				<tr>
				<td>내 용</td>
				<td><textarea id="content" name="content" cols="30">${board.content}</textarea></td>
				</tr>
				<!-- <tr>
					<td>비밀번호</td>
					<td><input type="password" name=password size=15 maxlength="15"></td>
				</tr>  <tr>
					<td >작성시간</td>
					<td><input type="text" name=name value="${boards.reg_datetime }" size=10 maxlength="8"></td>
				</tr>
				<tr>
					<td >조회수</td>
					<td><input type="text" name="cnt" value="${boards.cnt }" size=10 maxlength="8"></td>
				</tr> -->

	</table>
	
	<table width=700 >
		<tr><td><div align="left">
		<!-- <input type="button" value="초기화" onclick="location.href="> -->
		<input type="submit" value="수정" />
		<input type="button" value="뒤로가기" onclick="move('./')">	
		</div></td></tr>
	</table>
</body>
</html>
