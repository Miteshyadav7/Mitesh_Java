package model;

public class Seller {
	String regno;
	String brand;
	int year;
	String model;
	String varient;
	String owner;
	int kmdriven;
	String phnno;
	
	
	Seller(String regno,String brand,int year,String model,String varient,String owner,int kmdriven,String phnno){
		this.regno=regno;
		this.brand = brand;
		this.year=year;
		this.model=model;
		this.varient=varient;
		this.owner=owner;
		this.kmdriven=kmdriven;
		this.phnno=phnno;
		}

public	String toString() {
	return regno+brand+year+model+varient+owner+kmdriven+phnno;
}
}