package service;

import java.sql.SQLException;

import buyer.buyerdao;
import dao.Sellerdao;

public class Sellerservice {
	Sellerdao obj = new Sellerdao();
	public void insertseller() throws SQLException {
obj.addseller();
	}
buyerdao ob = new buyerdao();
public void buyerservice() throws SQLException {
	ob.buyer();
	ob.buyeruser();
}
public void buyeruserservice() throws SQLException {
	
	
}

	}
