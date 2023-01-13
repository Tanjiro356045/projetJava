/**
 * 
 */
package fr.eni.encheres.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.encheres.bo.Retrait;
import fr.eni.encheres.exception.BusinessException;

/**
 * Classe en charge d'implémenter les méthodes de la classe Retrait.
 * @author falbricias2022
 * @date 13 janv. 2023 - 13:40:58
 * @version projet_javaEE - v0.1
 */
public class RetraitDAOJdbcImpl implements RetraitDAO {
	
	private static final String SELECT_BY_ID = "SELECT * FROM RETRAITS WHERE no_article = ?;";
	private static final String INSERT_RETRAIT = "INSERT INTO RETRAITS (id_article, rue, code_postal, ville)"
												+ "VALUES (?, ?, ?, ?);";
	private static final String UPDATE_RETRAIT = "UPDATE RETRAITS SET rue = ?, code_postal = ?, ville = ?"
												+"WHERE ;";
	private static final String DELETE_RETRAIT = "DELETE FROM RETRAITS WHERE no_article = ?;";
	

	@Override
	public Retrait selectById(int noArticle) {
		Retrait retrait = new Retrait();
		try {
			Connection cnx = ConnectionProvider.getConnection();
			PreparedStatement rq = cnx.prepareStatement(SELECT_BY_ID);
			rq.setInt(1, noArticle);
			ResultSet rs = rq.executeQuery();
			
			if(rs.next()){
				retrait.setNoArticle(rs.getInt("no_article"));
				retrait.setRue(rs.getString("rue"));
				retrait.setCode_postal(rs.getInt("code_postal"));
				retrait.setVille(rs.getString("ville"));				
			}
			try {
				cnx.close();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Erreur close cnx Retrait - SelectById");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			//businessException.ajouterErreur(CodesResultatDAL.LECTURE_LISTE_ECHEC);
			//throw businessException;
		}
		return retrait;
	}
	
	@Override
	public void insert(Retrait retrait) throws BusinessException {
		Connection cnx;
		try {
			cnx = ConnectionProvider.getConnection();
			PreparedStatement rq = cnx.prepareStatement(INSERT_RETRAIT);
			rq.setInt(1, retrait.getNoArticle());
			rq.setString(2, retrait.getRue());
			rq.setInt(3, retrait.getCode_postal());
			rq.setString(4, retrait.getVille());
			rq.executeUpdate();	
			if(!cnx.isClosed()) {
				try {
					cnx.close();
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Erreur close cnx Retrait - SelectById");
				}				
			}
		} catch (SQLException e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			//businessException.ajouterErreur(CodesResultatDAL.LECTURE_LISTE_ECHEC);
			//throw businessException;
		}
	}

	@Override
	public void update(Retrait retrait) {
		try {
			Connection cnx;
			cnx = ConnectionProvider.getConnection();
			PreparedStatement rq = cnx.prepareStatement(UPDATE_RETRAIT);
			rq.setInt(1, retrait.getNoArticle());
			rq.setString(2, retrait.getRue());
			rq.setInt(3, retrait.getCode_postal());
			rq.setString(4, retrait.getVille());
			rq.executeUpdate();
			
			if(! cnx.isClosed()) {
				try {
					cnx.close();
				} catch (Exception e) {
					System.out.println("Erreur close cnx Retrait - SelectById");
				}
			}			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int noArticle) {
		try {
			Connection cnx = ConnectionProvider.getConnection();
			PreparedStatement rq = cnx.prepareStatement(DELETE_RETRAIT);
			
			rq.setInt(1, noArticle);
			rq.executeUpdate();
			
			if(!cnx.isClosed()) {
				try {
					cnx.close();
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Erreur close cnx Retrait - SelectById");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			//businessException.ajouterErreur(CodesResultatDAL.LECTURE_LISTE_ECHEC);
			//throw businessException;
		}
	}
}
