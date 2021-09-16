<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@page import="java.sql.DriverManager"%>  
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String em = request.getParameter("em");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "insurances";
String userid = "root";
String password = "root";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from insurance";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<table>
<tr>
<td>ID:</td><td><%=resultSet.getString("id") %></td>
</tr>
<tr>
<td>Client Number:</td><td><%=resultSet.getString("cnum") %></td>
</tr>
<tr>
<td>Client type:</td><td><%=resultSet.getString("ctype") %></td>
</tr>
<tr>
<td>DOB:</td><td><%=resultSet.getString("dob") %></td>
</tr>
<tr>
<td>Mob:</td><td><%=resultSet.getString("mob") %></td>
</tr>
<tr>
<td>addess:</td><td> <%=resultSet.getString("address") %></td>
</tr>
<tr>
<td>NAme:</td><td><%=resultSet.getString("names") %></td>
</tr>
<tr>
<td>email:</td><td><%=resultSet.getString("em") %></td>
</tr>
<tr>
<td>city:</td><td><%=resultSet.getString("city") %></td>
</tr>
<tr>
<td>Nation:</td><td><%=resultSet.getString("nation") %></td>
</tr>
<tr>
<td>PAyment Num:</td><td><%=resultSet.getString("payment") %></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>


</table>


</body>
</html>

