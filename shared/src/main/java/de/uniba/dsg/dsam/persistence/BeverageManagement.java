package de.uniba.dsg.dsam.persistence;

import java.util.List;
import de.uniba.dsg.dsam.model.Beverage;

public interface BeverageManagement {

    public void create(Beverage beverage);
    
    //beverages CRUD operations
   	public void create( String manufacturer, String name, String promotion, int quantity, double price);
	
   	List<Beverage> getBeverages();
	public Beverage getBeverages(int bevID);
	public void update(int id, String manufacturer, String name, String promotion, int quantity, double price);
	public void delete(int bevID) ;
	
	//
	//assign incentive id in beverages
		
		public void update(String id, String promotion);
}