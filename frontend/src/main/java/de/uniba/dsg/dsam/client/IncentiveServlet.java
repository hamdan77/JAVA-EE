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

import java.util.logging.Logger;

@WebServlet("/IncentiveServlet")
public class IncentiveServlet extends HttpServlet {
	
	private static final Logger logger = Logger.getLogger(IncentiveServlet.class.getName());
	@EJB
	IncentiveManagement incenMgmt;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		//req.setAttribute("incentiveList", incenMgmt.getPromotionalIncentives());
		
		req.setAttribute("incentiveList", incenMgmt.combineIncentives());
		
		//req.setAttribute("incentivePromoList", incenMgmt.getPromotionalIncentives());
		
		req.getRequestDispatcher("/incentiveManager.jsp").forward(req, res);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		//int incentiveId = Integer.valueOf(req.getParameter("IncentiveId"));
		String incentiveName = req.getParameter("IncentiveName");
		String incentiveType = req.getParameter("IncentiveType");
		logger.severe("check hamdan 2" + incentiveName);
		logger.info("Check the name value at 1"+incentiveName);
		if ("Trial".equals(incentiveType)) {
			
			logger.severe("check name at trial" + incentiveName);
			logger.info("Check the name at trial"+incentiveName);
			incenMgmt.create( "Trial", incentiveName);
		} else if ("Promotional".equals(incentiveType)) {
			logger.severe("check name at promotion" + incentiveName);
			logger.info("Check the name at promotion"+incentiveName);
			incenMgmt.create( "Promotional", incentiveName);
		} 
	
		res.sendRedirect("/frontend");
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse res) throws IOException {

	}
}
