package de.uniba.dsg.dsam.backend.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
public class BeverageEntity implements Serializable {
		
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Version
	private int version;
	private String manufacturer;
    private String name;
	private String promotion;
    private int quantity;
    private double price;
            	
	public BeverageEntity(){
		
	}
	
	/**
	 * @param manufacturer
	 * @param name
	 * @param promotion
	 * @param quantity
	 * @param price
	 */
	public BeverageEntity( String manufacturer, String name, String promotion, int quantity, double price) {
		this();
		//this.id = id;
		this.manufacturer = manufacturer;
		this.name = name;
		this.promotion = promotion;
		this.quantity = quantity;
		this.price = price;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the promotion
	 */
	public String getpromotion() {
		return promotion;
	}
	/**
	 * @param promotion the promotion to set
	 */
	public void setpromotion(String promotion) {
		this.promotion = promotion;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
}