/**
 * 
 */
package fr.eni.encheres.bll;

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
		
	}

}
