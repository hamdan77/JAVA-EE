package de.uniba.dsg.dsam.client;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import de.uniba.dsg.dsam.persistence.BeverageManagement;

@WebServlet("/BeveragesServlet")
public class BeveragesServlet extends HttpServlet {
	
	@EJB
	BeverageManagement bevMgt;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		req.setAttribute("beverageList", bevMgt.getBeverages());
		req.getRequestDispatcher("/beverageManager.jsp").forward(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
	
		//int BeverageId = Integer.valueOf(req.getParameter("BeverageId"));
		
		String BeverageName = req.getParameter("BeverageName").trim();
		String ManufacturerName = req.getParameter("ManufacturerName").trim();
		String promotion = req.getParameter("promotion").trim();
		int quantity = Integer.valueOf(req.getParameter("quantity"));
		
		double price = Double.valueOf(req.getParameter("price")); 
		bevMgt.create(  ManufacturerName,  BeverageName, promotion, quantity,  price);
		
		res.sendRedirect("/frontend");
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse res) throws IOException {

	}
}
