/**
 * 
 */
package fr.eni.encheres.servlet;

/**
 * Classe en charge de gérer les codes d"erreurs sur les servlets.
 * Codes disponibles entre 30000 et 39999.
 * @author dsanchez
 * @date 3 janv. 2023 - 16:45:16
 * @version TPListeCoursesV1 - v0.1
 */
public abstract class CodeResultatsServlets {
	/**
	 * Format id Liste course incorrect.
	 */
	public static final int FORMAT_ID_LISTE_ERREUR = 30000;
	
	/**
	 * nom article obligatoire.
	 */
	public static final int NOM_ARTICLE_OBLIGATOIRE = 30001;
	
	/**
	 * nom liste obligatoire.
	 */
	public static final int NOM_LISTE_OBLIGATOIRE = 30002;
	
	/**
	 * Erreur sur le format de l'identifiant de l'article.
	 */
	public static final int FORMAT_ID_ARTICLE_ERREUR = 30003;
}
