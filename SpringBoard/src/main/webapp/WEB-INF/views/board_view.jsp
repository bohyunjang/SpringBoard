<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 리스트</title>

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
	function boardWriteChect() {
		var form = document.BoardWriteForm;
		return true;
	}
	function boardDelete(){
		alert("파일 삭제 스크립트");
		if(confirm("삭제하시겠습니까?")) form.submit();
	}
</script>
</head>
<body>
	<!-- table summary가 폼보다 먼저 올라오는 경우와 폼이 먼저호는 경우가 다른가? -->
	<form id="form"name="form" method="post" action="./delete">
	<input type = "hidden" id="seq" name="seq" value="${board.seq}">
	</form>
		<table summary="전체 테이블 구성">
			<tr>
				<td colspan="2">
				
					<table border="1" summary="목록 테이블 구성">
						<tr>
							<td><div align="center">
									<h3>
										<b>글 읽기</b>
									</h3>
								</div></td>
						</tr>
						<tr>
							<td colspan="2">
								<table border="2" summary="목록 테이블 구성">
									<tr>
										<td align="center" bgcolor="#dddddd" width="40%">인덱스</td>
										<td bgcolor="#ffffe8" colspan="3">${board.seq}</td>
									</tr>
									<tr>
										<td align="center" bgcolor="#dddddd">제 목</td>
										<td bgcolor="#ffffe8" colspan="3">${board.title }</td>
									</tr>
									<tr>
										<td align="center" bgcolor="#dddddd" width="30%">작성자</td>
										<td bgcolor="#ffffe8" width="40%">${board.user_name }</td>
										<td align="center" bgcolor="#dddddd" width="75%">작성일</td>
										<td bgcolor="#ffffe8" width="40%">${board.reg_datetime }</td>
									</tr>
<!-- 									<tr>
										<td align="center" bgcolor="#dddddd">E-mail</td>
										<td bgcolor="#ffffe8">admin@test.com</td>
									</tr>
 -->								<tr>
										<td align="center" bgcolor="#dddddd">내  용</td>
										<td bgcolor="#ffffe8" colspan="3">${board.content }</td>
									</tr>
									<tr>
										<td align="center" bgcolor="#dddddd">조회수</td>
										<td bgcolor="#ffffe8" colspan="3">${board.cnt }</td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td align="center" colspan="2">
								<hr size="1">
								<div align="center">
									[ <input type="button" value="목록"	onclick="move('./');"> | 
									  <input type="button" value="수정" onclick="move('./update_move')">|
									<!-- <input type="button" value="답변" onclick="move('Board_Reply.jsp');"> | -->
									  <input type="button" value="삭제" onclick="boardDelete()"> ] <br>
								</div>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>