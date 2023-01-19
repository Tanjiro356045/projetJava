[09:39] Maxence LE MAT
<%@page import="fr.eni.encheres.bo.ArticleVendu"%>
<%@page import="fr.eni.encheres.bo.Utilisateur"%>
<%@page import="fr.eni.encheres.bo.Categorie"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="<%=request.getContextPath()%>/css/styles-home-connecter.css" rel="stylesheet">
<title>Home</title>
<script src="java.js" defer> </script>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Advent+Pro:ital,wght@1,600&display=swap" rel="stylesheet">
</head>
<script src="https://kit.fontawesome.com/43dcc20e7a.js"></script>
<body>
 
 
<!-- NAVBAR -->
<<<<<<< HEAD
<div class="content" id="home"></div>
<header class="header-area">
<div class="navbar-area">
<div class="container">
<nav class="site-navbar">
<a href="#home" class="site-logo"><img class="eni" src="https://www.niort-tech.fr/wp-content/uploads/2015/02/ENIEcole.jpg" alt=""></a>
<ul>
<li><a href="<%=request.getContextPath()%>/allArticles">Enchères</a></li>
<li><a href="<%=request.getContextPath()%>/ajoutArticle">Vendre un article</a></li>
<li><a href="<%=request.getContextPath()%>/pageProfil">Mon profil</a></li>
<li><a href="<%=request.getContextPath()%>/accueilDeconnecter">Déconnexion</a></li>
</ul>
<button class="nav-toggler">
<span></span>
</button>
 
</nav>
<h1 class="titre">Liste des enchères</h1>
=======
    <div class="content" id="home"></div>
		<header class="header-area">
			<div class="navbar-area">
			  <div class="container">
				<nav class="site-navbar">
				  <a href="#home" class="site-logo"><img class="eni" src="https://www.niort-tech.fr/wp-content/uploads/2015/02/ENIEcole.jpg" alt=""></a>
				  <ul>
					<li><a href="<%=request.getContextPath()%>/allArticles">Enchères</a></li>
					<li><a href="<%=request.getContextPath()%>/ajoutArticle">Vendre un article</a></li>
					<li><a href="<%=request.getContextPath()%>/pageProfil">Mon profil</a></li>
					<li><a href="<%=request.getContextPath()%>/seDeconnecter">Déconnexion</a></li>
				  </ul>
				  <button class="nav-toggler">
					<span></span>
				  </button>
                  
				</nav>
                <h1 class="titre">Liste  des  enchères</h1>
			  </div>
			</div>
    </header>
    
    <div class="container-search">
        <div class="search-box">
           <input type="text" class="search-input" placeholder="Search..">
     
           <button class="search-button">
             <i class="fas fa-search"></i>
           </button>
        </div>
    </div>    
   


    <div class="column flexer modiful modiful-mobile">
    <h1 class="titre-categories categories1"> Catégories</h1> 
   
    <div class="column"> 
     <div class="recherche-sup recherche-sup1 size-mobile">
        <div class="flexer-mobile flexer">
        <div class="margingR">
             <input type="checkbox" id="button-rad" class="ajust-input1" name="drone" value="button-rad"
                 checked>
             <label class="button-rad button-rad1" for="button-rad">Achats</label>
        
    
            <ul>
                <li>
                    <input name="Ssdm" id="Ssdm" type="checkbox">
                    <label class="ssdm" for="Ssdm">Enchères ouvertes</label>
                </li>

                <li>
                    <input name="Ssdm" id="Ssdm" type="checkbox">
                    <label class="ssdm" for="Ssdm">Mes enchères en cours</label>
                </li>
                
                <li>
                    <input name="Ssdm" id="Ssdm" type="checkbox">
                    <label class="ssdm" for="Ssdm">Mes enchères remportées</label>
                </li>
            </ul>
   
    </div>


        <div>
            <input type="checkbox" id="button-rad" class="ajust-input2" name="drone" value="button-rad"
                   checked>
            <label class="button-rad button-rad1" for="button-rad">Mes Ventes</label>
        

        <ul>
            <li class="ajust ajust-mobile">
                <input name="Ssdm" id="Ssdm" type="checkbox">
                <label class="ssdm" for="Ssdm">Mes ventes en cours</label>
            </li>
            
            <li class="ajust ajust-mobile">
                <input name="Ssdm" id="Ssdm" type="checkbox">
                <label class="ssdm" for="Ssdm">Ventes non débutés</label>
            </li>

            <li>
                <input name="Ssdm" id="Ssdm" type="checkbox">
                <label class="ssdm" for="Ssdm">Ventes terminées</label>
            </li>
        </ul>
        </div>
    </div>  
    </div>
