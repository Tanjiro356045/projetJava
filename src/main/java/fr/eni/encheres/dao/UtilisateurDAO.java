/**
 * 
 */
package fr.eni.encheres.dao;

import java.util.List;


import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.exception.BusinessException;

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

	//public void insert(Utilisateur data);
	
	public Utilisateur insert(String pseudo,String nom, String prenom, String email, String noTelephone, String rue, String codePostal, String ville, String motDePasse, int credit, boolean administrateur) throws BusinessException; 

	public void delete(int noUtilisateur);

}
