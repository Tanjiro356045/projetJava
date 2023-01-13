/**
 * 
 */
package fr.eni.echeres.bll;

import fr.eni.encheres.bo.Retrait;
import fr.eni.encheres.dao.DAOFactory;
import fr.eni.encheres.dao.RetraitDAO;

/**
 * Classe en charge de 
 * @author falbricias2022
 * @date 13 janv. 2023 - 16:56:25
 * @version projet_javaEE - v0.1
 */
public class ManagerRetrait {
	
	RetraitDAO retraitDAO = DAOFactory.getRetraitDAO();
	
	
	public ManagerRetrait() {
	}




	/**
	 * 
	 */
	public static Retrait adRetrait(Retrait retrait) {
		
		
		return retrait;
	}

}
