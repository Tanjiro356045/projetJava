<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<title>Enchere E.N.I - Enchérir</title>
<link href="<%=request.getContextPath()%>/css/styles-article.css"
	rel="stylesheet">
</head>
<body>

	<form action="" method="post" action="${pageContext.request.contextPath}/ajoutArticle">
		<h1>Détail vente</h1>

		<div class="flex">
		
			<br><br>
			<label for="article"><b>Article :</b></label>
			<br><br>
			<label for="description"><b>Description :</b></label>
			<br><br>
			<label for="categorie"><b>Catégorie :</b></label>
			<br><br>
			<label for="meilleurPrix"><b>Meilleure offre :</b></label>
			<br><br>
			<label for="prixInitial"><b>Mise à prix :</b></label>
			<br><br>
			<label for="dateFin"><b>Fin de l'enchère :</b></label>
			<br><br>
			<label for="retrait"><b>Retrait :</b></label>
			<br><br>
			<label for="vendeur"><b>Vendeur :</b></label>
			<br><br>
			<label for="proposition"><b>Ma proposition :</b></label>
			<br><br>
			<br><br>
			<div class="form-group">
				<label id="number-label" for="number"></label>Ma proposition
				<input type="number" name="montant" id="number" class="form-control" placeholder="Enchérir" />
			</div>
			<br><br>
			<br><br>

			<div class="panelboutons">
			
			<button type="submit" class="signupbtn">
				<a href="${pageContext.request.contextPath}/accueilConnecter" class="signupbtn">Enchérir</a>
			</button>
						
			<a href="${pageContext.request.contextPath}/accueilConnecter">
				<button type="button" class="cancelbtn">Précédent</button>
			</a>
			
<!-- 			<button type="submit" class="signupbtn">Enchérir</button>
			<button type="button" class="cancelbtn">Précédent</button> -->
			</div>

		</div>

	</form>

</body>
</html>