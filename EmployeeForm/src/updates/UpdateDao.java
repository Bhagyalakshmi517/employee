package updates;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import com.opensymphony.xwork2.ActionSupport;

public class UpdateDao extends ActionSupport {
	public static int update(Updates rc)
	{
		int status=0;
		try{
			
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/system", "postgres","bhagya");
			//Statement st=con.createStatement();
			 String s = "update employee set name=?,address=?,bdate=?,age=?,gender=?,dept=?,hdate=?,cno=?,position=? where name=?";
			PreparedStatement ps=con.prepareStatement(s);
			ps.setString(1, rc.getName());
			ps.setString(2, rc.getAddress());
		    ps.setDate(3, rc.getBdate());
			ps.setString(5, rc.getGender());
			ps.setString(6, rc.getDept());
			ps.setDate(7, rc.getHdate());
			ps.setString(8, rc.getCno());
			ps.setString(9, rc.getPosition());
			ps.setInt(4, Integer.parseInt(rc.getAge()));
			ps.setString(10, rc.getName());
			status=ps.executeUpdate();
			//ps.setDate(6, new java.sql.Date(affiliate.getDate().getTime()));
			System.out.println(rc.getHdate());
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
}
