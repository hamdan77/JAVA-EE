package de.uniba.dsg.dsam.client;

import java.io.IOException;
import java.util.logging.Logger;
import java.util.*;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import de.uniba.dsg.dsam.persistence.IncentiveManagement;
import de.uniba.dsg.dsam.model.Incentive;
import de.uniba.dsg.dsam.model.TrialPackage;

@WebServlet("/EditIncentive")
public class EditIncentiveServlet extends HttpServlet {
	private static final Logger logger = Logger.getLogger(EditServlet.class.getName());
	
	@EJB
	IncentiveManagement incMgt;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		
		
		int id = Integer.valueOf(req.getParameter("inc_id"));
	
	
		Incentive bev = incMgt.getIncentives(id);
		
		// add data for JSP
		req.setAttribute("myinc", bev);
		req.getRequestDispatcher("/editIncentive.jsp").forward(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		//int BeverageId = Integer.valueOf(req.getParameter("inc_id"));
		String BeverageName = req.getParameter("name").trim();
		int id = Integer.valueOf(req.getParameter("id"));
		
		incMgt.update( id,  BeverageName);
		
	
		// redirect
		res.sendRedirect("/frontend/IncentiveServlet");
	
	}	
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int id = Integer.valueOf(req.getParameter("bev_id"));
		
		//bevMgt.delete(id);
		
	
	}
	
	
}
