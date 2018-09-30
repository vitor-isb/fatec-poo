package semana08;

import java.sql.SQLException;

public class ConsultarCidades {

	public static void main(String[] args) {
		BD bd = new BD();
		bd.getConnection();
	
		
		try {
			String sql = "select * from cidade";
			bd.st = bd.con.prepareStatement(sql);
			bd.rs = bd.st.executeQuery();
			
			while(bd.rs.next()) {
				System.out.println(bd.rs.getString(1)+","+bd.rs.getString(2)+","+bd.rs.getString(3));
			}
		}catch (SQLException e) {	
		}
		finally {
			bd.close();
		}

	}

}
