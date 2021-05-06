<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/Menu.css">

<title>Menu</title>
</head>
<body>
	<div id="Menu">
		<div class="dMenu" id="dConsultar">
			<img style="width: 40px; height: 40px;" alt="Lupa"
				src="https://images.vexels.com/media/users/3/143356/isolated/preview/64e14fe0195557e3f18ea3becba3169b-lupa-de-pesquisa-by-vexels.png">
			<label id="lConsultar">Consultar</label>
		</div>

		<div class="dMenu" id="dIncluir">
			<img style="width: 40px; height: 40px;" Adicionar
				Usuario" src="https://i.pinimg.com/736x/34/30/72/343072b13bb3caee0c642c653a03f888.jpg">
			<label id="lIncluir">Incluir</label>
		</div>


		<div class="dMenu" id="dAlterar">
			<img style="width: 40px; height: 40px;" Alterar
				usuário" src="https://png.pngtree.com/png-vector/20190827/ourlarge/pngtree-pencil-icon-png-image_1713465.jpg">
			<label id="lAlterar">Alterar</label>
		</div>
	</div>


	<div id="form" class="card"
		style="width: 30rem; height: 30rem; background: black; border-color: gray; position: absolute; left: 30%; top: 100px; box-shadow: 0px 0px 1em white;">
		<div class="card-body">

			<form method="post" action="/ServletCadastro">
				<label id="addTexto" style="display: none;"></label> <label
					id="validacaoTXT" style="display: none;"></label> <input
					class="inputForm" type="text" id="inputNome" name="inputNome"
					placeholder="Insira seu Nome" Disabled=true> <input
					class="inputForm" type="email" id="inputEmail" name="inputEmail"
					placeholder="Insira seu Email" Disabled=true> <input
					class="inputst" type="password" id="inputSenha" name="inputSenha"
					placeholder="Insira sua Senha" Disabled=true> <input
					class="inputst" type="password" id="inputcSenha" name="inputcSenha"
					placeholder="Confirme sua Senha" Disabled=true> <br> <label
					id="lSenha" style="display: none;"></label> <input type="number"
					id="inputDDD" name="inputDDD" placeholder="DDD" maxlength="2"
					Disabled=true> <input class="inputst" type="text"
					id="inputTelefone" name="inputTelefone" placeholder="9 9999-9999"
					Disabled=true> <input id="bConcluir" type="submit"
					value="Concluir" disabled=true> <input id="bCancelar"
					type="button" value="Cancelar" disabled=true>
			</form>
		</div>
	</div>

	<img id="Uri" alt="Uritech"
		src="https://lh3.googleusercontent.com/69NhO4wMF7Rq3QibNaJs0NHj05G_ULOlmmFfNbS6iKhrYLDZxEkpe4-UciZURWKgOhl4ZrAWEZb_H6ZzE0XYcozAUcYyJfo40doOPjHplMroA9-riiX5YWMkX76G50ZHla0mHF5LLEb1Gu9lC04-Ye82YR3s2oOCV4-Qxj6FduyGyazsvgPF39AsxaFfgYTDAplTdJDMyLJW2vWNl4VvvQRLQgD3QQ2QTXJDlpdM7_447oRIn7QZT-gVQlf3CCSbjNnI5P6XvrbLmKAZECBj9P2ScHUduz8rfMLfske6wGCRQZ0ON24X1rJdINKqkidM7eZZO_QHKKk5sKEpBExaXG4iLB3059td7U7ZjAWtsnasBrnc6GGf7B87EXdaMYALFTHnLNRaESxoTyRbieoN6sWFQHt49IgntL7E-d6_gSjKWkGI2xBaCxA8EujVzmoqU_w02E6LXzKqnO3IDsRj3foYq9d5WbwH9-O1ZdyuXQ89QfSqwU6BZrJC1t5BaOA1V37R1EqdVq0rNSDqtWj-eaOPCUsb_IPAqfoaFkGokbbSiJcSD1bEgdqeEYTXNQZObZjPTZiwvlQwPxYpyNgtxBmpTDgjIruFGbFq8duB4jMlQvV4wef-qlyHb6knrAtlNlxylnx_10tnze0ABuXKo4DqIc5c6tjRgnoxNjLlAmwrhU8hH3juK_pTwmtrOXrLhxZnZPIa_XK5hpVS4pMU-Izr=w1087-h312-no?authuser=0">

	<script>
		'use strict'

		const consulta = document.getElementById("dConsultar");
		const inserir = document.getElementById("dIncluir");
		const alterar = document.getElementById("dAlterar");
		
		const concluir = document.getElementById("bConcluir");
		const cancelar = document.getElementById("bCancelar");

		let nome = document.getElementById("inputNome");
		let texto = document.getElementById("addTexto");
		let validacao = document.getElementById("validacaoTXT");
		
		
		cancelar.addEventListener("click", CancelarEntradaUsuario);
		consulta.addEventListener("click", consultar);
		inserir.addEventListener("click", AddUsuario);

		function consultar() {
			document.getElementById("inputNome").disabled = false;
			document.getElementById("inputEmail").disabled = false;
			document.getElementById("inputDDD").disabled = false;
			document.getElementById("inputTelefone").disabled = false;
			document.getElementById("bConcluir").disabled = false;
			document.getElementById("bCancelar").disabled = false;

			texto.innerText = "Insira um desses campos para buscar!"
			texto.style = "font-size:20px; color:white;position:absolute;top:-10%; left:15%; display:block;"

		}

		function AddUsuario() {
			document.getElementById("inputNome").disabled = false;
			document.getElementById("inputEmail").disabled = false;
			document.getElementById("inputDDD").disabled = false;
			document.getElementById("inputTelefone").disabled = false;
			document.getElementById("inputSenha").disabled = false;
			document.getElementById("bConcluir").disabled = false;
			document.getElementById("bCancelar").disabled = false;
			document.getElementById("inputcSenha").disabled = false;

			let texto = document.getElementById("addTexto");

			texto.innerText = "Crie sua Conta!"
			texto.style = "font-size:20px; color:white;position:absolute;top:-10%; left:35%; display:block;"

		}

		function CancelarEntradaUsuario() {
			document.getElementById("inputNome").disabled = true;
			document.getElementById("inputEmail").disabled = true;
			document.getElementById("inputDDD").disabled = true;
			document.getElementById("inputTelefone").disabled = true;
			document.getElementById("inputSenha").disabled = true;
			document.getElementById("bConcluir").disabled = true;
			document.getElementById("bCancelar").disabled = true;

			let texto = document.getElementById("addTexto");

			texto.innerText = ""

		}
	</script>


</body>
</html>