/**
 * 
 */
package fr.eni.encheres.bll;

import java.time.LocalDate;

import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.exception.BusinessException;

/**
 * Classe en charge de 
 * @author falbricias2022
 * @date 16 janv. 2023 - 15:27:13
 * @version projet_javaEE - v0.1
 */
public class TestBLL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ManagerCategorie test= new ManagerCategorie();
		try {
			test.ajoutCategorie("testcategorie");
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		ArticleVendu article = new ArticleVendu();
		article.setNomArticle("nomarticle");
		article.setDescription("voici une description");
		article.setDateDebutEncheres(LocalDate.parse("2022-12-01"));
		article.setDateFinEncheres(LocalDate.parse("2023-05-06"));
		article.setMiseAPrix(100);
		article.setPrixVente(250);
		article.setUtilisateur(null);
		article.setCategorie(null);
		
		
		ManagerArticleVendu testArticle = new ManagerArticleVendu();
		testArticle.ajoutArticle(null);
		
		
		
		
		
		
		
	}

}
