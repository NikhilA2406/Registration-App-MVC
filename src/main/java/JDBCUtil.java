import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil 
{
	static 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		
		
	}
	public static Connection getDBConnection() throws SQLException 
	{
		//Establish the Connection
		String url="jdbc:mysql://localhost:3306/userregistraioninfo";
		String user="root";
		String password="Nikhil#24";
		return DriverManager.getConnection(url, user, password);
	}
	public static void closeConnection(Statement statement, Connection connect) throws SQLException 
	{
		if(statement!=null)
		statement.close();
		if(connect!=null)
		connect.close();
		
	}

}
