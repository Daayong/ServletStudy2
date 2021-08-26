<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link href="./css/test.css" rel="stylesheet">
</head>
<body>
	<h1>Index Page</h1>
	<h3 id="t1">Member</h3>
	<p>
		<a href="/ServletStudy2/member/memberLogin.do?id=t1&pw=pw1" >Member Login</a><br>
		<a href="./member/memberJoin.do" >Member Join</a><br>
		<a href="member/memberPage.do" >MyPage</a>
	</p>
	
	<h3 id="t3" class="c2">BankBook</h3>
	<p>
		<a href="/ServletStudy2/bankbook/bankbookList.do" >상품 목록 조회</a><br>
		<a href="./bankbook/bankbookInsert.do" >상품 등록 조회</a><br>
		<a href="bankbook/bankbookSelect.do?bookNumber=5" >상품 상세 조회</a>
	</p>
	
	<h2 class="c1 c2">Button</h2>
	<button class="c1">CLICK</button>
	
	<div id ="circle">CIRCLE</div>
	
	
	
	<h3>Account</h3>
	<p>
		<a href="/ServletStudy2/account/accountList.do">계좌 목록 조회</a><br>
	</p>
	

</body>
</html>