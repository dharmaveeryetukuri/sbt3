package business;

import java.util.List;

import dao.OrderDAO;
import model.Order;

/**
 * This class defines all the methods that one can use in order to interact with
 * orders. This class also communicates with the database and processes the
 * incoming data and delivers it in a meaningful way to the user.
 * 
 * @author Bogdan Paun
 */
public class OrdersBLL {

	private OrderDAO ordersDAO;

	public OrdersBLL() {
		ordersDAO = new OrderDAO();
	}

	public Order get(int id) {
		return ordersDAO.findByField("id", id);
	}
	
	public List<Order> getAll(){
		return ordersDAO.findAll();
	}

	public void insert(Order a) {
		long id = ordersDAO.insert(a);
		a.setId(id);
	}

	public void update(Order a) {
		ordersDAO.update(a);
	}

	public void remove(int id) {
		ordersDAO.remove(id);
	}

	public int getNextId() {
		return ordersDAO.findNextId();
	}

}
