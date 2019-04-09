package de.uniba.dsg.dsam.model;

public class PromotionalGift extends Incentive {
	
	private String Name;
	
	public PromotionalGift(){
		
	}
	
	/**
	 * @param Name
	 */
	
	public PromotionalGift(String promotionName) {
		super();
		this.Name = promotionName;
		
	}
	
	public PromotionalGift(int id,String incentiveType, String promotionName) {
		super(id,incentiveType);
		this.Name = promotionName;
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
