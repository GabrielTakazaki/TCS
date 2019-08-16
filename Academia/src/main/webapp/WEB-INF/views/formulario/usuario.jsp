<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align:center">
	<form id="cadUsuario" method="post" action="/academia/formulario">
		<div>
			<label for="title">Nome:</label><br>
			<input id="alu_nome" type="text" name="alu_nome"/>
		</div>
		<div>
			<label for="password">Senha:</label><br>
			<input id="alu_senha" type="password" name="alu_senha"/>
		</div>
		<div>	
			<label for="nascimento">Nascimento:</label><br>
			<input id="alu_nascimento" type="date" name="alu_nascimento"/>
		</div>
		<div>
			<label for="peso">Peso:</label><br>
			<input type="number" id="alu_peso" name="alu_peso"/>
		</div>
		<div>
			<label for="altura">Altura:</label><br>
			<input type="number" id="alu_altura" name = "alu_altura"/>
		</div>
		<div>
			<label for="grant">Privilégio:</label><br>
			<input type="text" id="alu_privilegio" name = "alu_privilegio"/>
		</div>
		<input type="submit" value="Submit" id="enviar" />
	</form>
</body>
</html>