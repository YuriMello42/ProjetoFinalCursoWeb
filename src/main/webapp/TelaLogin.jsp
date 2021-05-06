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
<link rel="stylesheet" href="css/Login.css">

<title>Login</title>
</head>
<body>
<div>
</div>


	<div>
		<img id="logo" alt="LogoMarca Uritech"
			src="https://lh3.googleusercontent.com/69NhO4wMF7Rq3QibNaJs0NHj05G_ULOlmmFfNbS6iKhrYLDZxEkpe4-UciZURWKgOhl4ZrAWEZb_H6ZzE0XYcozAUcYyJfo40doOPjHplMroA9-riiX5YWMkX76G50ZHla0mHF5LLEb1Gu9lC04-Ye82YR3s2oOCV4-Qxj6FduyGyazsvgPF39AsxaFfgYTDAplTdJDMyLJW2vWNl4VvvQRLQgD3QQ2QTXJDlpdM7_447oRIn7QZT-gVQlf3CCSbjNnI5P6XvrbLmKAZECBj9P2ScHUduz8rfMLfske6wGCRQZ0ON24X1rJdINKqkidM7eZZO_QHKKk5sKEpBExaXG4iLB3059td7U7ZjAWtsnasBrnc6GGf7B87EXdaMYALFTHnLNRaESxoTyRbieoN6sWFQHt49IgntL7E-d6_gSjKWkGI2xBaCxA8EujVzmoqU_w02E6LXzKqnO3IDsRj3foYq9d5WbwH9-O1ZdyuXQ89QfSqwU6BZrJC1t5BaOA1V37R1EqdVq0rNSDqtWj-eaOPCUsb_IPAqfoaFkGokbbSiJcSD1bEgdqeEYTXNQZObZjPTZiwvlQwPxYpyNgtxBmpTDgjIruFGbFq8duB4jMlQvV4wef-qlyHb6knrAtlNlxylnx_10tnze0ABuXKo4DqIc5c6tjRgnoxNjLlAmwrhU8hH3juK_pTwmtrOXrLhxZnZPIa_XK5hpVS4pMU-Izr=w1087-h312-no?authuser=0">
	</div>

	<div class="card"
		style="width: 20rem; position: absolute; top: 33%; left: 40%; background: black; border-color: gray;">
		
		<img id="usu" style="position:absolute; top:-25% ;left:25%; width: 170px; height: 110px;" alt="Usuario" src="https://lh3.googleusercontent.com/APMfntx3ALEoqdjD_zMGEWpjNpNoCBEBlJ8zq1RVZFe3iH51tLcOA0vmqrHTOn7GoPJl8TCLHuhbnEDfxYeyumFrftbd5IKgLUbPB-BNZUqVyKyiH6FBnzAIc8ik8FozmJVi6VBHueYEKh8Tf_jgisfhg9ep-8AIi95RiT681lgKa6hFzDvpl-5MmQ87bK8vuoIoJguJZ4c-5vD02vK6-8EY9UIRZyVloebgUKXB20rUdGWx5atfw3wRUVDm8ip1S_8r2LF9lyXXkENCNjEqSUll2UAnntI_KO4J_mHX0XZ1dfAd3oB6uEQtQCSONJRHmYCijjTZL9yKi7NWjp6q2DQuZPvwfWF55V-YACWoUqTUxaw5X7TCrTqegUF5ebz4ElOMrGXEBGwMQNTvZCcAWdNQCzU8FI4GrizlbEyK5lKruAVNmifVfUMDdq1CExteLJwfGutPv1sufgvqJkjCGNgkb1OkJI1KFW3fy1jh6w8S_p-_7T6SkE-AFYCUcdG-fkSc2PoVyKFh78vaI_crUP7xFRIHjT35Kh2r5CFF13s_gEZx5GMJWCcaYrx9g12zLc8_nyWPF8Ibg8qomtSWgUqjwScxz_4pCsJLU5H66WoSkLztB0JnREWOzF_CLFg03cGtOhMrEuoWHGFZ1Nfl1Koo4Okt_qJs1FCgw7BC2ZD480bU5-0Dx6Ju6pSBdlzOTKW2nBwtp9mFzwxyuS6yh8jv=w1333-h758-no?authuser=0">
		
		<div class="card-body">
			<h5 class="card-title" style="color: white;">Login</h5>
			<p></p>
			<p class="card-subtitle mb-2 text-muted" id="ppp">Bem vindo de volta!</p>

			<center>
			<form method="post" action="conexao">
				<input id="iUsuario" name="iUsuario" class="input" type="text"
					placeholder="Insira seu Usuário"><img
					style="width: 20px; height: 20px; position: absolute; left: 84%; top: 37%;"
					alt="Usuario"
					src="https://www.senscience.com.br/arquivos/BONECO2.png?v=637248273172530000">

				<input id="iSenha" name="iSenha" class="input" type="password"
					placeholder="Insira sua Senha"><img
					style="width: 20px; height: 20px; position: absolute; left: 84%; top: 52%;"
					alt="Senha"
					src="https://icons555.com/images/icons-gray/image_icon_padlock_pic_512x512.png">

				<br>
				<p></p>
				
				<p>
					<input type="submit" id="bEntrar" name="bEntrar" value="Entrar">
				</p>
</form>

			</center>
		</div>

	</div>




</body>
</html>