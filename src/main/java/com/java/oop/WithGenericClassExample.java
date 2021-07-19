package com.java.oop;

public class WithGenericClassExample {

	public static void main(String[] arr) {
	
		Product1<Integer,String> prod = new Product1<>(121, "Soap");
		
		int pID = prod.getProductId();
		String pDesc= prod.getProductDescription();
	
		System.out.println("Product ID - "+pID);
		System.out.println("Product Description - "+pDesc);
		
		Product1<String,String> prod1 = new Product1<>("121", "Soap");
		
		String pID1 = prod1.getProductId();
		 pDesc= prod1.getProductDescription();
	
		System.out.println("Product ID - "+pID1);
		System.out.println("Product Description - "+pDesc);
		
	}
}


class Product1<T,U>{
	
	private T productId;
	private U productDescription;

	public Product1(T productID, U productDescription) {
		this.productId = productID;
		this.productDescription = productDescription;
	}

	
	public T getProductId() {
		return productId;
	}


	public void setProductId(T productId) {
		this.productId = productId;
	}


	public U getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(U productDescription) {
		this.productDescription = productDescription;
	}


	@Override
	public String toString() {
		return "Product1 [productId=" + productId + ", productDescription=" + productDescription + "]";
	}
	
	
}