<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/1
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增店铺</title>
</head>
<body>
<form method=post" action="insert">
    <input name="name" placeholder="店铺名称"/>
    <input type="submit" value="提交"/>
</form>

<hr/>
<span>新增订单</span>
<form method=post" action="insertOrder">
    <input name="name" placeholder="商品名称"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
