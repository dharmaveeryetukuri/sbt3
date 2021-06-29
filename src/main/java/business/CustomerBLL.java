package business;

import java.util.List;

import dao.CustomerDAO;
import model.Customer;

/**
 * This class defines all the methods that one can use in order to interact with
 * clients. This class also communicates with the database and processes the
 * incoming data and delivers it in a meaningful way to the user.
 * 
 * @author Bogdan Paun
 */
public class CustomerBLL {

	private CustomerDAO customerDAO;

	public CustomerBLL() {
		customerDAO = new CustomerDAO();
	}

	public Customer get(int id) {
		return customerDAO.findByField("id", id);
	}

	public List<Customer> getAll() {
		return customerDAO.findAll();
	}

	public void insert(Customer c) {
		long id = customerDAO.insert(c);
		c.setId(id);
	}

	public void update(Customer c) {
		customerDAO.update(c);
	}

	public void remove(int id) {
		customerDAO.remove(id);
	}
}
