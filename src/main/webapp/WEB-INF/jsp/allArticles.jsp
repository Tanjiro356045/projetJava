<%@page import="fr.eni.encheres.bo.ArticleVendu"%>
<%@page import="fr.eni.encheres.bo.Utilisateur"%>
<%@page import="fr.eni.encheres.bo.Categorie"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enchere E.N.I - Afficher articles</title>
</head>
<body>
<!-- bidon -->

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
	</table>

	<a href="<%=request.getContextPath()%>/accueilConnecter"><button type="submit">Retour accueil</button> </a>

</body>
</html>