package semana08;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class FiltrarCidades {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Nome?");
		BD bd = new BD();
		bd.getConnection();	
		try {
			String sql = "select * from cidade where nome like ?";
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, s+"%");
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
