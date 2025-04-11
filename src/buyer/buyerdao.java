package buyer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class buyerdao {
	Scanner sc = new Scanner(System.in);
	
	String url ="jdbc:mysql://localhost:3306/parties";
	public Connection connect() throws SQLException{
	return DriverManager.getConnection(url,"root","root");
	
	
	}
	public void buyer() throws SQLException {
Connection con = connect();
Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from buyer ");
		while(rs.next()){
			System.out.println( "ID "+ rs.getInt("id")+ " "  +rs.getString("brand")+  " "+rs.getString("model")+ " "+rs.getInt("reg")+  " "+rs.getString("fuel")+  " "+rs.getInt("kmdriven")+  " "+rs.getString("transmission")+  " "+rs.getInt("ownership")+  " "+rs.getString("insurancevalid")+  " "+rs.getString("location"));
		System.out.println("_________________________________________________________________________________________________________________________________________________________________________");
		}
		}
		public void buyeruser() throws SQLException {
			Connection con = connect();
			Statement st = con.createStatement();
			System.out.println("ENTER A ID OF VEHICLE FOR PURCHASE VEHICLE");
			System.out.println();
			int n = sc.nextInt();
			if(n ==1) {
					ResultSet rs = st.executeQuery("select * from buyer where id ="+n);
					while(rs.next()) {
						System.out.println(rs.getString("brand")+  " "+rs.getString("model")+ " "+rs.getInt("reg")+  " "+rs.getString("fuel")+  " "+rs.getInt("kmdriven")+  " "+rs.getString("transmission")+  " "+rs.getInt("ownership")+  " "+rs.getString("insurancevalid")+  " "+rs.getString("location"));
			System.out.println("your vehicle amount is 1400000");
			
			}}
					else if(n ==2) {
						ResultSet rs = st.executeQuery("select * from buyer where id ="+n);
						while(rs.next()) {
							System.out.println(rs.getString("brand")+  " "+rs.getString("model")+ " "+rs.getInt("reg")+  " "+rs.getString("fuel")+  " "+rs.getInt("kmdriven")+  " "+rs.getString("transmission")+  " "+rs.getInt("ownership")+  " "+rs.getString("insurancevalid")+  " "+rs.getString("location"));
				System.out.println("your vehicle amount is 500000");
				}}		
					else if(n ==3) {
						ResultSet rs = st.executeQuery("select * from buyer where id ="+n);
						while(rs.next()) {
							System.out.println(rs.getString("brand")+  " "+rs.getString("model")+ " "+rs.getInt("reg")+  " "+rs.getString("fuel")+  " "+rs.getInt("kmdriven")+  " "+rs.getString("transmission")+  " "+rs.getInt("ownership")+  " "+rs.getString("insurancevalid")+  " "+rs.getString("location"));
				System.out.println("your vehicle amount is 610000");
				}}	
					else if(n ==4) {
						ResultSet rs = st.executeQuery("select * from buyer where id ="+n);
						while(rs.next()) {
							System.out.println(rs.getString("brand")+  " "+rs.getString("model")+ " "+rs.getInt("reg")+  " "+rs.getString("fuel")+  " "+rs.getInt("kmdriven")+  " "+rs.getString("transmission")+  " "+rs.getInt("ownership")+  " "+rs.getString("insurancevalid")+  " "+rs.getString("location"));
				System.out.println("your vehicle amount is 1200000");
				}}	
					else if(n ==5) {
						ResultSet rs = st.executeQuery("select * from buyer where id ="+n);
						while(rs.next()) {
							System.out.println(rs.getString("brand")+  " "+rs.getString("model")+ " "+rs.getInt("reg")+  " "+rs.getString("fuel")+  " "+rs.getInt("kmdriven")+  " "+rs.getString("transmission")+  " "+rs.getInt("ownership")+  " "+rs.getString("insurancevalid")+  " "+rs.getString("location"));
				System.out.println("your vehicle amount is 1100000");
				}}	
					else if(n ==6) {
						ResultSet rs = st.executeQuery("select * from buyer where id ="+n);
						while(rs.next()) {
							System.out.println(rs.getString("brand")+  " "+rs.getString("model")+ " "+rs.getInt("reg")+  " "+rs.getString("fuel")+  " "+rs.getInt("kmdriven")+  " "+rs.getString("transmission")+  " "+rs.getInt("ownership")+  " "+rs.getString("insurancevalid")+  " "+rs.getString("location"));
				System.out.println("your vehicle amount is 100000");
				}}	
					else if(n ==7) {
						ResultSet rs = st.executeQuery("select * from buyer where id ="+n);
						while(rs.next()) {
							System.out.println(rs.getString("brand")+  " "+rs.getString("model")+ " "+rs.getInt("reg")+  " "+rs.getString("fuel")+  " "+rs.getInt("kmdriven")+  " "+rs.getString("transmission")+  " "+rs.getInt("ownership")+  " "+rs.getString("insurancevalid")+  " "+rs.getString("location"));
				System.out.println("your vehicle amount is 700000");
				}}	
					else if(n ==8) {
						ResultSet rs = st.executeQuery("select * from buyer where id ="+n);
						while(rs.next()) {
							System.out.println(rs.getString("brand")+  " "+rs.getString("model")+ " "+rs.getInt("reg")+  " "+rs.getString("fuel")+  " "+rs.getInt("kmdriven")+  " "+rs.getString("transmission")+  " "+rs.getInt("ownership")+  " "+rs.getString("insurancevalid")+  " "+rs.getString("location"));
				System.out.println("your vehicle amount is 650000");
				}}	
					else if(n ==9) {
						ResultSet rs = st.executeQuery("select * from buyer where id ="+n);
						while(rs.next()) {
							System.out.println(rs.getString("brand")+  " "+rs.getString("model")+ " "+rs.getInt("reg")+  " "+rs.getString("fuel")+  " "+rs.getInt("kmdriven")+  " "+rs.getString("transmission")+  " "+rs.getInt("ownership")+  " "+rs.getString("insurancevalid")+  " "+rs.getString("location"));
				System.out.println("YOUR VEHICLE AMOUNT IS 1200000");
				}}	
			System.out.println("<<<<<<<<------------------------->>>>>>>>");
			System.out.println(" IF YOU LIKE TO PURCHASE ANY CAR ");
			System.out.println("<<<<<<<<------------------------->>>>>>>>");
			System.out.println("GO WITH CASH OR EMI");
			sc.nextLine();
			String pur = sc.nextLine();
			if(pur.equals("CASH")) {
				
				System.out.println("CONGRATULATION THIS VEHICLE IS YOUR\n THANK YOU");
				st.executeUpdate("delete from buyer where id =" +n);
			}
			else if (pur.equals("EMI")){
				System.out.println("<<<<<<<<------------------------->>>>>>>>");
				System.out.println("ENTER YOUR ADHAR NUMBER");
				long ano = sc.nextLong();
				System.out.println("<<<<<<<<------------------------->>>>>>>>");
				System.out.println("ENTER A PAN NUMBER");
sc.nextLine();

	
String pan = sc.nextLine();
int otp = (int)(Math.random()*100);
otp = 700+otp;
System.out.println(+otp+" YOUR CIBIL SCORE");
System.out.println();
				if(otp>750) {
					System.out.println("<<<<<<<<------------------------->>>>>>>>");
					System.out.println("YOU ARE ELIGIBLE FOR FINANCE");
					System.out.println("<<<<<<<<------------------------->>>>>>>>");
					System.out.println("YOU GET THE LOAN AT 12% ");
					System.out.println("<<<<<<<<------------------------->>>>>>>>");
					System.out.println("ENTER AMOUNT FOR LOAN");
					System.out.println("<<<<<<<<------------------------->>>>>>>>");
			int loan = sc.nextInt();
			int loanamt = loan*12/100;
			System.out.println("INTEREST PER YEAR ==> "+loanamt);
			System.out.println("<<<<<<<<------------------------->>>>>>>>");
			System.out.println("ENTER A YEAR FOR REPAY EMI ");
			int amt= loan+loanamt;
			int t = sc.nextInt();
			int lamt = amt/(t*12);
			System.out.println("<<<<<<<<------------------------->>>>>>>>");
			System.out.println("EMI PER MONTH ==> "+lamt);
			System.out.println("<<<<<<<<------------------------->>>>>>>>");
			System.out.println("THIS VEHCILE IS YOUR");
			System.out.println();
			System.out.println("CONRATULATIONS\n!!!! VISIT AGAIN !!!!");
			//st.executeUpdate("delete from buyer where id =" +n);
			
			
				}
				else if(otp<750) {
					System.out.println("you are not eligible for finance because your cibil score is less than 750");
					
				}
				
			}
			
			
			
			
		}
	}


