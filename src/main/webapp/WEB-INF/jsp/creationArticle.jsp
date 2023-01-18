<%@page import="fr.eni.encheres.bo.Categorie"%>
<%@page import="fr.eni.encheres.bll.ManagerCategorie"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Advent+Pro:ital,wght@1,600&display=swap" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/css/styles-inscription.css" rel="stylesheet">
    <title>Document</title>
</head>
<body>

    <div class="center mobile">
    <form method="post" class="width100" action="${pageContext.request.contextPath}/ajoutArticle">
        <h1 class="center modif-titre">Nouvelle vente</h1>

        <div class="center">

        <div class="flex width100">
            <div class="box1">
                <h1 class="center">Votre Article</h1>
                <label for="article"><b class="center margB10-mobile margT25-mobile">Article</b></label>
                <input type="text" placeholder="Max - 30 Caractères" name="article" required minlength="1" maxlength="30">
            
                <label for="description"><b class="center margB10-mobile">Description</b></label>
                <input type="text" placeholder="Max - 50 Caractères" name="description" required minlength="1" maxlength="50">
            </div>

        <div class="box2">
			<div class="input-field"> 
                <div class="box2-cat">
                    <h1 class="center">Ajouter une catégorie</h1>
                    
<!--           		<label class="box2-modif-mobile box2-modif2-mobile" for="categorie">Catégorie</label>
          		<input type="text" placeholder="Max - 50 Caractères" name="id Catégorie" required minlength="1" maxlength="50"> -->
         		   
          		    <select name="categorie" class="input margT25-mobile" id="categorie">
                        <% for(Categorie categorie : ManagerCategorie.selectAllCat()) { %>
            	        <option  value ="<%=categorie.getNoCategorie()%>"><%=categorie.getLibelle()%></option>
            	        <% } %> 
          		     </select>
          		     
                </div>
                        <br>
                <div class="box2-debenchere">
                          <label for="dateDebut" class="margT25-mobile box2-modif-mobile box2-modif3-mobile"><b>Début de l'enchère</b></label>
                          <input type="date" placeholder="Max - 10 Caractères" name="dateDebut" required minlength="1" maxlength="10">
                </div>
                          <br>
                <div class="box2-finenchere"></div>
                          <label for="dateFin" class="box2-modif-mobile box2-modif4-mobile"><b>Fin de l'enchère</b></label>
                          <input type="date" placeholder="Max - 10 Caractères" name="dateFin" required minlength="1" maxlength="10">
                </div>
             </div>
        </div>
			
        <div class="box3"> 
            <h1 class="center">Prix de l'article</h1>
			<label for="prixInitial"><b class="center margT25-mobile">Mise à prix</b></label>
			<input type="text" placeholder="Max - 10 Caractères" name="prixInitial" required minlength="1" maxlength="10">
			
<!-- 			<label for="prixVente"><b class="center">Prix de vente</b></label>
			<input type="text" placeholder="Max - 10 Caractères" name="prixVente" required minlength="1" maxlength="10"> -->
        </div>    
			
			<!-- <label for="utilisateur"><b class="center">N° utilisateur</b></label>
			<input type="text" placeholder="Max - 30 Caractères" name="utilisateur" required minlength="1" maxlength="30"> -->

            <!-- <div class="box4">
                <h1 class="center">Retrait</h1>
    
                <div class="input-field margT25-mobile">
                    <label class="center" for="rue">Rue</label> <input class="input" type="text" name="rue" id="rue" maxlength="100" required>
                </div>
    
                <div class="input-field margT25-mobile">
                    <label class="center" for="cp">Code Postal</label> <input class="input" type="text" name="codePostal" id="cp" step="1000" min="0" maxlength="5" required>
                </div>
    
                <div class="input-field margT25-mobile">
                    <label class="center" for="ville">Ville</label> <input class="input" type="text" name="ville" id="ville" required>
                </div>
            </div> -->
        </div> 
            <!-- <input type="text" placeholder="Max - 10 Caractères" name="photo" required minlength="1" maxlength="10"> -->
        <div class="box4-modif">
            <a href="${pageContext.request.contextPath}/accueilConnecter">
				<button type="button" class="cancelbtn">Annuler</button>
			</a>

			<a href="${pageContext.request.contextPath}/accueilConnecter">
				<button type="submit" class="signupbtn">Enregistrer</button>
			</a>	
		</div>
    
	</form>
</div>
</body>
</html>