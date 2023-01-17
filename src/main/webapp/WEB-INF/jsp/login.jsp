<%@ page language="java" contentType="text/html;"
    pageEncoding="UTF-8"%>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="<%=request.getContextPath()%>/css/styles-connexion.css" rel="stylesheet">
    <title>Document</title>
</head>
<body>
    
    <div class="center">
        <form action="<%=request.getContextPath() %>/login" style="border:1px solid #ccc;  box-shadow: 0px 0px 10px rgb(255, 255, 255);">
      <div class="sign">
        <h1>Se connecter</h1>
        <hr>


        <div class="flexer">
        <div class="gauche">
		
          <label for="prenom"><b>Nom du compte</b></label>
          <input type="text" placeholder="Max - 30 Caractères" name="nom" required minlength="1" maxlength="30">
		<div class="form2">		
		  <label for="nom"><b>Mot de passe</b></label>
		  <input type="text" placeholder="Max - 30 Caractères" name="nom" required minlength="1" maxlength="30">
		 </div> 
        </div>

        <div class="dif">
        <hr class="hr2">
        </div>
    
        <div class="droite img1"></div>
    </div>

        <label>
          <input type="checkbox" checked="checked" name="souvenir" style="margin-bottom:15px"> souvenir de moi 
        </label>

        <p> Vous n'avez pas de compte ? <a href="<%=request.getContextPath()%>/createLogin">Inscrivez-vous</a>.</p>

        <div class="clearfix">
           <button onclick="location.href='<%=request.getContextPath()%>/accueilDeconnecter'" type="button" class="cancelbtn"> Retour a l'accueil</button>
          <button type="submit" class="signupbtn">Se connecter</button>
        </div>
      </div>
    </form>		
   </div> 		
</body>
</html>