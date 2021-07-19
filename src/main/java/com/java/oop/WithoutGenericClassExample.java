package com.java.oop;

public class WithoutGenericClassExample {

	public static void main(String a[]) {
		Product product = new Product(121,"Soap");
		
		int pid = (int)product.getProductId();
		
		System.out.println("Product ID - "+pid);

		String pdesc= (String)product.getProductDescription();
	
		System.out.println("Product Description - "+pdesc);
	}
	
}

class Product{
	
	private Object productId;
	private Object productDescription;

	public Product(Object productID, Object productDescription) {
		this.productId = productID;
		this.productDescription = productDescription;
	}

	public Object getProductId() {
		return productId;
	}

	public void setProductId(Object productId) {
		this.productId = productId;
	}

	public Object getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(Object productDescription) {
		this.productDescription = productDescription;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productDescription=" + productDescription + "]";
	}

	

}