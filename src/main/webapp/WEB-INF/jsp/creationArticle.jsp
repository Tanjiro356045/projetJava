<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html lang="fr">
<head>
<meta charset="UTF-8">
<title>Enchere E.N.I - Création article</title>
<link href="<%=request.getContextPath()%>/css/styles-inscription.css"
	rel="stylesheet">
</head>

<body>

	<form action="" method="post"
		action="${pageContext.request.contextPath}/ajoutArticle">
		<h1>Nouvelle vente</h1>

		<div class="flex">

			<label for="article"><b>Article</b></label>
			<input type="text" placeholder="Max - 30 Caractères" name="article" required minlength="1" maxlength="30">
			
			<label for="description"><b>Description</b></label>
			<input type="text" placeholder="Max - 50 Caractères" name="description" required minlength="1" maxlength="50">
			
			<label for="categorie"><b>Catégorie</b></label> <input type="text" placeholder="Max - 30 Caractères" name="categorie" required minlength="1" maxlength="30">
			
			<label for="dateDebut"><b>Date début de l'enchère</b></label>
			<input type="date" placeholder="Max - 10 Caractères" name="dateDebut" required minlength="1" maxlength="10">
			
			<label for="dateFin"><b>Date fin de l'enchère</b></label>
			<input type="date" placeholder="Max - 10 Caractères" name="dateFin" required minlength="1" maxlength="10"> <br> <br>
			
			<label for="prixInitial"><b>Mise à prix</b></label>
			<input type="text" placeholder="Max - 10 Caractères" name="prixInitial" required minlength="1" maxlength="10">
			
			<label for="prixVente"><b>Prix de vente</b></label>
			<input type="text" placeholder="Max - 10 Caractères" name="prixVente" required minlength="1" maxlength="10">
			
			<label for="utilisateur"><b>N° utilisateur</b></label> <input type="text" placeholder="Max - 30 Caractères" name="utilisateur" required minlength="1" maxlength="30">

			<button type="submit" class="signupbtn">Enregistrer</button>
			
			<button type="button" class="cancelbtn">Annuler</button>

		</div>

		<form>
			<label for="photo"><b>Photo de l'article</b></label> <input
				type="file" id="myFile" name="photo"> <input type="submit">
		</form>
		<!-- <input type="text" placeholder="Max - 10 Caractères" name="photo" required minlength="1" maxlength="10"> -->

		<br>
		<hr>
		<br>
		<div class="retrait">
			<h1>Retrait</h1>

			<div class="input-field">
				<label for="rue">Rue</label> <input class="input" type="text" name="rue" id="rue" maxlength="100" required>
			</div>

			<div class="input-field">
				<label for="cp">Code Postal</label> <input class="input" type="text" name="codePostal" id="cp" step="1000" min="0" maxlength="5" required>
			</div>

			<div class="input-field">
				<label for="ville">Ville</label> <input class="input" type="text" name="ville" id="ville" required>
			</div>

		</div>

	</form>

</body>
</html>