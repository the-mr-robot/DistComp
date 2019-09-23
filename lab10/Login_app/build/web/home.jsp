<%-- 
    Document   : home
    Created on : Aug 27, 2019, 9:29:27 PM
    Author     : AHSAN ARAIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Retrieving Cookie from browser</h1>
<br>
<%
   Cookie[] cks=request.getCookies();
   for(Cookie ck:cks)
   {
      String cn=ck.getName();
      String cv=ck.getValue();
      
      %>
      Cookie name : <b><%=cn %> </b><br>
      Cookie Value : <b><%=cv %> </b><br>
      <%
   }
%>
    </body>
</html>
