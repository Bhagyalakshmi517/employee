package update;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;


public class UpdateForm extends ActionSupport {
	
	ArrayList<User> list=new ArrayList<User>(); 
	
	public ArrayList<User> getList() {
		return list;
	}

	public void setList(ArrayList<User> list) {
		this.list = list;
	}
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String execute(){
		try{
			Class.forName("org.postgresql.Driver");
		    java.sql.Connection con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/system", "postgres","bhagya");
		    PreparedStatement ps=null;
		    ps=con.prepareStatement("select * from employee where name=(?)");
		    ps.setString(1,getName()); 
		    ResultSet rs = ps.executeQuery();
		    while(rs.next()){ 
				  User user=new User();  
				  user.setName(rs.getString(1));  
				  user.setAddress(rs.getString(2));
				  user.setBdate(rs.getDate(3));
				  user.setGender(rs.getString(5));
				  user.setDept(rs.getString(6));
				  user.setHdate(rs.getDate(7));
				  user.setCno(rs.getString(8));
				  user.setPosition(rs.getString(9));
				  user.setAge(rs.getString(4));
				  
				   list.add(user);
		    
		}
		}
		  catch(Exception e)
	{
		e.printStackTrace();
	}
	
	return "success";
	}
}
