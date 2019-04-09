package de.uniba.dsg.dsam.backend.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class IncentiveEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public int id;
	
	public String incentiveType;
	public String Name;
	public IncentiveEntity(){
		
	}
	
	/**
	 * @param id
	 * @param incentiveType
	 * @param Name
	 */
	public IncentiveEntity( String incentiveType) {
		this();
		//this.id = id;
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
	public String getIncentive() {
		return incentiveType;
	}
	
	/**
	 * @param incentiveType the incentiveType to set
	 */
	public void setIncentive(String incentiveType) {
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
