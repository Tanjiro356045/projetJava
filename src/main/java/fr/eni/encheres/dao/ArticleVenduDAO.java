/**
 * 
 */
package fr.eni.encheres.dao;

import java.util.List;

import fr.eni.encheres.bo.ArticleVendu;


/**
 * Classe en charge de 
 * @author bguillo2022
 * @date 11 janv. 2023 - 13:37:05
 * @version projet_javaEE - v0.1
 */
public interface ArticleVenduDAO {
	
	public ArticleVendu selectById(int noArticle);

	public List<ArticleVendu> selectAll();

	public void update(ArticleVendu data);

	public void insert(ArticleVendu data);

	public void delete(int noArticle);

}
