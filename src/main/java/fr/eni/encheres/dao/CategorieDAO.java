/**
 * 
 */
package fr.eni.encheres.dao;

import java.util.List;

import fr.eni.encheres.bo.Categorie;

/**
 * Interface en charge de gérer la DAO des catégories d'articles. 
 * @author falbricias2022
 * @date 11 janv. 2023 - 09:18:12
 * @version projet_javaEE - v0.1
 */
public interface CategorieDAO {

	// TODO : throws Business Exception sur l'ensemble des méthodes

	
	// Définition des méthodes de CRUD
	public Categorie selectById(int noCategorie);

	public List<Categorie> selectAll();

	public void update(Categorie data);

	public void insert(Categorie data);

	public void delete(int noCategorie);

}
