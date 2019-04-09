package de.uniba.dsg.dsam.model;

public class TrialPackage extends Incentive {
	
private String Name;
	
	public TrialPackage(){
		
	}
	
	/**
	 * @param Name
	 */
	
	public TrialPackage(String trialName) {
		super();
		this.Name = trialName;
	}
	
	public TrialPackage(int id,String incentiveType, String trialName) {
		super(id,incentiveType);
		this.Name = trialName;
		this.id = id;
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
