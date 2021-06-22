package model;

import java.util.List;

public class Product {
	private List<Product> products;
	private Long id;
	private String name;
	private int count;
	private Double price;
	
	public Product() {
		
	}
	
	public Product(Long id, String name, int count, Double price) {
		this.id = id;
		this.name = name;
		this.count = count;
		this.price = price;
	}
	
	public void addList(){
		products.add(new Product(id,name,count,price));
	}
	

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	

}
