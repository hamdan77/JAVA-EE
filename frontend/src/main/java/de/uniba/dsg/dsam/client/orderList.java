package de.uniba.dsg.dsam.client;

import java.io.IOException;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import de.uniba.dsg.dsam.persistence.OrderMessage;
import de.uniba.dsg.dsam.persistence.BeverageManagement;


@WebServlet("/orderList")
public class orderList extends HttpServlet {
	private static final Logger logger = Logger.getLogger(OrderServlet.class.getName());
	@EJB
	BeverageManagement bevMgt;
	@EJB
	OrderMessage orderMgt;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		//req.setAttribute("beverageList", orderMgt.getOrders());
		req.getRequestDispatcher("/viewOrders.jsp").forward(req, res);
		
	
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
	
	
		
		res.sendRedirect("/frontend");
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse res) throws IOException {

	}
}
