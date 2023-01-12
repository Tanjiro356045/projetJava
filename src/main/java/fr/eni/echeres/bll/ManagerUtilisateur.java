/**
 * 
 */
package fr.eni.echeres.bll;

import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.dao.DAOFactory;
import fr.eni.encheres.dao.UtilisateurDAO;
import fr.eni.encheres.exception.BusinessException;

/**
 * Classe en charge de
 * 
 * @author bguillo2022
 * @date 12 janv. 2023 - 09:59:01
 * @version projet_javaEE - v0.1
 */
public class ManagerUtilisateur {

	UtilisateurDAO utilisateurDAO = DAOFactory.getUtilisateurDAO();

	public Utilisateur creationUtilisateur(String pseudo, String nom, String prenom, String email, String noTelephone,
			String rue, String codePostal, String ville, String motDePasse, int credit, boolean administrateur)
			throws BusinessException {
		return utilisateurDAO.insert(pseudo, nom, prenom, email, noTelephone, rue, codePostal, ville, motDePasse, credit,
				administrateur);
	}

	public void supprimerUtilisateur(int noUtilisateur) throws BusinessException {
		this.utilisateurDAO.delete(noUtilisateur);
	}

	public void modifierUtilisateur (String pseudo, String nom, String prenom, String email, String noTelephone, String rue,
			String codePostal, String ville, String motDePasse, int credit, boolean administrateur, int noUtilisateur) throws BusinessException {

		utilisateurDAO.update(pseudo, nom, prenom, email, noTelephone, rue, codePostal, ville, motDePasse, credit, administrateur, noUtilisateur);
	}

}
