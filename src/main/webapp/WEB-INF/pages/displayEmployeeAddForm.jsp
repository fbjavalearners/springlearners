<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="http://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css" rel="stylesheet">
      <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
      <script src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
       <script>
         $(function() {
            $( "#hireDate" ).datepicker();
            //$( "#hireDate" ).datepicker("show");
         });
      </script>
<title>Insert title here</title>
</head>
<body>
<form:form method="POST"  modelAttribute="empaddform" action="addEmployee">
   <table>
    <tr>
        <td><form:label path="employeeId">Employee Id</form:label></td>
        <td><form:input path="employeeId" /></td>
    </tr>
    <tr>
        <td><form:label path="fName">First Name</form:label></td>
        <td><form:input path="fName" /></td>
    </tr>
    <tr>
        <td><form:label path="lName">Last Name</form:label></td>
        <td><form:input path="lName" /></td>
    </tr>
     <tr>
        <td><form:label path="email">Email</form:label></td>
        <td><form:input path="email" /></td>
    </tr>
    <tr>
        <td><form:label path="phoneNumber">Phone Number</form:label></td>
        <td><form:input path="phoneNumber" /></td>
    </tr>
    <tr>
        <td><form:label path="hireDate">Hire Date</form:label></td>
        <td><form:input path="hireDate" /></td>
    </tr>
     <tr>
        <td>Job Title</td>
        <td><form:select path="jobId" items="${empaddform.jobTitList}"  itemLabel="jobTitle" itemValue="jobId" multiple="false"/></td>
    </tr>
    <tr>
        <td><form:label path="salary">Salary</form:label></td>
        <td><form:input path="salary" /></td>
    </tr>
     <tr>
        <td><form:label path="commissionPct">Commission Pct</form:label></td>
        <td><form:input path="commissionPct" /></td>
    </tr>
     <tr>
        <td><form:label path="mgrId">Manager Id</form:label></td>
        <td><form:input path="mgrId" /></td>
    </tr>
    <tr>
        <td><form:label path="depId">Department Id</form:label></td>
        <td><form:select path="depId" items="${empaddform.deptList}"  itemLabel="departmentName" itemValue="departmentId"/></td>
    </tr>
    <tr>
        <td><form:label path="password">Password</form:label></td>
        <td><form:input path="password" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>

</body>
</html>