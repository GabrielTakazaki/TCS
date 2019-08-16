<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro categoria</title>
</head>
<body>
	<form id="cadCategoria" method="post" action="/academia/formulario/salvacategoria">
		<div>
			<label for="nome">Nome:</label><br> 
			<input id="cat_nome" type="text" name="cat_nome" />
		</div>
		<div>
			<label for="descricao">Descrição:</label><br> 
			<input type="text"id="cat_descricao" name="cat_descricao" />
		</div>
		<input type="submit" value="Submit" id="enviar" />
	</form>
</body>
</html>