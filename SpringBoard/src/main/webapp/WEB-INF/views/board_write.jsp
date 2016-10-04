<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 글쓰기</title>

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
	function boardWriteCheck() {
		var form = document.BoardWriteForm;
		return true;
	}
</script>
</head>
<body>
	<table summary="글쓰기 전체 테이블">
		<form id="form" method="post" action="./write">
			<colgroup>
				<col width="30%" />
				<col width="70%" />
			</colgroup>

			<table summary="테이블 구성">
				<caption>게시판 글쓰기</caption>
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

				<tr>
					<td colspan=2><hr size=1></td>
				</tr>
				<tr>
					<td colspan="2"><div align="center">
							<input type="submit" value="저장" />
							<!-- <input type="button" value="뒤로" onclick="move('./');"> -->
							<input type="button" value="뒤로" onclick="move('./')">
					</div></td>
				</tr>
			</table>
			</form>
	</table>
</body>
</html>