/**
 * 
 */
package fr.eni.encheres.bll;

import java.time.LocalDate;

import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.bo.Categorie;
import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.exception.BusinessException;

/**
 * Classe en charge de tester les classes de la BLL.
 * @author falbricias2022
 * @date 16 janv. 2023 - 15:27:13
 * @version projet_javaEE - v0.1
 */
public class TestBLL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ManagerCategorie mgCategorie= new ManagerCategorie();
			Categorie cat = mgCategorie.ajoutCategorie("testcategorie");
			
			
			System.out.println(cat);

			ManagerUtilisateur mgtUtilisateur = new ManagerUtilisateur();

//			Utilisateur user = mgtUtilisateur.afficherProfilUtilisateur(1);
//
//			if (cat != null) {
//
//				ArticleVendu article = new ArticleVendu();
//				article.setNomArticle("testmardi");
//				article.setDescription("description mardi");
//				article.setDateDebutEncheres(LocalDate.parse("2022-12-01"));
//				article.setDateFinEncheres(LocalDate.parse("2023-05-06"));
//				article.setMiseAPrix(100);
//				article.setPrixVente(250);
//				article.setUtilisateur(user);
//				article.setCategorie(cat);
//
//				ManagerArticleVendu mgtArticle = new ManagerArticleVendu();
//				mgtArticle.ajoutArticle(article);

			} catch (BusinessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
