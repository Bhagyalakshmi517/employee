<%@ taglib uri="/struts-tags" prefix="s" %>  
<!--   
<h3>All Records:</h3>
<fieldset>
<h3>Name&nbsp&nbsp&nbsp&nbsp&nbspAddress&nbsp&nbsp&nbsp&nbsp&nbspBirthdate&nbsp&nbsp&nbsp&nbsp&nbspAge&nbsp&nbsp&nbsp&nbsp&nbspGender&nbsp&nbsp&nbsp&nbsp&nbspDepartment&nbsp&nbsp&nbsp&nbsp&nbspHiredate&nbsp&nbsp&nbsp&nbsp&nbspContactNo&nbsp&nbsp&nbsp&nbsp&nbspPosition</h3>  
<h2>-----------------------------------------------------------------------------------------------------------</h2><br/>
<s:iterator  value="list">    
<s:property value="name"/>&nbsp&nbsp&nbsp&nbsp&nbsp
<s:property value="address"/>&nbsp&nbsp&nbsp&nbsp&nbsp  
<s:property value="bdate"/>&nbsp&nbsp&nbsp&nbsp&nbsp 
<s:property value="age"/>&nbsp&nbsp&nbsp&nbsp&nbsp 
<s:property value="gender"/>&nbsp&nbsp&nbsp&nbsp&nbsp
<s:property value="dept"/>&nbsp&nbsp&nbsp&nbsp&nbsp
<s:property value="hdate"/>&nbsp&nbsp&nbsp&nbsp&nbsp
<s:property value="cno"/>&nbsp&nbsp&nbsp&nbsp&nbsp
<s:property value="position"/>
<br/>  
 
</s:iterator> 
</fieldset>
<br/>
-->
<center><h1>Display All Records</h1></center>

<table  cellpadding="5px" border="1">
<tr>
<th>Name</th>
<th>Address</th>
<th>Birthdate</th>
<th>Age</th>
<th>Gender</th>
<th>Department</th>
<th>Hiredate</th>
<th>Phone</th>
<th>Position</th>
<!--  <th>Edit</th>
<th>Delete</th>-->
</tr>
<s:iterator  value="list">
<tr>
<td><s:property value="name"/></td>
<td><s:property value="address"/></td>
<td><s:property value="bdate"/></td>
<td><s:property value="age"/></td>
<td><s:property value="gender"/></td>
<td><s:property value="dept"/></td>
<td><s:property value="hdate"/></td>
<td><s:property value="cno"/></td>
<td><s:property value="position"/></td>
<!-- 
<td>
<s:url id="editURL" action="editUser">
<s:param name="id" value="%{id}"></s:param>
</s:url>
<s:a href="%{editURL}">Edit</s:a>
</td>
<td>
<s:url id="deleteURL" action="deleteUser">
<s:param name="id" value="%{id}"></s:param>
</s:url>
<s:a href="%{deleteURL}">Delete</s:a>
</td> -->
</tr>
</s:iterator>
</table>
<a href="index.jsp">click here to go home page</a>



