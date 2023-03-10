package web;

import java.util.ArrayList;
import java.util.List;

import metier.entities.Categorie;

public class CategorieModel {
	
	public CategorieModel() {
		super();
	}
	List<Categorie> categories = new ArrayList<>(); 
	public List<Categorie> getCategories() { 
	return categories; 
	} 
	public void setCategories(List<Categorie> categories) { 
	this.categories = categories; 
	} 


}
