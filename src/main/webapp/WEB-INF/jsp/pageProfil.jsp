<%@ page language="java" contentType="text/html;"
    pageEncoding="UTF-8"%>
<%@page import="fr.eni.encheres.bo.Utilisateur"%>
<!DOCTYPE html>
    <html lang="fr">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"content="width=device-width, initial-scale=1.">
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

		<p> Pseudo : ${user.pseudo }</p>
		<p> Nom : ${user.nom }</p>
		<p> Prenom : ${user.prenom }</p>
		<p> Email : ${user.email }</p>
		<p> Telephone : ${user.noTelephone }</p>
		<p> Rue : ${user.rue }</p>
		<p> Code Postal : ${user.codePostal }</p>
		<p> Ville : ${user.ville }</p>
		
	</div>
		<button onclick="location.href='<%=request.getContextPath()%>/modifierProfil'" type="button" class="cancelbtn">Modifier</button>
		
		<a href="<%=request.getContextPath()%>/accueilConnecter"><button type="submit">Retour accueil</button> </a>
		
		
</body>
</html>