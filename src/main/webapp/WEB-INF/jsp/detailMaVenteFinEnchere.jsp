<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Eni-Enchères - Détail gain enchère</title>
<link href="<%=request.getContextPath()%>/css/styles-article.css" rel="stylesheet">
</head>
<body>

	<div>	

	<h1>!getpseudoUtilisateur! a remporté l'enchère</h1>
	
	<p>Nom article</p>
	<p>Description</p>
	<p>Meilleure offre par !getpseudoUtilisateur!</p>
	<p>Mise à prix</p>
	<p>Fin de l'enchère</p>	
	<p>Retrait</p>
	<p>Vendeur !getpseudoVendeur!</p>
	
	<a href="${pageContext.request.contextPath}/accueilConnecter">
	<button type="submit" class="signupbtn">Retrait effectué</button>
	</a>
	
	</div>

</body>
</html>