package de.uniba.dsg.dsam.backend.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;

import de.uniba.dsg.dsam.model.Beverage;
import de.uniba.dsg.dsam.persistence.BeverageManagement;

//import de.uniba.dsg.dsam.backend.entities.BeverageEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import de.uniba.dsg.dsam.backend.entities.BeverageEntity;

@Stateless
public class BeverageManagementBean implements BeverageManagement {
	
	private static final Logger logger = Logger.getLogger(BeverageManagementBean.class.getName());
	@PersistenceContext(type=PersistenceContextType.TRANSACTION)
	
	EntityManager em;

    @Override
    public void create(Beverage beverage) {

    }
    
    @Override
	public void create(String manufacturer, String name, String promotion, int quantity, double price) {
	
    	BeverageEntity b = new BeverageEntity( manufacturer,  name,  promotion, quantity, price);
		System.out.println(b);
    	em.persist(b);
	}

    @Override
	public List<Beverage> getBeverages() {
		@SuppressWarnings("unchecked")
		
		List<Beverage> listBeverage = em.createNamedQuery("queryBeverages").getResultList();
	
		
		if(listBeverage == null) {
			return new ArrayList<Beverage>();
		}
		else {
			return listBeverage;
		}		
	}
	
	@Override
	public Beverage getBeverages(int bevID) {
		BeverageEntity bv = em.find(BeverageEntity.class, new Integer(bevID));	
		
		return convert(bv);
	}

	private Beverage convert(BeverageEntity bev) {
		Beverage ret = new Beverage(bev.getId(), bev.getManufacturer(), bev.getName(), bev.getpromotion(),bev.getQuantity(), bev.getPrice() );
		return ret;
	}
	
	//update the beverages
	@Override
	public void update(int id, String manufacturer, String name, String promotion, int quantity, double price) {
	
		BeverageEntity bev = em.find(BeverageEntity.class, new Integer(id));
		//BeverageEntity bev = selection(id);
		// COMMNET
		
		bev.setManufacturer(manufacturer);
		bev.setName(name);
		bev.setpromotion(promotion);
		bev.setQuantity(quantity);
		bev.setPrice(price);
	}
	//assign incentive id in beverages
	@Override
	public void update(String id, String promotion) {
	
		
		
		//BeverageEntity bev = em.find(BeverageEntity.class, new Integer(id));
		//BeverageEntity bev = selection(id);
		// COMMNET
		
		
	//	bev.setpromotion(promotion);
		
	}
	
	private BeverageEntity selection(int bevId) {
		//BeverageEntity bv = em.find(BeverageEntity.class, new Integer(bevId));
		return null;
	}
	
	@Override
	public void delete(int bevID) {
		
		BeverageEntity mybev = em.find(BeverageEntity.class, new Integer(bevID));
		em.remove(mybev);	
	}
}
