package fr.eni.encheres.bo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
	private LocalDate dateDebutEncheres;
	private LocalDate dateFinEncheres;
	private int miseAPrix;
	private int prixVente;
	private String etatVente;
	private List <Enchere> listeEncheres = new ArrayList<Enchere>();
	
	/** Constructeurs de classe **/
	// Constructeur par défaut
	public ArticleVendu() {
	}
		
	public ArticleVendu(int noArticle, String nomArticle, String description, LocalDate dateDebutEncheres,
			LocalDate dateFinEncheres, int miseAPrix, int prixVente, String etatVente) {
		this();
		this.setNoArticle(noArticle);
		this.setNomArticle(nomArticle);
		this.setDescription(description);
		this.setDateDebutEncheres(dateDebutEncheres);
		this.setDateFinEncheres(dateFinEncheres);
		this.setEtatVente(etatVente);
	}
	
	public ArticleVendu(int noArticle, String nomArticle, String description, LocalDate dateDebutEncheres,
			LocalDate dateFinEncheres, String etatVente) {
		this();
		this.setMiseAPrix(miseAPrix);
		this.setPrixVente(prixVente);
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
	public LocalDate getDateDebutEncheres() {
		return dateDebutEncheres;
	}


	/**
	 * @param dateDebutEncheres the dateDebutEncheres to set
	 */
	public void setDateDebutEncheres(LocalDate dateDebutEncheres) {
		this.dateDebutEncheres = dateDebutEncheres;
	}


	/**
	 * @return the dateFinEncheres
	 */
	public LocalDate getDateFinEncheres() {
		return dateFinEncheres;
	}


	/**
	 * @param dateFinEncheres the dateFinEncheres to set
	 */
	public void setDateFinEncheres(LocalDate dateFinEncheres) {
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


	/**
	 * @return the etatVente
	 */
	public String getEtatVente() {
		return etatVente;
	}


	/**
	 * @param etatVente the etatVente to set
	 */
	public void setEtatVente(String etatVente) {
		this.etatVente = etatVente;
	}
	
		
	/**
	 * @return the listeEncheres
	 */
	public List<Enchere> getListeEncheres() {
		return listeEncheres;
	}

	/**
	 * @param listeEncheres the listeEncheres to set
	 */
	public void setListeEncheres(List<Enchere> listeEncheres) {
		this.listeEncheres = listeEncheres;
	}

	
	// Méthode d'affichage toString
	@Override
	public String toString() {
		return "ArticleVendu [noArticle=" + noArticle + ", nomArticle=" + nomArticle + ", description=" + description
				+ ", dateDebutEncheres=" + dateDebutEncheres + ", dateFinEncheres=" + dateFinEncheres + ", miseAPrix="
				+ miseAPrix + ", prixVente=" + prixVente + ", etatVente=" + etatVente + "]";
	}

}
