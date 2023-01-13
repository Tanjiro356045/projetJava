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
          <label for="article"><b>Article</b></label>
          <input type="text" placeholder="Max - 30 Caractères" name="article" required minlength="1" maxlength="30">

          <label for="description"><b>Description</b></label>
          <input type="text" placeholder="Max - 50 Caractères" name="description" required minlength="1" maxlength="50">

          <label for="cat"><b>Catégorie</b></label>
          <input type="text" placeholder="Max - 30 Caractères" name="cat" required minlength="1" maxlength="30">

          
          <form action="/action_page.php">
          <label for="photo"><b>Photo de l'article</b></label>
			<input type="file" id="myFile" name="photo">
			<input type="submit">
			</form>
          <!-- <input type="text" placeholder="Max - 10 Caractères" name="photo" required minlength="1" maxlength="10"> -->
          
          <label for="prixInitial"><b>Mise à prix</b></label>
          <input type="text" placeholder="Max - 10 Caractères" name="prixInitial" required minlength="1" maxlength="10">
          
          <label for="dateDebut"><b>Date début de l'enchère</b></label>
          <input type="date" placeholder="Max - 10 Caractères" name="dateDebut" required minlength="1" maxlength="10">
          
          <label for="dateFin"><b>Entrez code postal</b></label>
          <input type="date" placeholder="Max - 10 Caractères" name="dateFin" required minlength="1" maxlength="10">
          
          <br>
          <hr>
          <br>
          <h2>Retrait</h2>
          <p>à faire</p>
                    
        </div>

	</body>
	</html>