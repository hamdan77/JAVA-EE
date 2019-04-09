package de.uniba.dsg.dsam.backend.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import de.uniba.dsg.dsam.backend.entities.PromotionalGiftEntity;
import de.uniba.dsg.dsam.backend.entities.TrialPackageEntity;
import de.uniba.dsg.dsam.model.Incentive;
import de.uniba.dsg.dsam.model.PromotionalGift;
import de.uniba.dsg.dsam.model.TrialPackage;
import de.uniba.dsg.dsam.persistence.IncentiveManagement;

import de.uniba.dsg.dsam.backend.entities.IncentiveEntity;



@Stateless
public class IncentiveManagementBean implements IncentiveManagement {
	
	private static final Logger logger = Logger.getLogger(IncentiveManagementBean.class.getName());
	@PersistenceContext(type=PersistenceContextType.TRANSACTION)
	
	EntityManager em;

    @Override
    public void create(Incentive incentive) {

    }
    
    @Override
	public void create(String incentiveType, String name) {
    	
    	logger.info("valye of name is"+name);
    	
    	if (incentiveType == "Trial"){
    		
    		TrialPackageEntity incentive = new TrialPackageEntity( incentiveType, name);
    		
    		
        	em.persist(incentive);
    	} else if (incentiveType == "Promotional"){
    		PromotionalGiftEntity incentive = new PromotionalGiftEntity( incentiveType, name);
        	em.persist(incentive);
    	} else {
    		PromotionalGiftEntity incentive = new PromotionalGiftEntity( incentiveType, name);
        	em.persist(incentive);
    	}
    	
	}

    


	 @Override
		public List<Incentive> getPromotionalIncentives() {
			@SuppressWarnings("unchecked")

			List<Incentive> listIncentives = em.createNamedQuery("queryPromotiionalIncentives").getResultList();
			
			if(listIncentives == null) {
				return new ArrayList<Incentive>();
				
			}
			else {
				return listIncentives;
			}	
			
		
		}
		 @Override
			public List<Incentive> getTrialIncentives() {
				@SuppressWarnings("unchecked")
			
				
				
				List<Incentive> listIncentives = em.createNamedQuery("queryTrialIncentives").getResultList();
	
				if(listIncentives == null) {
					return new ArrayList<Incentive>();
				}
				else {
					return listIncentives;
				}	
			}
			
			
			 @Override
				public List<Incentive> combineIncentives() {
					
				List<Incentive> trialIncentives = getTrialIncentives();
				List<Incentive> promotionIncentives = getPromotionalIncentives();
					List<Incentive> newList = new ArrayList<>(trialIncentives.size() + promotionIncentives.size());
					newList.addAll(promotionIncentives);
			newList.addAll(trialIncentives);
					return newList;
					
				}
			
	@Override
	public Incentive getIncentives(int incentiveID) {
		// TODO Auto-generated method stub
		
		
		IncentiveEntity bev = em.find(IncentiveEntity.class, new Integer(incentiveID));	
		
		
		//method1
		
		TrialPackage incentive = new TrialPackage(bev.getId(),bev.getIncentive(), bev.getName());
		
		return incentive ;
		
		
    	/*
		if (bev.getIncentive() == "Trial"){
			
			TrialPackage incentive = new TrialPackage(bev.getId(),bev.getIncentive(), bev.getName());
    		
    		return incentive ;
        	
    	} 
		return null;*/
	}

	


	@Override
	public void update(int incentiveID, String name) {
		// TODO Auto-generated method stub
		
	IncentiveEntity bev = em.find(IncentiveEntity.class, new Integer(incentiveID));	
		
	
		
		
		bev.setName(name);
	
		
	}

	@Override
	public void delete(int incentiveID) {
		// TODO Auto-generated method stub
	}
}
