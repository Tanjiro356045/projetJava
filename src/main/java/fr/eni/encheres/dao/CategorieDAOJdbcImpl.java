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
import fr.eni.encheres.exception.BusinessException;

/**
 * Classe en charge de 
 * @author falbricias2022
 * @date 11 janv. 2023 - 10:00:43
 * @version projet_javaEE - v0.1
 */
public class CategorieDAOJdbcImpl implements CategorieDAO{
	
	// Requêtes SQL
		private static final String SELECT_ALL = "SELECT * FROM CATEGORIES";
		private static final String SELECT_BY_ID = "SELECT * FROM CATEGORIES WHERE no_categorie = ?";
		private static final String UPDATE_CATEGORIE = "UPDATE CATEGORIES"
													+ "	SET libelle = ? "
													+ "	WHERE no_categorie = ?";
		private static final String INSERT_CATEGORIE = "INSERT INTO CATEGORIES(libelle) VALUES (?);";
		private static final String DELETE_CATEGORIE = "DELETE FROM CATEGORIES WHERE no_categorie = ?";
		
		
		// Méthodes d'implémentation
		@Override
		public List<Categorie> selectAll() {
			List<Categorie> listeCategories = new ArrayList<Categorie>();
			try (Connection cnx = ConnectionProvider.getConnection()) {
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_ALL);
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {
					listeCategories.add(new Categorie(rs.getInt("no_categorie"), rs.getString("libelle")));
				}
				cnx.close();
			} catch (Exception e) {
				e.printStackTrace();
				BusinessException businessException = new BusinessException();
				//businessException.ajouterErreur(CodesResultatDAL.LECTURE_LISTE_ECHEC);
				//throw businessException;
			}
			return listeCategories;
		}
		
		@Override
		public Categorie selectById(int noCategorie) {
			Categorie categorie = new Categorie();
			try (Connection cnx = ConnectionProvider.getConnection()) {
				PreparedStatement pstmt = cnx.prepareStatement(SELECT_BY_ID);
				pstmt.setInt(1, noCategorie);
				ResultSet rs = pstmt.executeQuery();

				if (rs.next()) {
					rs.getInt("id_article");
					rs.getString("nom_article");
				}
				cnx.close();
			} catch (Exception e) {
				e.printStackTrace();
				BusinessException businessException = new BusinessException();
				//businessException.ajouterErreur(CodesResultatDAL.LECTURE_LISTE_ECHEC);
				//throw businessException;
			}
			return categorie;
		}
		
		@Override
		public void update(Categorie data) {
			try (Connection cnx = ConnectionProvider.getConnection()){
				PreparedStatement pstmt = cnx.prepareStatement(UPDATE_CATEGORIE);
				pstmt.setString(1, data.getLibelle());
				pstmt.setInt(2, data.getNoCategorie());
				
				pstmt.executeUpdate();
				
				pstmt.close();
				cnx.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				BusinessException businessException = new BusinessException();
				//businessException.ajouterErreur(CodesResultatDAL.LECTURE_LISTE_ECHEC);
				//throw businessException;
			}
		}

		@Override
		public void insert(Categorie data) {
			try (Connection cnx = ConnectionProvider.getConnection()) {
				PreparedStatement pstmt = cnx.prepareStatement(INSERT_CATEGORIE, Statement.RETURN_GENERATED_KEYS);
				pstmt.setString(1, data.getLibelle());

				int nbRows = pstmt.executeUpdate();

				if (nbRows == 1) {
					ResultSet rs = pstmt.getGeneratedKeys();
					if (rs.next()) {
						data.setNoCategorie(rs.getInt(1));
					}
				}
				pstmt.close();
				cnx.close();
			} catch (Exception e) {
				e.printStackTrace();
				BusinessException businessException = new BusinessException();
				//businessException.ajouterErreur(CodesResultatDAL.LECTURE_LISTE_ECHEC);
				//throw businessException;
			}
		}

		@Override
		public void delete(int noCategorie) {
			try (Connection cnx = ConnectionProvider.getConnection()){
				PreparedStatement pstmt = cnx.prepareStatement(DELETE_CATEGORIE);
				
				pstmt.setInt(1, noCategorie);
				pstmt.executeUpdate();
				
				pstmt.close();
				cnx.close();				
			} catch (Exception e) {
				e.printStackTrace();
				BusinessException businessException = new BusinessException();
				//businessException.ajouterErreur(CodesResultatDAL.LECTURE_LISTE_ECHEC);
				//throw businessException;
			}
		}
		
}
