package de.uniba.dsg.dsam.client;

import java.io.IOException;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import de.uniba.dsg.dsam.persistence.BeverageManagement;

import de.uniba.dsg.dsam.model.Beverage;

@WebServlet("/EditBeverages")
public class EditServlet extends HttpServlet {
	private static final Logger logger = Logger.getLogger(EditServlet.class.getName());
	
	@EJB
	BeverageManagement bevMgt;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		
		
		int id = Integer.valueOf(req.getParameter("bev_id"));
	
	
		Beverage bev = bevMgt.getBeverages(id);
		// add data for JSP
		req.setAttribute("mybev", bev);
		req.getRequestDispatcher("/edit.jsp").forward(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int BeverageId = Integer.valueOf(req.getParameter("bev_id"));
		String BeverageName = req.getParameter("bev_name").trim();
		String ManufacturerName = req.getParameter("bev_manufacturer").trim();
		String promotion = req.getParameter("bev_promotion").trim();
		int quantity = Integer.valueOf(req.getParameter("bev_quantity"));
		
		double price = Double.valueOf(req.getParameter("bev_price")); 
		bevMgt.update( BeverageId,  ManufacturerName,  BeverageName, promotion, quantity,  price);
		
		
		//logger.info("Created hamdan");
		// redirect
		res.sendRedirect("/frontend/BeveragesServlet");
	
	}	
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int id = Integer.valueOf(req.getParameter("bev_id"));
		
		bevMgt.delete(id);
		
	
	}
	
	
}
