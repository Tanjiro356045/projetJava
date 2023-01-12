/**
 * 
 */
package fr.eni.echeres.bll;

import fr.eni.encheres.dao.CategorieDAO;
import fr.eni.encheres.dao.DAOFactory;
import fr.eni.encheres.exception.BusinessException;

/**
 * Classe en charge de 
 * @author falbricias2022
 * @date 11 janv. 2023 - 14:49:27
 * @version projet_javaEE - v0.1
 */
public class ManagerCategorie {
	CategorieDAO categorieDAO = DAOFactory.getCategorieDAO();

	/**
	 * @param libelle 
	 * @throws BusinessException 
	 */
	public void ajoutCategorie(String libelle) throws BusinessException {
		categorieDAO.insert(libelle);
	}

}
