package main;

import java.sql.SQLException;
import java.util.*;

import service.Sellerservice;
public class Main {
	public static void main(String args[]) throws SQLException {
	Scanner sc = new Scanner(System.in);
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<-------------------------------- >>>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<----------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>");
System.out.println("<<<<<<<<<<<<<<<<<--------------------WLECOME TO AUTOMOBILE DEALING--------------->>>>>>>>>>>>>>>");
System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<------------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>");
System.out.println("1.SELL A CAR 🚗 \n2.BUY CAR 🚗 ");
	int m = sc.nextInt();

	if(m==1) {
	Sellerservice obj = new Sellerservice();
	obj.insertseller();
	}
	if(m==2) {
		Sellerservice obj = new Sellerservice();
		obj.buyerservice();
		}
	if(m==3) {
		Sellerservice obj = new Sellerservice();
		obj.buyeruserservice();
		}
	
	
	
	
	
	}

}
