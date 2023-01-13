<%@ page language="java" contentType="text/html;" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Eni-Enchères - Connexion</title>
<link href="<%=request.getContextPath()%>/css/styles-connexion.css" rel="stylesheet">
</head>
<body>
	<section>
		<form action="<%=request.getContextPath()%>/login" method="post">
			<div>
				<label for="id">Identifiant: </label> <input name="id" id="id"
					placeholder="Identifiant" required="required">
			</div>
			<div>

				<label for="mdp">Mot De Passe: </label> <input name="mdp" id="mdp"
					type="password" placeholder="Mot De Passe" required>
			</div>
			<div>

				<label>Se souvenir de moi</label> <input name="Ssdm" id="Ssdm"
					type="checkbox">
			</div>
			<div class="clearfix">

				<a href="#">Mot de passe oublié?</a>
			</div>
			<div>
				<button class="btn-login" type="submit">Connexion</button>
				

			</div>
			<div class="clearfix">
				<a href="<%=request.getContextPath()%>/register"><button
						class="btn-login" type="button">Créer un compte</button></a>
			</div>

		</form>

	</section>
</body>
</html>