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

	<div class="row">
		<c:choose>
			<c:when test="${listeArticles.size()>0}">
				<ul class="list-group col-12">
					<c:forEach var="art" items="${requestscope.listeArticles}">
						Article : ${art.nomArticle} <br/>
					</c:forEach>
				</ul>
			</c:when>
			<c:otherwise>
				<p>Pas de liste actuellement.</p>
			</c:otherwise>
		</c:choose>
	</div>

</body>
</html>