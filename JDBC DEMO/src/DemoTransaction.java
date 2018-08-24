import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Connection con=null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CITI","sa","sa123");
			con.setAutoCommit(false);
			System.out.println("connection successfull"); 
			
			Statement st=con.createStatement();
			st.executeUpdate("insert into employee1 values(910,'citi',10000)");
			st.executeUpdate("insert into employee1 values(920,'citi',10000)");
			st.executeUpdate("insert into employee1 values(1,'citi',10000)");
			st.executeUpdate("insert into employee1 values(940,'citi',10000)");
			
			con.commit();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
				try {
					con.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			e.printStackTrace();
		}
		
		
			}

}
