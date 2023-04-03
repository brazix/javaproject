import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataBase {
	public Connection connect_to_db(String dbname,String user,String pass) {
		Connection conn = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbname,user,pass);
			if(conn != null) {
				System.out.println("Connection Established");
			}
			else {
				System.out.println("Connection Failed");
			}
		}catch(Exception e) {
			System.out.println("Error: "+e);
		}
		return conn;
	}
	
	public void register1(Connection conn, String table_name, String email, String password) {
		Statement statement;
		try {
			String query = String.format("insert into %s(email_etudiant,password) values('%s','%s');", table_name,email,password);
			statement = conn.createStatement();
			statement.executeUpdate(query);
			System.out.println("\nemail: "+email+"\npassword: "+password);
		
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
