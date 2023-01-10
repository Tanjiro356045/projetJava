/**
 * 
 */
package fr.eni.encheres.bo;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Classe en charge de 
 * @author mlemat2022
 * @date 10 janv. 2023 - 11:51:02
 * @version projet_javaEE - v0.1
 */
public class Enchere implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 5817939532954582995L;
	private LocalDate dateEchere;
	private int montant_enchere;
	
	/**
	 * Constructeur
	 * @param dateEchre
	 * @param montant_enchere
	 */
	
	public Enchere(LocalDate dateEchere, int montant_enchere) {
		this();
		this.setDateEchre(dateEchere);
		this.setMontant_enchere(montant_enchere);
	}
	/**
	 * Constructeur
	 */
	public Enchere() {
		
	}
	/**
	 * Getter pour dateEchre.
	 * @return the dateEchre
	 */
	public LocalDate getDateEchre() {
		return dateEchere;
	}
	/**
	 * Setter pour dateEchre.
	 * @param dateEchre the dateEchre to set
	 */
	public void setDateEchre(LocalDate dateEchre) {
		this.dateEchere = dateEchre;
	}
	/**
	 * Getter pour montant_enchere.
	 * @return the montant_enchere
	 */
	public int getMontant_enchere() {
		return montant_enchere;
	}
	/**
	 * Setter pour montant_enchere.
	 * @param montant_enchere the montant_enchere to set
	 */
	public void setMontant_enchere(int montant_enchere) {
		this.montant_enchere = montant_enchere;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "Enchere [dateEchre=" + dateEchere + ", montant_enchere=" + montant_enchere + "]";
	}
}
