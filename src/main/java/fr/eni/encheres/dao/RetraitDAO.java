/**
 * 
 */
package fr.eni.encheres.dao;

import java.util.List;

import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.bo.Retrait;
import fr.eni.encheres.exception.BusinessException;

/**
 * Interface en charge de présenter les méthodes de CRUD de la BO Retrait vers RetraitDAOJdbcImpl
 * @author falbricias2022
 * @date 13 janv. 2023 - 13:57:59
 * @version projet_javaEE - v0.1
 */
public interface RetraitDAO {
	
	// TODO : throws Business Exception sur l'ensemble des méthodes

	
	// Définition des méthodes de CRUD
	public Retrait selectById(int noArticle);

	public void update(Retrait data);

	public void delete(int noArticle);

	public void insert(Retrait retrait) throws BusinessException;
	
	
}
