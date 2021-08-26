<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>BANK BOOK INSERT PAGE</h1>

	<form action="./bankbookInsert.do" method="post">
		<p>제품명</p> <input type="text" name="bookName" placeholder="ex)청약저축">
		<p>이자율</p> <input type="text" name="bookRate" value="1.12">
		<p>판매 여부</p>Y<input type ="radio" name="bookSale" checked="checked" value="1"> 
		N<input type ="radio" name="bookSale" value="0">
	<!-- 	<select>
			<option>Y</option>
			<option>N</option>
		</select>
	 -->
	 
		<div>
			<button>WRITE1</button>
			<input type="button" value="WRITE2">
			<input type="submit">
			<input type="reset">
		</div>
	 	
	 	
	</form>
	
	



</body>
</html>