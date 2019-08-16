<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Treino</title>
</head>
<body style="text-align: center">
	<form action="/academia/formulario/salvatreino" method="post">
		<div>
			<label>Nome:</label>
			<input id="tre_nome" name= "tre_nome" type="text"/>
		</div>
		<div>
			<label>Exercicios:</label>
			<input id="tre_exercicios" name= "tre_exercicios" type="text"/>
		</div>
		<div>
			<input type="submit" value="Submit" id="enviar"/>
		</div>
	</form>
</body>
</html>