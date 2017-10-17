<%@ page import="test.ti" %>
<%@ page import="model.queryShow" %><%--
  Created by IntelliJ IDEA.
  User: wangxiuqiang
  Date: 17-10-15
  Time: 上午10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示</title>
</head>
<body>
     <%
         queryShow queryShow = (queryShow)request.getAttribute("queryShow");
     %>

<%=queryShow.getTitle()%>
<hr/>
<%=queryShow.getMajorActor()%>
<hr/>
<%=queryShow.getVideoUrl()%>
<hr/>
<%=queryShow.getContent()%>
</body>
</html>
