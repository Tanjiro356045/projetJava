/**
 * 
 */
package fr.eni.encheres.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe en charge de
 * 
 * @author mlemat2022
 * @date 10 janv. 2023 - 11:53:12
 * @version projet_javaEE - v0.1
 */
public class Categorie implements Serializable {

	/**
		 * Attributs de classe
		 */
	private static final long serialVersionUID = 1L;
	private int noCategorie; // numer
	private String libelle;
	private List<ArticleVendu> articles = new ArrayList<ArticleVendu>();

	/**
	 * Constructeur
	 */
	public Categorie() {

	}

	/**
	 * Constructeur
	 * 
	 * @param noCategorie
	 * @param libelle
	 */
	public Categorie(int noCategorie, String libelle) {
		this();
		this.setNoCategorie(noCategorie);
		this.setLibelle(libelle);
	}

	/**
	 * Getter pour noCategorie.
	 * 
	 * @return the noCategorie
	 */
	public int getNoCategorie() {
		return noCategorie;
	}

	/**
	 * Setter pour noCategorie.
	 * 
	 * @param noCategorie the noCategorie to set
	 */
	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}

	/**
	 * Getter pour libelle.
	 * 
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Setter pour libelle.
	 * 
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Getter pour articles.
	 * 
	 * @return the articles
	 */
	public List<ArticleVendu> getArticles() {
		return articles;
	}

	/**
	 * Setter pour articles.
	 * 
	 * @param articles the articles to set
	 */
	public void setArticles(List<ArticleVendu> articles) {
		this.articles = articles;
	}
	
	// To String
	@Override
	public String toString() {
		return "Categorie [noCategorie=" + noCategorie + ", libelle=" + libelle + ", articles=" + articles + "]";
	}
	
	
	

}
