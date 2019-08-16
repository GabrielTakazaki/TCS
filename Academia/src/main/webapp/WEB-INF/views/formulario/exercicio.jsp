<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form id="cadExercicios" method="post" action="/academia/formulario/salvaexercicio">
		<div>
			<label for="title">Nome:</label><br> 
			<input id="exe_nome" type="text" name="exe_nome" />
		</div>
		<div>
			<label for="descricao">Descrição:</label><br> 
			<input type="text"id="exe_descricao" name="exe_descricao" />
		</div>
		<div>
			<label for="categoria">Categoria:</label><br> 
			<input type="text"id="exe_categoria" name="exe_categoria" />
		</div>
		<input type="submit" value="Submit" id="enviar" />
	</form>
</body>
</html>