<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>스프링 게시판 view</title>
<script type="text/javascript">
function del(){
	if(confirm("삭제하시겠습니까?")) document.form.submit();
}
</script>
</head>
<body>
	<form id="form"name="form"method="post"action="./delete">
		<input type = "hidden" id="seq" name="idx" value="${board.seq}">
	</form>
	
	<table width=300 border=1 cellspacing=0 cellpadding=5>
	<tr><td><b>인덱스</b></td><td>${board.seq }</td></tr>
	<tr><td><b>제목</b></td><td>${board.subject}</td></tr>
	<tr><td><b>작성자</b></td><td>${board.subject}</td></tr>
	<tr><td><b>작성시간</b></td><td>${board.reg_datetime }</td></tr>
	<tr><td><b>조회수</b></td><td>${board.cnt }</td></tr>
	<tr><td><b>내용</b></td><td><textarea>${board.content }</textarea></td></tr>
	</table>
	
	<table width=700 >
		<tr><td>
		<input type="button" value="삭제" onclick="location.href='./delete'">
		<input type="button" value="수정" onclick="location.href='./move_update'">
		<input type="button" value="목록" onclick="location.href='./'">	
		</td></tr>
	</table>
</body>
</html>
