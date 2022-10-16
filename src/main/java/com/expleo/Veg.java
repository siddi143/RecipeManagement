package com.expleo;

public class Veg {
   private String name;
   private String ingredients;
   private String description;
public Veg(String name, String ingredients, String description) {
	super();
	this.name = name;
	this.ingredients = ingredients;
	this.description = description;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getIngredients() {
	return ingredients;
}
public void setIngredients(String ingredients) {
	this.ingredients = ingredients;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
   
}
