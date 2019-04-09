package de.uniba.dsg.dsam.model;

import java.io.Serializable;

public final class Beverage implements Serializable {
	
	private int id;
	private String manufacturer;
    private String name;
	private String promotion;
    private int quantity;
    private double price;
	
	public Beverage(){
		
	}
	
	/**
	 * @param id
	 * @param manufacturer
	 * @param name
	 * @param promotion
	 * @param quantity
	 * @param price
	 */
	
	public Beverage(int id, String manufacturer, String name, String promotion, int quantity, double price) {
		super();
		this.id = id;
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
	public String getPromotion() {
		return promotion;
	}
	/**
	 * @param promotion the promotion to set
	 */
	public void setPromotion(String promotion) {
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