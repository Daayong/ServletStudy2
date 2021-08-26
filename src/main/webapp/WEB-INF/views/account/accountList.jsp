<%@page import="com.iu.s1.account.AccountDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ACCOUNT LIST PAGE</h1>

	<table>
	
	<tr>
		<th>거래번호</th><th>회원ID</th><th>제품명</th><th>거래날짜</th><th>잔액</th>
	</tr>
	<%
		Object obj = request.getAttribute("list");
		ArrayList<AccountDTO> ar =(ArrayList<AccountDTO>)obj;
	
		for(AccountDTO dto:ar){
	%>
		<tr>
			<td><%=dto.getAccountNumber() %></td>
			<td><%=dto.getId() %></td>
			<td><%=dto.getBookNumber() %></td>
			<td><%=dto.getAccountDate() %></td>
			<td><%=dto.getAccountBalance() %></td>
		</tr>
	<% } %>
	
	</table>


</body>
</html>