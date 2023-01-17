<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html lang="fr">
	<head>	
		<meta charset="UTF-8">
		<title>Enchere E.N.I - Inscription</title>
		<link href="<%=request.getContextPath()%>/css/styles-inscription.css" rel="stylesheet">
	</head>

		<body>
    
    <div class="center">
    
        <form action="<%=request.getContextPath() %>/createLogin" method="post">
        
      <div class="sign">
        <h1>S'inscrire</h1>
        <p> Merci de remplir ce formulaire pour créer un compte.</p>
        <hr>

        <div class="flexer">
       	 <div class="gauche">

          <label for="prenom"><b>Prénom</b></label>
          <input type="text" placeholder="Max - 30 Caractères" name="prenom" required minlength="1" maxlength="30"/>

          <label for="ville"><b>Ville</b></label>
          <input type="text" placeholder="Max - 50 Caractères" name="ville" required minlength="1" maxlength="50"/>

          <label for="rue"><b>Adresse</b></label>
          <input type="text" placeholder="Max - 30 Caractères" name="adresse" required minlength="1" maxlength="30"/>

          <label for="cdp"><b>Entrez code postal</b></label>
          <input type="text" placeholder="Max - 10 Caractères" name="codepostal" required minlength="1" maxlength="10"/>

          <label for="Pseudo"><b>Pseudo</b></label>
          <input type="text" placeholder="Max - 30 Caractères" name="pseudo" required minlength="1" maxlength="30"/>
        </div>



        <div class="dif">
        <hr class="hr2">
        </div>


        
        <div class="droite">

        <label for="nom"><b>Nom</b></label>
        <input type="text" placeholder="Max - 30 Caractères" name="nom" required minlength="1" maxlength="30" />

        <label for="email"><b>Email</b></label>
        <input type="text" placeholder="Max - 50 Caractères" name="email" required minlength="1" maxlength="50"/>

        <label for="phone"><b>Téléphone</b></label>
        <input type="text" placeholder="Max - 15 Caractères" name="telephone" required minlength="1" maxlength="15" />

        
        <label for="psw"><b>Mot de passe</b></label>
        <input type="password" placeholder="Max - 30 Caractères" name="password" required minlength="1" maxlength="30"/>

        <label for="psw-repeat"><b>Repeter votre mot de passe</b></label>
        <input type="password" placeholder="Repetez mot de passe" name="password-repeat" required minlength="1" maxlength="30">
      </div>
    </div>

        <label>
          <input type="checkbox" checked="checked" name="souvenir" style="margin-bottom:15px"> souvenir de moi 
        </label>

        <p> En créant un compte, vous acceptez nos <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>

        <div class="clearfix">
          <button onclick="location.href='<%=request.getContextPath()%>/login'" type="button" class="cancelbtn"> Revenir a la page de connexion</button>
          <button type="submit" class="signupbtn"> Inscription</button>
        </div>
      </div>
    </form>		
   </div> 		
</body>
</html>