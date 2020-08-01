<%@page import="entity.*"  import="dao.LoginDao"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@page %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
			<%
				String name = request.getParameter("name");
				String passwd = request.getParameter("passwd");
				
				
				Login login = new Login(name,passwd);

				LoginDao ao =  new LoginDao();
				int i = ao.login(login);

				if(i>0){
					out.print("输入成功！！！");
				}else if(i == 0){
					out.print("输入错误");
					
				}
				else{
					out.print("异常");
					
				}
			%>
      

    
</body>
</html>