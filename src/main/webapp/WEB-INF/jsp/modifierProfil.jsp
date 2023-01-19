<!-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="fr.eni.encheres.bo.Utilisateur"%> -->
<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="<%=request.getContextPath()%>/css/styles-modifier-profil.css" rel="stylesheet">
<title>Document</title>
</head>
<body>

<div class="center">

<form id="form_creation_login" method="post" action="${pageContext.request.contextPath}/modifierProfil">

<h1> ${user.pseudo } </h1> 
<div class="sign">
<h1>Modifier Mon Profil</h1>
<hr class="margt">

 

    <section class="LoggingForm">

 


    <div class="flexer">
<div class="gauche">

 

          <label for="prenom"><b>Prénom</b></label>
<input type="text" placeholder="Max - 30 Caractères" name="prenom" value="${user.prenom }" required minlength="1" maxlength="30"/>

 
 

          <label for="ville"><b>Ville</b></label>
<input type="text" placeholder="Max - 50 Caractères" name="ville" value="${user.ville }" required minlength="1" maxlength="50"/>

 

          <label for="rue"><b>Adresse</b></label>
<input type="text" placeholder="Max - 30 Caractères" name="rue" value="${user.rue }"  required minlength="1" maxlength="30"/>

 

          <label for="cdp"><b>Entrez code postal</b></label>
<input type="text" placeholder="Max - 10 Caractères" value="${user.codePostal }" name="code_postal" required minlength="1" maxlength="10"/>
</div>

 

        <div class="dif">
</div>

 

        

 



<div class="droite">

 

        <label for="nom"><b>Nom</b></label>
<input type="text" placeholder="Max - 30 Caractères" name="nom" value="${user.nom }" required minlength="1" maxlength="30" />

 

        <label for="email"><b>Email</b></label>
<input type="text" placeholder="Max - 50 Caractères" name="email" value="${user.email }" required minlength="1" maxlength="50"/>

 

        <label for="phone"><b>Téléphone</b></label>
<input type="text" placeholder="Max - 15 Caractères" value="${user.noTelephone }" name="no_telephone" required minlength="1" maxlength="15" />

 

        
<label for="psw"><b>Mot de passe actuel</b></label>
<input type="password" placeholder="Max - 30 Caractères" name="password" required minlength="1" maxlength="30"/>

 

        <label for="psw-repeat"><b>Nouveau mot de passe</b></label>
<input type="password" placeholder="Repetez mot de passe" name="password" required minlength="1" maxlength="30">
</div>
</div>

 

 


<div class="clearfix">
<a href="<%=request.getContextPath()%>/pageProfil"><button type="button" class="cancelbtn ajust1">Revenir</button></a>
<button type="submit" class="signupbtn">Valider</button>
</form>        
<form action="<%=request.getContextPath()%>/supprimerProfil" method="get">
<button type="submit" class="signupbtn warning">Supprimer mon Profil</button>
</form>
</div>

 


</section>
</div> 

</div>
</body>
</html>