<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align:center">
	<form id="cadUsuario" method="post" action="/senai/products">
		<div>
			<label for="title">Nome:</label><br>
			<input id="usu_nome" type="text" name="nome"/>
		</div>
		<div>
			<label for="password">Senha:</label><br>
			<input id="usu_senha" type="password" name="password"/>
		</div>
		<div>
			<label for="grant">Privilégio:</label><br>
			<input type="text" id="usu_privilegio"/>
		</div>
		<input type="submit" value="Submit" id="send" />
	</form>
</body>
</html>