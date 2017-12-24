<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Updation Form</title>
<sj:head/>
<sx:head/>
<style type="text/css" >
.errorMessage{color:red;}
</style>

</head>
<body>

<h3 align="center">Edit Registration Form</h3><br/>
<center>
<s:actionerror/>
<s:form action="updates">
<s:iterator  value="list"> 
<s:textfield name="name" label="Name" />
<s:textfield name="address" label="Address" /> 
<sj:datepicker id="bdate" name="bdate" label="Birthdate" value="%{new java.util.Date()}" timepicker="true" />
<%--<s:textfield name="bdate" label="Birthdate" value='<s:property value="bdate"/>'/>--%>
<%--<sx:datetimepicker name="bdate" label="Birthdate" displayFormat="MM/dd/yy"/>--%>
<s:textfield name="age" label="Age" />
<s:radio name="gender" list="{'Female','Male'}" label="Gender"/>
<s:textfield name="dept" label="Dept"  />
<sj:datepicker id="hdate" label="Hiredate" name="hdate" value="%{new java.util.Date()}" timepicker="true" />
<%--<s:textfield name="hdate" label="Hiredate" value='<s:property value="hdate"/>' />--%>
<%--<sx:datetimepicker name="hdate" label="HireDate" displayFormat="MM/dd/yy"/>--%>
<s:textfield name="cno" label="Contact No"/>
<s:textfield name="position" label="Position" />
<s:submit value="Edit"/>
</s:iterator>
</s:form> 
</center>
</body>


</html>
   