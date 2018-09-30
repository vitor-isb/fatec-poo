package semana08;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class BD {
	
	public Connection con;
	public PreparedStatement st;
	public ResultSet rs;
	
	private final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";/*Varia de banco*/
	private final String BANCO = "brasil";
	private final String URL = "jdbc:sqlserver://localhost:1433;databaseName="+BANCO;
	private final String LOGIN = "sa";
	private final String SENHA = "Sql@2018";
	
	public boolean getConnection() {
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, LOGIN, SENHA);
			System.out.println("Conectou!");
			return true;
		}catch (ClassNotFoundException e) {
			System.out.println(e.toString());
			return false;
		}
		catch(SQLException e ) {
			System.out.println(e.toString());
			return false;
		}
		
	}
	
	public void close() {
		try {
			if(rs!=null)
				rs.close();
		}catch(SQLException e) {
			
		}
		try {
			if(st!=null)
				st.close();
		}catch(SQLException e) {
			
		}
		try {
			con.close();
			System.out.println("Desconectou");
		}
		catch (SQLException e) {
			
		}
		
	}
	
	public static void main(String[] args) {
		BD bd = new BD();
		bd.getConnection();
		bd.close();
	}

}
