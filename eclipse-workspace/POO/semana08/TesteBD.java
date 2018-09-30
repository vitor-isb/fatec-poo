package semana08;

import java.sql.*;
import java.sql.PreparedStatement;

public class TesteBD {
	public Connection con;
	public PreparedStatement st;
	public ResultSet rs;
	
	private final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	private final String URL = "jdbc:sqlserver://localhost:1433;databaseName=java";
	private final String LOGIN = "sa";
	private final String SENHA = "1234";
	
	public static void main(String[] args) {
		TesteBD tbd = new TesteBD();
		tbd.getConnection();
		// realizo a operação
		tbd.close();
		
		
	}
	/**
	 * realiza a conexão com o banco de dados
	 * @return - true em caso de sucesso ou false caso contrario
	 */
	public boolean getConnection(){
		try{
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL,LOGIN,SENHA);
			System.out.println("Conectou!");
			return true;
			
		}
		catch(ClassNotFoundException erro){
			System.out.println(erro.toString());
			return false;
			
		}
		catch(SQLException erro){
			System.out.println(erro.toString());
			return false;
			
		}
		
	}
	/**
	 * Encerra a conexão ao banco de dados
	 */
	public void close(){
		try{
			if (con!=null) con.close();
			System.out.println("Desconectou!");
		}
		catch(SQLException erro){
		}
		try{if(st!=null)st.close();} catch(SQLException erro){}
		try{if(rs!=null) rs.close();} catch(SQLException erro){}
		
	}

}
