package updates;

import java.sql.Date;

import com.opensymphony.xwork2.ActionSupport;

public class Updates extends ActionSupport {
private String name,position,cno,age,gender,address,dept;
	
	private Date hdate,bdate;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Date getHdate() {
		return hdate;
	}
	public void setHdate(Date hdate) {
		this.hdate = hdate;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	

	public String execute() 
	{
		int i=UpdateDao.update(this);
		if(i>0)
		{
			return "success";
		}
		else
		{
			return "error";
		}
	}
}
