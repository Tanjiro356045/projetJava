<!-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="fr.eni.encheres.bo.Utilisateur"%> -->
<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="<%=request.getContextPath()%>/css/styles-page-profil.css" rel="stylesheet">
<link rel="stylesheet" href="styles.css">
<title>Document</title>
</head>
<body>

<div class="center">


<div class="sign">
<h1> ${user.pseudo } </h1> 
<h1>Mon Profil</h1>
<hr class="margt">

<div class="flexer">
    <div class="gauche">

    <label for="prenom"><b>Prénom</b></label>
    <input class="white" type="text" placeholder="Max - 30 Caractères" name="prenom" value="${user.prenom }" readonly/>

    <label for="ville"><b>Ville</b></label>
    <input class="white" type="text" placeholder="Max - 50 Caractères" name="ville" value="${user.ville }" readonly/>

    <label class="white"for="rue"><b>Adresse</b></label>
    <input class="white"type="text" placeholder="Max - 30 Caractères" name="rue" value="${user.rue }" readonly />

    <label class="white"for="cdp"><b>Entrez code postal</b></label>
    <input class="white"type="text" placeholder="Max - 10 Caractères" value="${user.codePostal }" name="code_postal" readonly/>
</div>


<div class="droite">

        <label class="white" for="nom"><b>Nom</b></label>
        <input class="white" type="text" placeholder="Max - 30 Caractères" name="nom" value="${user.nom }" readonly />

        <label class="white" for="email"><b>Email</b></label>
        <input class="white" type="text" placeholder="Max - 50 Caractères" name="email" value="${user.email }" readonly/>
         <label class="white" for="phone"><b>Téléphone</b></label>
        <input class="white" type="text" placeholder="Max - 15 Caractères" value="${user.noTelephone }" name="no_telephone" readonly/>
</div>

</div>



<div class="clearfix center-btn">
    <button onclick="location.href='<%=request.getContextPath()%>/modifierProfil'" type="button" class="cancelbtn"> Modifier</button>
       <button onclick="location.href='<%=request.getContextPath()%>/accueilConnecter'" type="submit" class="signupbtn"> Retour acceuil</button>
</div>

</div>
</div>
</body>
</html>