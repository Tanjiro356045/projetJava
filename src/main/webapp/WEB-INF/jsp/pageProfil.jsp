<%@ page language="java" contentType="text/html;"
    pageEncoding="UTF-8"%>
<%@page import="fr.eni.encheres.bo.Utilisateur"%>
<!DOCTYPE html>
    <html lang="fr">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"content="width=device-width, initial-scale=1.">
        <link href="<%=request.getContextPath()%>/css/styles-page-profil.css" rel="stylesheet">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <script src="https://kit.fontawesome.com/1cbc331981.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="styles/style.css">
        <link rel="stylesheet" href="styles/navbar.css">
        <link rel="stylesheet" href="styles/profil.css">
        <title>ENI-Enchères/Mon Profil</title>
    </head>
    <body>
      <div class="head">
        <h1>Mon Profil</h1>
      </div>
   		<form action="<%=request.getContextPath()%>/ServletAfficherProfil"
   		method="GET" target="_blank"></form>
   		
	<div class = paragraphes>

		<p> <b>Pseudo :</b> ${user.pseudo }</p>
		<p> <b>Nom :</b> ${user.nom }</p>
		<p> <b>Prenom :</b> ${user.prenom }</p>
		<p> <b>Email :</b> ${user.email }</p>
		<p> <b>Telephone :</b> ${user.noTelephone }</p>
		<p> <b>Rue :</b> ${user.rue }</p>
		<p> <b>Code Postal :</b> ${user.codePostal }</p>
		<p> <b>Ville :</b> ${user.ville }</p>
		
	</div>
		<button onclick="location.href='<%=request.getContextPath()%>/modifierProfil'" type="button" class="cancelbtn">Modifier</button>
		
		<a href="<%=request.getContextPath()%>/accueilConnecter"><button type="submit" class="return">Retour accueil</button> </a>
		
		
</body>
</html>