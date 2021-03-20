<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TestApp</title>
</head>
<body>
<div>

	<h3>Login</h3>

	<form action="<%= request.getContextPath() %>/LoginServlet" method="post">
	<p>・ニックネーム</p>
	<input type="text" name="nickname">
	<p>・パスワード</p>
	<input type="password" name="password">
	<button type="submit">login</button>
</form>

</div>

</body>
</html>