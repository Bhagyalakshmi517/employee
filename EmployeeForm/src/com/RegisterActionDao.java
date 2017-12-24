package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RegisterActionDao {
	public static int save(RegisterAction rc)
	{
		int status=0;
		try{
			//System.out.println("getHdate::::"+rc.getHdate());
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			//Statement st=con.createStatement();
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, rc.getName());
			ps.setString(2, rc.getAddress());
		    ps.setDate(3, rc.getBdate());
			//ps.setCalendar(3, (java.sql.Date) new Calendar(rc.getBdate().getTimeInMillis()));
			
			ps.setString(4, rc.getGender());
			ps.setString(5, rc.getDept());
			ps.setDate(6, rc.getHdate());
			
			ps.setString(7, rc.getCno());
			ps.setString(8, rc.getPosition());
			ps.setString(9,rc.getAge());
			status=ps.executeUpdate();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}

}
