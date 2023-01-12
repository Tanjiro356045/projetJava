/**
 * 
 */
package fr.eni.encheres.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.encheres.bo.Categorie;
import fr.eni.encheres.bo.Utilisateur;
import fr.eni.encheres.exception.BusinessException;

/**
 * Classe en charge de
 * 
 * @author falbricias2022
 * @date 11 janv. 2023 - 13:40:14
 * @version projet_javaEE - v0.1
 */
public class UtilisateurDAOJdbcImpl implements UtilisateurDAO {

	private static final String SELECT_ALL = "SELECT * FROM UTILISATEURS;";
	private static final String SELECT_BY_ID = "SELECT * FROM UTILISATEURS WHERE no_utilisateur = ?;";
	private static final String UPDATE_UTILISATEUR = "UPDATE UTILISATEURS SET pseudo = ?, nom = ?,"
			+ " prenom = ?, email = ?, telephone = ?, rue = ?, "
			+ " code_postal = ?, ville = ?, mot_de_passe = ?, credit = ?, "
			+ " administrateur = ?	WHERE no_utilisateur = ?";
	private static final String INSERT_UTILISATEUR = "INSERT INTO UTILISATEURS(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur) VALUES (?,?,?,?,?,?,?,?,?,?,?);";
	private static final String DELETE_UTILISATEUR = "DELETE FROM UTILISATEURS WHERE no_utilisateur = ?;";

	@Override
	public List<Utilisateur> selectAll() {
		List<Utilisateur> listeUtilisateur = new ArrayList<Utilisateur>();
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(SELECT_ALL);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				listeUtilisateur.add(new Utilisateur(rs.getInt("no_utilisateur"), rs.getString("pseudo"),
						rs.getString("nom"), rs.getString("prenom"), rs.getString("email"), rs.getString("telephone"),
						rs.getString("rue"), rs.getString("code_postal"), rs.getString("ville"),
						rs.getString("mot_de_passe"), rs.getInt("credit"), rs.getBoolean("administrateur")));
			}
		} catch (Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			// businessException.ajouterErreur(CodesResultatDAL.LECTURE_LISTE_ECHEC);
			// throw businessException;
		}
		return listeUtilisateur;
	}

	@Override
	public Utilisateur selectById(int noUtilisateur) {
		Utilisateur utilisateur = new Utilisateur();
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(SELECT_BY_ID);
			pstmt.setInt(1, noUtilisateur);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {

				utilisateur.setNoUtilisateur(rs.getInt("no_utilisateur"));
				utilisateur.setPseudo(rs.getString("pseudo"));
				utilisateur.setNom(rs.getString("nom"));
				utilisateur.setPrenom(rs.getString("prenom"));
				utilisateur.setEmail(rs.getString("email"));
				utilisateur.setNoTelephone(rs.getString("telephone"));
				utilisateur.setRue(rs.getString("rue"));
				utilisateur.setCodePostal(rs.getString("code_postal"));
				utilisateur.setVille(rs.getString("ville"));
				utilisateur.setMotDePasse(rs.getString("mot_de_passe"));
				utilisateur.setCredit(rs.getInt("credit"));
				utilisateur.setAdministrateur(rs.getBoolean("administrateur"));
			}

			cnx.close();

		} catch (Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			// businessException.ajouterErreur(CodesResultatDAL.LECTURE_LISTE_ECHEC);
			// throw businessException;
		}
		return utilisateur;
	}

	@Override
	public void update(String pseudo, String nom, String prenom, String email, String noTelephone, String rue,
			String codePostal, String ville, String motDePasse, int credit, boolean administrateur, int noUtilisateur) throws BusinessException {
		Utilisateur utilisateurUpdate = new Utilisateur();
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(UPDATE_UTILISATEUR);
			pstmt.setString(1, pseudo);
			pstmt.setString(2, nom);
			pstmt.setString(3, prenom);
			pstmt.setString(4, email);
			pstmt.setString(5, noTelephone);
			pstmt.setString(6, rue);
			pstmt.setString(7, codePostal);
			pstmt.setString(8, ville);
			pstmt.setString(9, motDePasse);
			pstmt.setInt(10, credit);
			pstmt.setBoolean(11, administrateur);
			pstmt.setInt(12, noUtilisateur);
			
			
			pstmt.executeUpdate();
			
			
			pstmt.close();

		} catch (Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			// businessException.ajouterErreur(CodesResultatDAL.LECTURE_LISTE_ECHEC);
			// throw businessException;
		}
		
	}

	@Override
	public Utilisateur insert(String pseudo, String nom, String prenom, String email, String noTelephone, String rue,
			String codePostal, String ville, String motDePasse, int credit, boolean administrateur)
			throws BusinessException {

		Utilisateur utilisateurInsert = new Utilisateur();
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(INSERT_UTILISATEUR, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, pseudo);
			pstmt.setString(2, nom);
			pstmt.setString(3, prenom);
			pstmt.setString(4, email);
			pstmt.setString(5, noTelephone);
			pstmt.setString(6, rue);
			pstmt.setString(7, codePostal);
			pstmt.setString(8, ville);
			pstmt.setString(9, motDePasse);
			pstmt.setInt(10, credit);
			pstmt.setBoolean(11, administrateur);

			int nbRows = pstmt.executeUpdate();

			if (nbRows == 1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				if (rs.next()) {
					utilisateurInsert.setPseudo(pseudo);
					utilisateurInsert.setNom(nom);
					utilisateurInsert.setPrenom(prenom);
					utilisateurInsert.setEmail(email);
					utilisateurInsert.setNoTelephone(noTelephone);
					utilisateurInsert.setRue(rue);
					utilisateurInsert.setCodePostal(codePostal);
					utilisateurInsert.setVille(ville);
					utilisateurInsert.setMotDePasse(motDePasse);
					utilisateurInsert.setCredit(credit);
					utilisateurInsert.setAdministrateur(administrateur);
					utilisateurInsert.setNoUtilisateur(rs.getInt(1));
				}
			}
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			// businessException.ajouterErreur(CodesResultatDAL.LECTURE_LISTE_ECHEC);
			throw businessException;
		}

		return utilisateurInsert;
	}

	@Override
	public void delete(int noUtilisateur) {

		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(DELETE_UTILISATEUR);

			pstmt.setInt(1, noUtilisateur);
			pstmt.executeUpdate();

			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			// businessException.ajouterErreur(CodesResultatDAL.LECTURE_LISTE_ECHEC);
			// throw businessException;
		}
	}

}
