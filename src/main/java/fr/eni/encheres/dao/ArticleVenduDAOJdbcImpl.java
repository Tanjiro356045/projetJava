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

import fr.eni.encheres.bo.ArticleVendu;
import fr.eni.encheres.exception.BusinessException;

/**
 * Classe en charge de 
 * @author falbricias2022
 * @date 11 janv. 2023 - 13:39:35
 * @version projet_javaEE - v0.1
 */
public class ArticleVenduDAOJdbcImpl implements ArticleVenduDAO{

	// Requêtes SQL
	private static final String SELECT_ALL = "SELECT * FROM ARTICLES_VENDUS;";
	private static final String SELECT_BY_ID = "SELECT * FROM ARTICLES_VENDUS WHERE no_article = ?;";
	private static final String UPDATE_ARTICLE = "UPDATE ARTICLES_VENDUS"
												+ "	SET nom_article = ?, "
												+ "	description = ?, "
												+ "	date_debut_encheres = ?, "
												+ "	date_fin_encheres = ?, "
												+ "	prix_initial = ?, "
												+ "	prix_vente = ? "
												+ "	WHERE no_article = ?;";
	private static final String INSERT_ARTICLE = "INSERT INTO ARTICLES_VENDUS (nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, prix_vente, no_utilisateur, no_categorie) VALUES (? ,?, ?, ?, ?, ?, ?, ?);";
	private static final String DELETE_ARTICLE = "DELETE FROM ARTICLES_VENDUS WHERE no_article = ?;";

	@Override
	public List<ArticleVendu> selectAll() {
		List<ArticleVendu> listeArticles = new ArrayList<ArticleVendu>();
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(SELECT_ALL);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				listeArticles.add(new ArticleVendu(
						rs.getInt("no_article"),
						rs.getString("nom_article"),
						rs.getString("description"),
						rs.getDate("date_debut_encheres"),
						rs.getDate("date_fin_encheres"),
						rs.getInt("prix_initial"),
						rs.getInt("prix_vente"),
						rs.getInt("no_utilisateur"),
						rs.getInt("no_categorie")));
			}
		} catch (Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			//businessException.ajouterErreur(CodesResultatDAL.LECTURE_LISTE_ECHEC);
			//throw businessException;
		}
		return listeArticles;
	}
	
	@Override
	public ArticleVendu selectById(int noArticle) {
		ArticleVendu article = new ArticleVendu();
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(SELECT_BY_ID);
			pstmt.setInt(1, noArticle);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				article.setNoArticle(rs.getInt("no_article"));
				article.setNomArticle(rs.getString("nom_article"));
				article.setDescription(rs.getString("description"));
				article.setDateDebutEncheres(rs.getDate("date_debut_encheres").toLocalDate());
				article.setDateFinEncheres(rs.getDate("date_fin_encheres").toLocalDate());
				article.setMiseAPrix(rs.getInt("prix_initial"));
				article.setPrixVente(rs.getInt("prix_vente"));
				article.getUtilisateur().setNoUtilisateur(rs.getInt("no_utilisateur"));
				article.getCategorie().setNoCategorie(rs.getInt("no_categorie"));
				
			}
			cnx.close();
		} catch (Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			//businessException.ajouterErreur(CodesResultatDAL.LECTURE_LISTE_ECHEC);
			//throw businessException;
		}
		return article;
	}

	@Override
	public void update(ArticleVendu data) {
		try (Connection cnx = ConnectionProvider.getConnection()){
			PreparedStatement pstmt = cnx.prepareStatement(UPDATE_ARTICLE);
			pstmt.setString(1, data.getNomArticle());
			pstmt.setString(2, data.getDescription());
			pstmt.setDate(3, java.sql.Date.valueOf(data.getDateDebutEncheres()));
			pstmt.setDate(4, java.sql.Date.valueOf(data.getDateFinEncheres()));
			pstmt.setInt(5, data.getMiseAPrix());
			pstmt.setInt(6, data.getPrixVente());
			pstmt.setInt(7, data.getNoArticle());
						
			pstmt.executeUpdate();
			
			pstmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			//businessException.ajouterErreur(CodesResultatDAL.LECTURE_LISTE_ECHEC);
			//throw businessException;
		}
	}

	@Override
	public void insert(ArticleVendu data) {
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(INSERT_ARTICLE, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, data.getNomArticle());
			pstmt.setString(2, data.getDescription());
//			pstmt.setDate(3, data.getDateDebutEncheres());
//			pstmt.setDate(4, data.getDateFinEncheres());
			pstmt.setDate(3, java.sql.Date.valueOf(data.getDateDebutEncheres()));
			pstmt.setDate(4, java.sql.Date.valueOf(data.getDateFinEncheres()));
			pstmt.setInt(5, data.getMiseAPrix());
			pstmt.setInt(6, data.getPrixVente());
			pstmt.setInt(7, data.getUtilisateur().getNoUtilisateur());
			pstmt.setInt(8, data.getCategorie().getNoCategorie());

			int nbRows = pstmt.executeUpdate();

			if (nbRows == 1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				if (rs.next()) {
					data.setNoArticle(rs.getInt(1));
				}
			}
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
//			businessException.ajouterErreur(CodesResultatDAL.LECTURE_LISTE_ECHEC);
//			throw businessException;
		}
	}

	@Override
	public void delete(int noArticle) {
		try (Connection cnx = ConnectionProvider.getConnection()) {
			PreparedStatement pstmt = cnx.prepareStatement(DELETE_ARTICLE);
			pstmt.setInt(1, noArticle);
			pstmt.executeUpdate();
			
			if(pstmt != null) {
				pstmt.close();
			}
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
//			businessException.ajouterErreur(CodesResultatDAL.LECTURE_LISTE_ECHEC);
//			throw businessException;
		}
	}

	
}
