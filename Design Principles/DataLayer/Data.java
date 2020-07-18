package DataLayer;


import java.sql.*;
public class Data {

	public void data1(int a,int b,int c,String s) {


		try {


			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");


			Connection con=DriverManager.getConnection("jdbc:Ucanaccess://c:\\lasya\\Calculator.accdb");
			Statement st=con.createStatement();

			int i=st.executeUpdate("insert into calculator values(a,b,c,s)");

			if(i!=0)
			{
				System.out.println("Record inserted");
			}
			else
			{
				System.out.println("Record  not inserted");

			}
		}
		catch(Exception e) {
			e.printStackTrace();

		}
	}


}

