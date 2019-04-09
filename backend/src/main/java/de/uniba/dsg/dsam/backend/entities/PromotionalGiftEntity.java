package de.uniba.dsg.dsam.backend.entities;

import javax.persistence.Entity;

@Entity
public class PromotionalGiftEntity extends IncentiveEntity {
	
	private String Name;
	
	public PromotionalGiftEntity(){
		
	}
	
	/**
	 * @param Name
	 */
	public PromotionalGiftEntity(String incentiveType, String name) {
		this();
		
		
		this.setIncentive("Promotional");
		this.Name = name;
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
	public void setName(String promotionName) {
		this.Name = promotionName;
	}
}