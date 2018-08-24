
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CITI","sa","sa123");
			System.out.println("connection successfull"); 
			
			String INSERT_BOOK="insert into Book values('121','chacha chaudhary','diamond','saabu')";
			Statement st=con.createStatement();
			int rows=st.executeUpdate(INSERT_BOOK);
			System.out.println("rows inserted:"+rows);
			
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}

}
