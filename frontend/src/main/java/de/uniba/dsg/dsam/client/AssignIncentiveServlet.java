package de.uniba.dsg.dsam.client;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import de.uniba.dsg.dsam.persistence.IncentiveManagement;
import de.uniba.dsg.dsam.model.Incentive;
import de.uniba.dsg.dsam.persistence.BeverageManagement;

import de.uniba.dsg.dsam.model.Beverage;


@WebServlet("/AssignIncentive")
public class AssignIncentiveServlet extends HttpServlet {
	
	
	@EJB
	IncentiveManagement incenMgmt;
	BeverageManagement bevMgt;
	
	
//	public String BeverageId;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		//req.setAttribute("incentiveList", incenMgmt.getPromotionalIncentives());
		
	String BeverageId = req.getParameter("bev_id");
		
	
	req.setAttribute("BeverageId", BeverageId);
		
		req.setAttribute("incentiveList", incenMgmt.combineIncentives());
		
		//req.setAttribute("incentivePromoList", incenMgmt.getPromotionalIncentives());
		
		req.getRequestDispatcher("/assignIncentive.jsp").forward(req, res);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		//int incentiveId = Integer.valueOf(req.getParameter("IncentiveId"));

		//get here the values from beverage table
		//get the values from incteive table
		//post the value of incetive id in beverage table as fk
		//
		
		String incentiveId = req.getParameter("IncentiveId");
		
	
		
		
		
	//int BeverageId = Integer.valueOf(req.getParameter("BeverageId"));
		
		String incentiveType = req.getParameter("IncentiveType");
		
		if ("Trial".equals(incentiveType)) {
			//incenMgmt.create( "Trial", incentiveName);
		//bevMgt.update( BeverageId,   incentiveId);
			//res.sendRedirect("/frontend/beverageCreation");
			
		}  
		if ("Promotional".equals(incentiveType)) {
			//bevMgt.update( BeverageId, incentiveId);
			//res.sendRedirect("/frontend/PlaceOrder");
			
		}
		if ("None".equals(incentiveType)) {
			
			//res.sendRedirect("/frontend/BeveragesServlet");
			//bevMgt.update( BeverageId,  incentiveId);
			
		}
		
		
		
	res.sendRedirect("/frontend");
		
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse res) throws IOException {

	}
}
