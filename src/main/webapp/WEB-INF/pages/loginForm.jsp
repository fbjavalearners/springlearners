<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
    .error {
        color: red; font-weight: bold;
    }
</style>
 <script>
            function trim(str, chars) {

             return ltrim(rtrim(str, chars), chars);
         }

            function ltrim(str, chars) {

            chars = chars || "\\s";

            return str.replace(new RegExp("^[" + chars + "]+", "g"), "");
         }
         function rtrim(str, chars) {
                chars = chars || "\\s";
                return str.replace(new RegExp("[" + chars + "]+$", "g"), "");
            }
            function validateLoginForm() {
                //alert('entered');
            	var email = $("#email").val();
                var password = $("#password").val();
                alert('email '+email+' '+password);
                
                if (trim(email)==""){
                    alert("Please enter Email ");
                    return false;
                }else if(trim(password)==""){
                    alert("Please enter password ");
                    return false;
                }

            }
        </script>
</head>

<body>

    <font color="red">${message}</font>
		<table>
		<form:form id="loginForm" method="post" action="login" modelAttribute="loginForm" onSubmit="return validateLoginForm()">
           <tr>
              <td colspan="3" align="center">SpringLearnes App</td>
           </tr>
           
           <tr>
            <td>
			<form:label path="email">Email</form:label>
			</td>
			<td>
			<form:input id="email" name="email" path="" />
			</td>
			<td align="left"><form:errors path="email" cssClass="error"/></td>
			</tr>
			<tr>
			<td><form:label path="password">Password</form:label></td>
			<td><form:password id="password" name="password" path="" /></td>
			<td><form:errors path="password" cssClass="error"/></td>
			</tr>
			<tr>
			 <td colspan="3" align="center"> <input type="submit" value="Login" /></td>
			</tr>
			
			
			
		</form:form>
</table>



</body>
</html>