>>>>>>> branch 'master' of https://github.com/Tanjiro356045/projetJava.git
</div>
</div>
</header>
 
<div class="container-search">
<div class="search-box">
<input type="text" class="search-input" placeholder="Search..">
 
<button class="search-button">
<i class="fas fa-search"></i>
</button>
</div>
</div>
 
 
 
<div class="column flexer modiful modiful-mobile">
<h1 class="titre-categories categories1"> Catégories</h1>
 
<div class="column">
<div class="recherche-sup recherche-sup1 size-mobile">
<div class="flexer-mobile flexer">
<div class="margingR">
<input type="checkbox" id="button-rad" class="ajust-input1" name="drone" value="button-rad"
checked>
<label class="button-rad button-rad1" for="button-rad">Achats</label>
 
 
<ul>
<li>
<input name="Ssdm" id="Ssdm" type="checkbox">
<label class="ssdm" for="Ssdm">Enchères ouvertes</label>
</li>
 
<li>
<input name="Ssdm" id="Ssdm" type="checkbox">
<label class="ssdm" for="Ssdm">Mes enchères en cours</label>
</li>
 
<li>
<input name="Ssdm" id="Ssdm" type="checkbox">
<label class="ssdm" for="Ssdm">Mes enchères remportées</label>
</li>
</ul>
 
</div>
 
 
<div>
<input type="checkbox" id="button-rad" class="ajust-input2" name="drone" value="button-rad"
checked>
<label class="button-rad button-rad1" for="button-rad">Mes Ventes</label>
 
 
<ul>
<li class="ajust ajust-mobile">
<input name="Ssdm" id="Ssdm" type="checkbox">
<label class="ssdm" for="Ssdm">Mes ventes en cours</label>
</li>
 
<li class="ajust ajust-mobile">
<input name="Ssdm" id="Ssdm" type="checkbox">
<label class="ssdm" for="Ssdm">Ventes non débutés</label>
</li>
 
<li>
<input name="Ssdm" id="Ssdm" type="checkbox">
<label class="ssdm" for="Ssdm">Ventes terminées</label>
</li>
</ul>
</div>
</div>
</div>
</div>
</div>
 
 
<div class="box1 box1-mobile">
<div class="testarticle">
 
<table>
<thead>
<tr>
<th>Vendeur</th>
<th>Catégorie</th>
<th>Article</th>
<th>Description</th>
<th>Début enchères</th>
<th>Fin enchères</th>
<th>Mise à prix</th>
<th>Prix de vente</th>
<th>Enchérir</th>
</tr>
</thead>
 
<%
List<ArticleVendu> listeAllArticles = (List<ArticleVendu>) request.getAttribute("listeArticles");
if(listeAllArticles != null && listeAllArticles.size()>0){
%>
<tbody>
<%
for(ArticleVendu art : listeAllArticles){
%>
<tr>
<td><%=art.getUtilisateur().getPseudo() %></td>
<td><%=art.getCategorie().getLibelle() %></td>
<td><%=art.getNomArticle() %></td>
<td><%=art.getDescription() %></td>
<td><%=art.getDateDebutEncheres() %></td>
<td><%=art.getDateFinEncheres() %></td>
<td><%=art.getMiseAPrix() %></td>
<% if(art.getPrixVente()!=0){
%>
<td><%=art.getPrixVente() %></td>
<%
} else{
%>
<td>Enchère en cours</td>
<%
}
%>
<% if(art.getPrixVente()!=0){
%>
<td><i>Enchère clôturée</i></td>
<%
} else{
%>
<td> <button type = "submit">Enchérir</button> </td>
<%
}
%>
</tr>
<%
}
%>
</tbody>
<%
}
%>
</table> </div>
<div class="testarticle"> </div>
<div class="testarticle"> </div>
</div>
 
<div class="box2 box2-mobile">
<div class="testarticle"> </div>
<div class="testarticle"> </div>
<div class="testarticle"> </div>
</div>
 
<div class="box3 box3-mobile">
<div class="testarticle"> </div>
<div class="testarticle"> </div>
<div class="testarticle"> </div>
</div>
 
 
</body>
</html>

