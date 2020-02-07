<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>今は<p>
<%out.println(new java.util.Date()); %>

<%!
 int add(int n1, int n2){
	return n1+n2;
}
%>

<p>1+2=<%=add(1,2) %><p>
<p>3+4=<%=add(3,4) %><p>

<%! int countA=0; %>
<%
int countB=0;
countA++;
countB++;
%>
<p>宣言による変数countA=<%=countA %><p>
<p>スクリプトレットによる変数countB=<%=countB %><p>

<p><% out.println(Math.random()); %><p>
<p><%=Math.random() %><p>

<p>お名前を入力してください。<p>
<from method="post"action="next.jsp">
 <input type="text"name="user">
 <input type="submit"value="確定">
 </from>
</body>
</html>