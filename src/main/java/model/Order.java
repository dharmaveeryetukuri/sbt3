package model;

import model.Customer;
import model.Product;
import java.util.Date;
import java.util.List;

public class Order {
	Long id_Ordr;
	Long id_Cust;
	Long id_Prod;
	Date date;
	private List<Order> orders;
	
	public Order(){
		
	}
	
	public Order(Long id_Ordr, Long id_Cust, Long id_Prod, Date date) {
		super();
		this.id_Ordr = id_Ordr;
		this.id_Cust = id_Cust;
		this.id_Prod = id_Prod;
		this.date = date;
	}

	public Long getId_Ordr() {
		return id_Ordr;
	}

	public void setId_Ordr(Long id_Ordr) {
		this.id_Ordr = id_Ordr;
	}

	public Long getId_Cust() {
		return id_Cust;
	}

	public void setId_Cust(Long id_Cust) {
		this.id_Cust = id_Cust;
	}

	public Long getId_Prod() {
		return id_Prod;
	}

	public void setId_Prod(Long id_Prod) {
		this.id_Prod = id_Prod;
	}


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
