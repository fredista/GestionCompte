package org.sid.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document

public class Product {
	
	@Id
	private String id;
	private String name;
	private Double price; 
	@DBRef
	private  Category categorie ; 
	
	
	
	
	public Product(String id, String name, Double price, Category categorie) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.categorie = categorie;
	}
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Category getCategorie() {
		return categorie;
	}
	public void setCategorie(Category categorie) {
		this.categorie = categorie;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", categorie=" + categorie + "]";
	}
	
	

}
