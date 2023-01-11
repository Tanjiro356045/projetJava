/**
 * 
 */
package fr.eni.encheres.dao;



/**
 * Classe en charge de 
 * @author bguillo2022
 * @date 11 janv. 2023 - 11:57:13
 * @version projet_javaEE - v0.1
 */
public abstract class DAOFactory {
	
	public static CategorieDAO getCategorieDAO(){
		
		return new CategorieDAOJdbcImpl();
	}
	
	
}
