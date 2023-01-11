/**
 * 
 */
package fr.eni.encheres.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe en charge de recenser l'ensemblre des erreurs.
 * @author mlemat2022
 * @date 11 janv. 2023 - 10:03:20
 * @version projet_javaEE - v0.1
 */

public class BusinessException extends Exception{
	private static final long serialVersionUID = 1L;
	private List<Integer> listeCodesErreur;
	
	public BusinessException() {
		super();
		this.listeCodesErreur=new ArrayList<>();
	}
	
	/**
	 * 
	 * @param code Code de l'erreur. Doit avoir un message associé dans un fichier properties.
	 */
	public void ajouterErreur(int code)
	{
		if(!this.listeCodesErreur.contains(code))
		{
			this.listeCodesErreur.add(code);
		}
	}
	
	public boolean hasErreurs()
	{
		return this.listeCodesErreur.size()>0;
	}
	
	public List<Integer> getListeCodesErreur()
	{
		return this.listeCodesErreur;
	}
}

