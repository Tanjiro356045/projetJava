/**
 * 
 */
package fr.eni.encheres.bll;

import java.util.List;

import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.dao.ArticleVenduDAO;
import fr.eni.encheres.dao.DAOFactory;
import fr.eni.encheres.exception.BusinessException;

/**
 * Classe en charge de contrôler la BO ArticleVendu
 * @author falbricias2022
 * @date 12 janv. 2023 - 10:32:30
 * @version projet_javaEE - v0.1
 */
public class ManagerArticleVendu {
	
	ArticleVenduDAO articleVenduDAO = DAOFactory.getArticleVenduDAO();
	
	
	
	/**
	 * @param libelle 
	 * @throws BusinessException 
	 */
	public void ajoutArticle (ArticleVendu article) throws BusinessException {
		this.articleVenduDAO.insert(article);
	}
	
	
	public void supprimerArticle(int idArticle) {
		this.articleVenduDAO.delete(idArticle);
	}
	
	
	public List<ArticleVendu> getListeArticles() throws BusinessException{
		return this.articleVenduDAO.selectAll();
	}
	
	
	
}
