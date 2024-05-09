package JDBC_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost/num";
		String username= "root";
		String password = "Bindu@1314";
		
		Connection connection  = DriverManager.getConnection(url,username,password);
		System.out.println(connection+"connection success");
		//creating statement
		java.sql.Statement stat = connection.createStatement();
		//executing sql statement
		String str = "insert into student values(1,'prathap')";
		stat.execute(str);
		System.out.println("success");

}
}
