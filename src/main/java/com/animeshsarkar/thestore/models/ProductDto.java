package com.animeshsarkar.thestore.models;

import jakarta.validation.constraints.*;

public class ProductDto {
	
	//display error message
		@NotEmpty(message="Name is required")
		private String name;
		
		@NotNull(message = "Price is required")
		 @Min(value = 1, message = "Price must be at least 1")
	    private double price;
		
		@NotEmpty(message="Brand is required")
	    private String brand;
		
		@NotEmpty(message="modelNumber is required")
	    private String modelNumber;
		
		@NotEmpty(message="Color is required")
		private String color;
		
		@NotNull(message = "Warranty is required")
		 @Min(value = 1, message = "Warranty must be at least 1")
	    private int warranty;
		
		@NotNull(message = "Battery Life is required")
		 @Min(value = 1, message = "Battery Life must be at least 1")
	    private double batteryLife;
		
		 @NotNull(message = "Rating is required")
		 @Min(value = 1, message = "Rating must be at least 1")
	    private double rating;
	    
		 	public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public double getPrice() {
				return price;
			}

			public void setPrice(double price) {
				this.price = price;
			}

			public String getBrand() {
				return brand;
			}

			public void setBrand(String brand) {
				this.brand = brand;
			}

			public String getModelNumber() {
				return modelNumber;
			}

			public void setModelNumber(String modelNumber) {
				this.modelNumber = modelNumber;
			}

			public String getColor() {
				return color;
			}

			public void setColor(String color) {
				this.color = color;
			}

			public int getWarranty() {
				return warranty;
			}

			public void setWarranty(int warranty) {
				this.warranty = warranty;
			}

			public double getBatteryLife() {
				return batteryLife;
			}

			public void setBatteryLife(double batteryLife) {
				this.batteryLife = batteryLife;
			}

			public double getRating() {
				return rating;
			}

			public void setRating(double rating) {
				this.rating = rating;
			}

}
