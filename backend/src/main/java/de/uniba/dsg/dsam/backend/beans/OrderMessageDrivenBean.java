package de.uniba.dsg.dsam.backend.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import de.uniba.dsg.dsam.backend.entities.CustomerOrderEntity;
import de.uniba.dsg.dsam.persistence.OrderMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import de.uniba.dsg.dsam.model.CustomerOrder;

@Stateless
public class OrderMessageDrivenBean implements OrderMessage {
	private static final Logger logger = Logger.getLogger(OrderMessage.class.getName());
	
	@PersistenceContext(type=PersistenceContextType.TRANSACTION)
	
	EntityManager em;
	
	  @Override
	    public void create(CustomerOrder orderss) {

	    }
	  @Override
	  public void create( String name,  String manufacturer, int quantity) {

		  logger.info("im inn order bean"+name+"name");
	
	CustomerOrderEntity b = new CustomerOrderEntity( name, manufacturer,   quantity);
	
	
	
	em.persist(b);
	
}



   
}
