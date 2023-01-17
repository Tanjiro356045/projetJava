/**
 * 
 */
package fr.eni.encheres.bll;

import java.util.List;

import fr.eni.encheres.bo.Categorie;
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
	static CategorieDAO categorieDAO = DAOFactory.getCategorieDAO();

	/**
	 * @param libelle 
	 * @return 
	 * @throws BusinessException 
	 */
	public Categorie ajoutCategorie(String libelle) throws BusinessException {
		return this.categorieDAO.insert(libelle);
	}
	
	public Categorie selectCatById(int noCategorie) throws BusinessException {
		return this.categorieDAO.selectById(noCategorie);
	}
	
	public Categorie selectCatByLibelle(String libelle) throws BusinessException {
		return this.categorieDAO.selectByLibelle(libelle);
	}
	
	public static List<Categorie> selectAllCat() throws BusinessException {
		return categorieDAO.selectAll();		
	}

}
