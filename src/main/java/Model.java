import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model 
{
	private String name;
	private String email;
	private String city;
	private String password;
	private String phone;
	private Connection connect=null;
	private PreparedStatement pstm=null;
	private int row;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public int register()
	{
		try 
		{
			connect=JDBCUtil.getDBConnection();
			pstm=connect.prepareStatement("INSERT INTO userregistraioninfo (name, city, email, phone_number, password) VALUES(?,?,?,?,?) ");
			pstm.setString(1, name);
			pstm.setString(2, city);
			pstm.setString(3, email);
			pstm.setString(4, phone);
			pstm.setString(5, password);
			
			row = pstm.executeUpdate();
			
			pstm.close();
			connect.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				JDBCUtil.closeConnection(pstm, connect);
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		return row;
	}

}
