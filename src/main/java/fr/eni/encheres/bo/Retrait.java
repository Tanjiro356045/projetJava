/**
 * 
 */
package fr.eni.encheres.bo;

import java.io.Serializable;

/**
 * Classe en charge de présenter les adresses de retrait des articles.
 * @author mlemat2022
 * @date 10 janv. 2023 - 11:53:27
 * @version projet_javaEE - v0.1
 */
public class Retrait implements Serializable {

	private static final long serialVersionUID = -7238436495798377474L;
	
	// Attributs de classe
	private int noArticle;
	private String rue;
	private int code_postal;
	private String ville;
	
	
	// Constructeurs
	
	/**
	 * Constructeur vide
	 */
	public Retrait() {
	}
	
	/**
	 * Constructeur
	 * @param rue
	 * @param code_postal
	 * @param ville
	 */
	public Retrait(String rue, int code_postal, String ville) {
		this.setCode_postal(code_postal);
		this.setRue(rue);
		this.setVille(ville);
	}
	
	/**
	 * Constructeur avec tous les champs
	 */
	public Retrait(int noArticle, String rue, int code_postal, String ville) {
		this.setNoArticle(noArticle);
		this.setRue(rue);
		this.setCode_postal(code_postal);
		this.setVille(ville);
	}

	// Getters + setters
		
	/**
	 * Getter pour ville.
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}

	/**
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/**
	 * @return the code_postal
	 */
	public int getCode_postal() {
		return code_postal;
	}

	/**
	 * @param code_postal the code_postal to set
	 */
	public void setCode_postal(int code_postal) {
		this.code_postal = code_postal;
	}

	/**
	 * Setter pour ville.
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

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

	
	// Méthode d'affichage toString
	@Override
	public String toString() {
		return "Retrait [noArticle=" + noArticle + ", rue=" + rue + ", code_postal=" + code_postal + ", ville=" + ville
				+ "]";
	}
	
	
}
