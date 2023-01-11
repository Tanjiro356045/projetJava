/**
 * 
 */
package fr.eni.encheres.dao;

import java.util.List;


import fr.eni.encheres.bo.Utilisateur;

/**
 * Classe en charge de 
 * @author bguillo2022
 * @date 11 janv. 2023 - 13:36:39
 * @version projet_javaEE - v0.1
 */
public interface UtilisateurDAO {
	
	public Utilisateur selectById(int noUtilisateur);

	public List<Utilisateur> selectAll();

	public void update(Utilisateur data);

	public void insert(Utilisateur data);

	public void delete(int noUtilisateur);

}
