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
					<c:forEach var="c" items="${listeArticles}">
						<li
							class="list-group-item d-flex justify-content-between align-items-center liDetail">${c.nom}
							<div>
								<a href="${pageContext.request.contextPath}/nouvelle?id=${c.id}" class="badge text-primary" title="Editer la liste"></a>
								<a href="${pageContext.request.contextPath}/panier?id=${c.id}" class="badge text-primary" title="Commencer ses courses"></a>
								<a href="${pageContext.request.contextPath}/supprimer/liste?id=${c.id}" class="badge text-danger" title="Supprimer"></a>
							</div>

						</li>
					</c:forEach>
				</ul>
			</c:when>
			<c:otherwise>
				<p>Pas de liste actuellement.
				<p>
			</c:otherwise>
		</c:choose>
	</div>

</body>
</html>