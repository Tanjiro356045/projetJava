<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet"  href="<%=request.getContextPath()%>/css/styles-home-connecter.css">
    <title>Home</title>
    <script src="<%=request.getContextPath()%>/javascript/java.js" defer> </script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Advent+Pro:ital,wght@1,600&display=swap" rel="stylesheet">
</head>
<script src="https://kit.fontawesome.com/43dcc20e7a.js" crossorigin="anonymous"></script>
<body>


<!-- NAVBAR -->
    <div class="content" id="home"></div>
		<header class="header-area">
			<div class="navbar-area">
			  <div class="container">
				<nav class="site-navbar">
				  <a href="#home" class="site-logo"><img class="eni" src="https://www.niort-tech.fr/wp-content/uploads/2015/02/ENIEcole.jpg" alt=""></a>
				  <ul>
					<li><a href="<%=request.getContextPath()%>/accueilConnecter">Ench�res</a></li>
					<li><a href="<%=request.getContextPath()%>/creationArticle">Vendre un article</a></li>
					<li><a href="<%=request.getContextPath()%>/pageProfil">Mon profil</a></li>
					<li><a href="<%=request.getContextPath()%>/accueilDeconnecter">D�connexion</a></li>
				  </ul>
				  <button class="nav-toggler">
					<span></span>
				  </button>
                  
				</nav>
                <h1 class="titre">Liste  des  ench�res</h1>
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
   



    <h1 class="titre-categories"> Cat�gories</h1> 
<div class="flexer-mobile"> 
     <div class="recherche-sup">
        <div>
             <input type="checkbox" id="button-rad" name="drone" value="button-rad"
                 checked>
             <label class="button-rad" for="button-rad">Achats</label>
        
            <ul>
                <li>
                    <input name="Ssdm" id="Ssdm" type="checkbox">
                    <label class="ssdm" for="Ssdm">Ench�res ouvertes</label>
                </li>

                <li>
                    <input name="Ssdm" id="Ssdm" type="checkbox">
                    <label class="ssdm" for="Ssdm">Mes ench�res en cours</label>
                </li>
                
                <li>
                    <input name="Ssdm" id="Ssdm" type="checkbox">
                    <label class="ssdm" for="Ssdm">Mes ench�res remport�es</label>
                </li>
            </ul>
        </div>
    </div>


        <div>
            <input type="checkbox" id="button-rad" name="drone" value="button-rad"
                   checked>
            <label class="button-rad" for="button-rad">Mes Ventes</label>
        

        <ul>
            <li>
                <input name="Ssdm" id="Ssdm" type="checkbox">
                <label class="ssdm" for="Ssdm">Mes ventes en cours</label>
            </li>
            
            <li>
                <input name="Ssdm" id="Ssdm" type="checkbox">
                <label class="ssdm" for="Ssdm">Ventes non d�but�s</label>
            </li>

            <li>
                <input name="Ssdm" id="Ssdm" type="checkbox">
                <label class="ssdm" for="Ssdm">Ventes termin�es</label>
            </li>
        </ul>
        </div>  
    </div>

    <div class="testarticle"> </div>
    <div class="testarticle"> </div>
    <div class="testarticle"> </div>
    <div class="testarticle"> </div>
    <div class="testarticle"> </div>
    <div class="testarticle"> </div>
    <div class="testarticle"> </div>
    
         
    
    
</body>
</html>