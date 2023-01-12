/**
 * 
 */
package fr.eni.encheres.messages;

import java.io.Serializable;
import java.util.ResourceBundle;

/**
 * Classe en charge de 
 * @author mlemat2022
 * @date 11 janv. 2023 - 12:25:25
 * @version projet_javaEE - v0.1
 */


public class LecteurMessage implements Serializable{
	/**
	 * Serial UID.
	 */
	private static final long serialVersionUID = 7859484212418571817L;
	private static ResourceBundle rb;
	
	static
	{
		try
		{
			rb = ResourceBundle.getBundle("fr.eni.echeres.messages.messages_erreur");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * @param code
	 * @return
	 */
	public static  String getMessageErreur(int code)
	{
		String message="";
		try
		{
			if(rb!=null)
			{
				message = rb.getString(String.valueOf(code));
			}
			else
			{
				message="Problème à la lecture du fichier contenant les messages";
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			message="Une erreur inconnue est survenue";
		}
		return message;
	}
}

