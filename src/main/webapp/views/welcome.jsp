<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="model.UserBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	

   <% 
   
   if (session.getAttribute("userBean") == null) {
        
        response.sendRedirect("index.jsp");
        
    } else {
      	UserBean UserBean =(UserBean) session.getAttribute("userBean");
        out.print("<h1>Welcome " + UserBean.getUserName()+ "");
        out.print("<form action=\"" + request.getContextPath() + "/logoutServlet\" method=\"POST\">");
        out.print("<input type=\"submit\" value=\"Logout\" />");
        out.print("</form>");

    }
    %> 
 
</body>
</html>