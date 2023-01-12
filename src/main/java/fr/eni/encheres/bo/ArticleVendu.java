package fr.eni.encheres.bo;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

/**
 * Classe en charge de présenter les articles vendus lors d'une enchère
 * @author falbricias2022
 * @date 10 janv. 2023 - 12:07:35
 * @version projet_javaEE - v0.1
 */

public class ArticleVendu implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5546842911769078680L;
	
	
	/** Attributs de classe **/
	private int noArticle;
	private String nomArticle;
	private String description;
	private Date dateDebutEncheres;
	private Date dateFinEncheres;
	private int miseAPrix;
	private int prixVente;
	//private String etatVente;
	private int noUtilisateur;
    private int noCategorie;
	//private List <Enchere> listeEncheres = new ArrayList<Enchere>();
	
	/** Constructeurs de classe **/
	// Constructeur par défaut
	public ArticleVendu() {
	}
	
	// Constructeur avec tous les champs sauf numéro article
		public ArticleVendu(String nomArticle, String description, Date dateDebutEncheres,
				Date dateFinEncheres, int miseAPrix, int prixVente, int noUtilisateur,
				int noCategorie) {
			this();
			this.setNomArticle(nomArticle);
			this.setDescription(description);
			this.setDateDebutEncheres(dateDebutEncheres);
			this.setDateFinEncheres(dateFinEncheres);
			this.setMiseAPrix(miseAPrix);
			this.setPrixVente(prixVente);
			//this.setEtatVente(etatVente);
			this.setNoUtilisateur(noUtilisateur);
			this.setNoCategorie(noCategorie);
		}
	
	// Constructeur avec tous les champs
	public ArticleVendu(int noArticle, String nomArticle, String description, Date dateDebutEncheres,
			Date dateFinEncheres, int miseAPrix, int prixVente, int noUtilisateur,
			int noCategorie) {
		this();
		this.setNoArticle(noArticle);
		this.setNomArticle(nomArticle);
		this.setDescription(description);
		this.setDateDebutEncheres(dateDebutEncheres);
		this.setDateFinEncheres(dateFinEncheres);
		this.setMiseAPrix(miseAPrix);
		this.setPrixVente(prixVente);
		//this.setEtatVente(etatVente);
		this.setNoUtilisateur(noUtilisateur);
		this.setNoCategorie(noCategorie);
	}

	
	// Getters + setters
	/**
	 * @return the noArticle
	 */
	public int getNoArticle() {
		return noArticle;
	}


	/**
	 * @param noArticle the noArticle to set
	 */
	public void setNoArticle(int noArticle) {
		this.noArticle = noArticle;
	}


	/**
	 * @return the nomArticle
	 */
	public String getNomArticle() {
		return nomArticle;
	}


	/**
	 * @param nomArticle the nomArticle to set
	 */
	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the dateDebutEncheres
	 */
	public Date getDateDebutEncheres() {
		return dateDebutEncheres;
	}


	/**
	 * @param dateDebutEncheres the dateDebutEncheres to set
	 */
	public void setDateDebutEncheres(Date dateDebutEncheres) {
		this.dateDebutEncheres = dateDebutEncheres;
	}


	/**
	 * @return the dateFinEncheres
	 */
	public Date getDateFinEncheres() {
		return dateFinEncheres;
	}


	/**
	 * @param dateFinEncheres the dateFinEncheres to set
	 */
	public void setDateFinEncheres(Date dateFinEncheres) {
		this.dateFinEncheres = dateFinEncheres;
	}


	/**
	 * @return the miseAPrix
	 */
	public int getMiseAPrix() {
		return miseAPrix;
	}


	/**
	 * @param miseAPrix the miseAPrix to set
	 */
	public void setMiseAPrix(int miseAPrix) {
		this.miseAPrix = miseAPrix;
	}


	/**
	 * @return the prixVente
	 */
	public int getPrixVente() {
		return prixVente;
	}


	/**
	 * @param prixVente the prixVente to set
	 */
	public void setPrixVente(int prixVente) {
		this.prixVente = prixVente;
	}


//	/**
//	 * @return the etatVente
//	 */
//	public String getEtatVente() {
//		return etatVente;
//	}
//
//
//	/**
//	 * @param etatVente the etatVente to set
//	 */
//	public void setEtatVente(String etatVente) {
//		this.etatVente = etatVente;
//	}
				
	/**
	 * @return the noUtilisateur
	 */
	public int getNoUtilisateur() {
		return noUtilisateur;
	}

	/**
	 * @param noUtilisateur the noUtilisateur to set
	 */
	public void setNoUtilisateur(int noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}

	/**
	 * @return the noCategorie
	 */
	public int getNoCategorie() {
		return noCategorie;
	}

	/**
	 * @param noCategorie the noCategorie to set
	 */
	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}

	/**
	 * @return the listeEncheres
	 */
//	public List<Enchere> getListeEncheres() {
//		return listeEncheres;
//	}
//
//	/**
//	 * @param listeEncheres the listeEncheres to set
//	 */
//	public void setListeEncheres(List<Enchere> listeEncheres) {
//		this.listeEncheres = listeEncheres;
//	}

	
	// Méthode d'affichage toString
	@Override
	public String toString() {
		return "ArticleVendu [noArticle=" + noArticle + ", nomArticle=" + nomArticle + ", description=" + description
				+ ", dateDebutEncheres=" + dateDebutEncheres + ", dateFinEncheres=" + dateFinEncheres + ", miseAPrix="
				+ miseAPrix + ", prixVente=" + prixVente + ", etatVente=" + "]";
	}

}
