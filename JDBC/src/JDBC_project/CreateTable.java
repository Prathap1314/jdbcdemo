package JDBC_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateTable {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			System.out.println("JDBC");
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/num";
			String username= "root";
			String password = 
			
			Connection connection  = DriverManager.getConnection(url,username,password);
			System.out.println(connection+"connection success");
			//creating statement
			java.sql.Statement stat = connection.createStatement();
			//executing sql statement
			stat.execute("create table student(id int, name varchar(20))");
			System.out.println("success");

}
}
