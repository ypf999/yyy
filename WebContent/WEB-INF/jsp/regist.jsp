<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>用户注册</h2>
	<!-- action不指定，form默认提交到当前url 
	modelAttribute用于将表单与controller传递过来的对象进行绑定
	-->
	
	<fm:form method="post" modelAttribute="user">
	<!-- path用于将表单元素与实体类的属性进行关联 -->
	  <p>　用户名：<fm:input path="username"/><fm:errors path="username"></fm:errors></p>
	  <p>　密　码：<fm:password path="password"/><fm:errors path="password"></fm:errors></p>
	  <p>　年　龄：<fm:input path="age"/><fm:errors path="age"></fm:errors></p>
	  <p>　邮　箱：<fm:input path="email"/><fm:errors path="email"></fm:errors></p>
	  <p>　电　话：<fm:input path="phone"/><fm:errors path="phone"></fm:errors></p>
	  <p>入职日期：<fm:input path="hiredate"/><fm:errors path="hiredate"></fm:errors></p>
	  <p><fm:button>注册</fm:button></p>
	</fm:form>
</body>
</html>