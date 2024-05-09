package com.kodnest.sol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankInsert {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			System.out.println("JDBC");
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/bnk";
			String username= "root";
			String password = "Bindu@1314";
			
			
			//executing the sql statement
			String sql1 ="Insert into bank values(1,'john',10000)";
			String sql2 ="Insert into bank values(2,'jack',20000)";
			String sql3 ="Insert into bank values(3,'Ria',30000)";
			String sql4 ="Insert into bank values(4,'Ryan',40000)";
			String sql5 ="Insert into bank values(5,'Anish',50000)";
			// Establishing connection
			Connection connection  = DriverManager.getConnection(url,username,password);
			//creating the statement
			Statement st =connection.createStatement();
			st.addBatch(sql1);
			st.addBatch(sql2);
			st.addBatch(sql3);
			st.addBatch(sql4);
			st.addBatch(sql5);
			st.executeBatch();
			
			System.out.println("success");
			
			
			
		}

}
