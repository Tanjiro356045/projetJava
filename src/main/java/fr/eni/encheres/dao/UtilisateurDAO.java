/**
 * 
 */
package fr.eni.encheres.dao;

import java.sql.SQLException;
import java.util.List;

import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.exception.BusinessException;

/**
 * Classe en charge de
 * 
 * @author bguillo2022
 * @date 11 janv. 2023 - 13:36:39
 * @version projet_javaEE - v0.1
 */
public interface UtilisateurDAO {

	public Utilisateur selectById(int noUtilisateur);

	public List<Utilisateur> selectAll();
	
	public int verificationIdentifiants(String pseudo, String motDePasse) throws BusinessException, SQLException;
	
	public void update(String pseudo, String nom, String prenom, String email, String noTelephone, String rue,
			String codePostal, String ville, String motDePasse, int credit, boolean administrateur, int noUtilisateur) throws BusinessException;

	//public void update(Utilisateur utilisateur);

	// public void insert(Utilisateur data);

	public Utilisateur insert(String pseudo, String nom, String prenom, String email, String noTelephone, String rue,
			String codePostal, String ville, String motDePasse, int credit, boolean administrateur)
			throws BusinessException;

	public void delete(int noUtilisateur);

	/**
	 * @param pseudo
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param noTelephone
	 * @param rue
	 * @param codePostal
	 * @param ville
	 * @param motDePasse
	 * @param credit
	 * @param administrateur
	 * @param noUtilisateur
	 */

}
