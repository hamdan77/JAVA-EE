package de.uniba.dsg.dsam.model;

import java.io.Serializable;

public abstract class Incentive implements Serializable{
	
	public int id;
	public String incentiveType;
	public String Name;
	public Incentive(){
		
	}
	
	/**
	 * @param id
	 * @param incentiveType
	 * @param Name
	 */
	
	public Incentive(int id, String incentiveType) {
		super();
		this.id = id;
		this.incentiveType = incentiveType;
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
	 * @return the incentiveType
	 */
	public String getIncentiveType() {
		return incentiveType;
	}
	
	
	/**
	 * @param incentiveType the incentiveType to set
	 */
	public void setIncentiveType(String incentiveType) {
	
		this.incentiveType = incentiveType;
	}
	
	/**
	 * @return the Name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param Name the Name to set
	 */
	public void setName(String Name) {
		this.Name = Name;
	}
	
}
