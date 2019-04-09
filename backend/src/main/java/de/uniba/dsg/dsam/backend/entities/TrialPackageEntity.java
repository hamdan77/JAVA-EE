package de.uniba.dsg.dsam.backend.entities;

import javax.persistence.Entity;

@Entity
public class TrialPackageEntity extends IncentiveEntity {
	
	private String Name;
	
	public TrialPackageEntity(){
		
	}
	
	/**
	 * @param Name
	 */
	public TrialPackageEntity( String incentiveType, String name) {
		this();
		//this.setId(id);
		this.setIncentive("Trial");
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
	public void setName(String Name) {
		this.Name = Name;
	}
}
