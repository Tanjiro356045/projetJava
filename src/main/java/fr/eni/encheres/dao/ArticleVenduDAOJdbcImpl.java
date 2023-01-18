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
import fr.eni.encheres.bo.Categorie;
import fr.eni.encheres.bo.Retrait;
import fr.eni.encheres.bo.Utilisateur;
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
			ArticleVendu article = null;
			while (rs.next()) {
				article = ArticleBuilder(rs);
				listeArticles.add(article);
			}
		} catch (Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			//businessException.ajouterErreur(CodesResultatDAL.LECTURE_LISTE_ECHEC);
			//throw businessException;
		}
		return listeArticles;
	}
	
	/**
	 * @param rs
	 * @return
	 */
	public ArticleVendu ArticleBuilder(ResultSet rs) {
		ArticleVendu articleVendu = new ArticleVendu();
		try {
			Utilisateur user = this.getVendeurArticle(rs.getInt("no_utilisateur"));
			
			Categorie categorie = this.getCategorieArticle(rs.getInt("no_categorie"));
			
			articleVendu.setNoArticle(rs.getInt("no_article"));	
			articleVendu.setNomArticle(rs.getString("nom_article"));		
			articleVendu.setDescription(rs.getString("description"));
			articleVendu.setDateDebutEncheres((rs.getDate("date_debut_encheres").toLocalDate()));
			articleVendu.setDateFinEncheres(rs.getDate("date_fin_encheres").toLocalDate());
			articleVendu.setMiseAPrix(rs.getInt("prix_initial"));
			articleVendu.setPrixVente(rs.getInt("prix_vente"));
			articleVendu.setUtilisateur(user);
			articleVendu.setCategorie(categorie);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return articleVendu;
	}

	private Utilisateur getVendeurArticle(int userId) {
		UtilisateurDAO utilisateurDAO = DAOFactory.getUtilisateurDAO();
		Utilisateur vendeurArticle = null;
		try {
			vendeurArticle = utilisateurDAO.selectById(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vendeurArticle;
	}

	private Categorie getCategorieArticle(int noCategorie) {
		CategorieDAO categorieDAO = DAOFactory.getCategorieDAO();
		Categorie categorieArticle = null;
		try {
			categorieArticle = categorieDAO.selectById(noCategorie);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return categorieArticle;
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
