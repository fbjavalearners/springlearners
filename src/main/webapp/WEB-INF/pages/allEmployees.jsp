<%@page import="java.util.List" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>Spring MVC and List Example</h2>
<%
    List empList = (List)request.getAttribute("empList");
    out.println("empList "+empList.size());

%>
	
	
			<c:forEach var="listValue" items="${empList}">
				<li><c:out value="${listValue.lastName}"/></li>
			</c:forEach>
	

	
</body>
</html>