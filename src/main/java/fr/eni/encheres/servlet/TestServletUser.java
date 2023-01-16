/**
 * 
 */
package fr.eni.encheres.servlet;

import fr.eni.encheres.bll.ManagerUtilisateur;
import fr.eni.encheres.exception.BusinessException;

/**
 * Classe en charge de 
 * @author falbricias2022
 * @date 16 janv. 2023 - 16:20:57
 * @version projet_javaEE - v0.1
 */
public class TestServletUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ManagerUtilisateur test = new ManagerUtilisateur();
		
		try {
			test.creationUtilisateur("pseudotest", "nomtest", "prenomtest", "mail@test.test", "0467840000", "rue test", "34270", "Villetest", "mdptest", 800, false);
		} catch (BusinessException e) {
			System.out.println("Echec création user");
			e.printStackTrace();
		}
		
		

		
	}

}
