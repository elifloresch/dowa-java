<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title></title>
    </head>
    <body>

        Hi There!!<%= request.getParameter("name") %> <br/>
        This value was set in the servlet:  <%= request.getAttribute("fakeName") %>
        <br/>
        Session Data:  <%= request.getAttribute("sessionData") %>
        <a href="${pageContext.response.encodeRedirectURL('Hello2.jsp')}">Home2</a>
        <%--<a href="logout">Logout</a>--%>
    </body>
</html>
