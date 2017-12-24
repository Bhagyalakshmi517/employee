package delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteForm extends ActionSupport{
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String execute()
	{ 
		try{
			Class.forName("org.postgresql.Driver");
		    java.sql.Connection con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/system", "postgres","bhagya");
		    PreparedStatement ps=null;
			//int rowCount=st.executeUpdate("delete employee where ename='bhagya'");
		    ps=con.prepareStatement("delete from employee where NAME=(?)");
		    ps.setString(1,getName());        
	       int result= ps.executeUpdate();
			System.out.println("no of rocord deleted:"+result);
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
	return "success";

}
}
