<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<title>Eni-Enchères - Gain enchère</title>
<link href="<%=request.getContextPath()%>/css/styles-article.css" rel="stylesheet">
</head>
<body>

	<div>	

	<h1>Vous avez remporté la vente</h1>
	
	<p>Nom article</p>
	<p>Description</p>
	<p>Meilleure offre</p>
	<p>Mise à prix</p>
	<p>Retrait</p>
	<p>Vendeur</p>
	<p>Tel</p>
	
	<a href="${pageContext.request.contextPath}/accueilConnecter" class="backbtn">
		<button type="submit" class="backbtn">Retour</button>
	</a>
	
	</div>
	
</body>
</html>  