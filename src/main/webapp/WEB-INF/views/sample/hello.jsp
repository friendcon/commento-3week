<%--
  Created by IntelliJ IDEA.
  User: hy
  Date: 2023/03/01
  Time: 7:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>View Test Page</title>
</head>
<body>
<h2>View Name : ${viewname}</h2>
<div>JSP 뿌리기</div>
<c:forEach var="item" items="${list}" varStatus="idx">
    ${idx.index} : ${item} <br />
</c:forEach>
</body>
</html>