package org.sid.entities;

import java.util.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document


public class Category {

	@Id
	private String id;
	private String name; 
	@DBRef
	private Collection<Product> prdt = new ArrayList<>();
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
	public Collection<Product> getPrdt() {
		return prdt;
	}
	public void setPrdt(Collection<Product> prdt) {
		this.prdt = prdt;
	}
	public Category(String id, String name, Collection<Product> prdt) {
		super();
		this.id = id;
		this.name = name;
		this.prdt = prdt;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", prdt=" + prdt + "]";
	}
	
	
}
