<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html lang="fr">
	<head>	
		<meta charset="UTF-8">
		<title>Enchere E.N.I - Création article</title>
		<link href="<%=request.getContextPath()%>/css/styles-inscription.css" rel="stylesheet">
	</head>

	<body>
	
		<h1>Nouvelle vente</h1>
		
      	 <div class="flex">
          
          <form action="" method="post" action="${pageContext.request.contextPath}/ajoutArticle">
          <label for="article"><b>Nom de l'article</b></label>
          <input type="text" placeholder="Max - 30 Caractères" name="article" required minlength="1" maxlength="30">

          <label for="description"><b>Description</b></label>
          <input type="text" placeholder="Max - 50 Caractères" name="description" required minlength="1" maxlength="50">
          
          <label for="dateDebut"><b>Date début de l'enchère</b></label>
          <input type="date" placeholder="Max - 10 Caractères" name="dateDebut" required minlength="1" maxlength="10">
          
          <label for="dateFin"><b>Date fin de l'enchère</b></label>
          <input type="date" placeholder="Max - 10 Caractères" name="dateFin" required minlength="1" maxlength="10">
          
          <br> <br>
          
          <label for="prixInitial"><b>Prix initial</b></label>
          <input type="text" placeholder="Max - 10 Caractères" name="prixInitial" required minlength="1" maxlength="10">
          
          <label for="prixVente"><b>Prix de vente</b></label>
          <input type="text" placeholder="Max - 10 Caractères" name="prixVente" required minlength="1" maxlength="10">
          
          <label for="utilisateur"><b>N° utilisateur</b></label>
          <input type="text" placeholder="Max - 30 Caractères" name="utilisateur" required minlength="1" maxlength="30">
          
          <label for="categorie"><b>N° catégorie</b></label>
          <input type="text" placeholder="Max - 30 Caractères" name="categorie" required minlength="1" maxlength="30">
          
          <button type="submit" class="signupbtn">Enregistrer</button>
          </form>
          
         </div>
                   
          <!-- <div class="clearfix">
          
          </div> -->


		<form action="/action_page.php">
			<label for="photo"><b>Photo de l'article</b></label> <input
				type="file" id="myFile" name="photo"> <input type="submit">
		</form>
		<!-- <input type="text" placeholder="Max - 10 Caractères" name="photo" required minlength="1" maxlength="10"> -->
          
          
          <br>
          <hr>
          <br>
          <h2>Retrait</h2>
          <p>à faire</p>
                    
        
	</body>
	</html>