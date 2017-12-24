package com;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;


public class RegisterActionDaopg {
	public static int save(RegisterAction rc)
	{
		System.out.println("age::"+rc.getAge());
		int status=0;
		try{
			//System.out.println("age::"+rc.getAge());
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/system", "postgres","bhagya");
			//Statement st=con.createStatement();
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, rc.getName());
			ps.setString(2, rc.getAddress());
		    ps.setDate(3, rc.getBdate());
		    ps.setInt(4, Integer.parseInt(rc.getAge()));
			ps.setString(5, rc.getGender());
			ps.setString(6, rc.getDept());
			ps.setDate(7, rc.getHdate());
			ps.setString(8, rc.getCno());
			ps.setString(9, rc.getPosition());
			
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
