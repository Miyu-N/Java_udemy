<%@ page language="java" contentType="text/html;charset=Windows-31J" %>

<html>
<head>
	<title></title>
</head>
<body>
<br>

<%
	String message = (String)request.getAttribute( "login" );
	String name = (String)session.getAttribute( "name" );
	if( name == null){ message = "���łɃ��O�A�E�g���Ă��܂�" ;}
%>

<br><br>
 <%= message %> <br><br>
 
����ɂ��́@<%= name %> ����<br><br>

<a href="/jsp_servlet/name.jsp">���̃y�[�W�ɍs��</a>


</body>
</html>