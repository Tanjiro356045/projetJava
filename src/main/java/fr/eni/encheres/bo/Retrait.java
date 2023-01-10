/**
 * 
 */
package fr.eni.encheres.bo;

import java.io.Serializable;

/**
 * Classe en charge de 
 * @author mlemat2022
 * @date 10 janv. 2023 - 11:53:27
 * @version projet_javaEE - v0.1
 */
public class Retrait implements Serializable {

	
	private static final long serialVersionUID = -7238436495798377474L;
	
	private int rue;
	private int code_postal;
	private String ville;
	/**
	 * Constructeur
	 * @param rue
	 * @param code_postal
	 * @param ville
	 */
	public Retrait(int rue, int code_postal, String ville) {
		super();
		this.setCode_postal(code_postal);
		this.setRue(rue);
		this.setVille(ville);
	}
	/**
	 * Constructeur
	 */
	public Retrait() {
		super();
	}

	public Retrait(String ville) {
		super();
		this.setVille(ville);
	}
	/**
	 * Getter pour rue.
	 * @return the rue
	 */
	public int getRue() {
		return rue;
	}
	/**
	 * Setter pour rue.
	 * @param rue the rue to set
	 */
	public void setRue(int rue) {
		this.setRue(rue);
	}
	/**
	 * Getter pour code_postal.
	 * @return the code_postal
	 */
	public int getCode_postal() {
		return code_postal;
	}
	/**
	 * Setter pour code_postal.
	 * @param code_postal the code_postal to set
	 */
	public void setCode_postal(int code_postal) {
		this.setCode_postal(code_postal);
	}
	/**
	 * Getter pour ville.
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * Setter pour ville.
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	/**
	 * Getter pour serialversionuid.
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
