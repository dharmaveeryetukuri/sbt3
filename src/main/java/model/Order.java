package model;

import model.Customer;
import model.Product;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Order {
	private Long id;
	private Customer customer;
	private Product product;
	private Date date;
	private List<Order> orders;
	
	public Order(){
		
	}
	
	public Order(Long id, Customer customer, Product product, Date date) {
		this.id = id;
		this.customer = customer;
		this.product = product;
		this.date = date;
	}
	
	public void listAdd(Long id, Customer customer, Product product, Date date) {
		orders.add(new Order(id, customer, product, date));
	}
	
	public void listRemove(Long id) {
		orders.remove(id);
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	

	
}
