<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<script data-main="<c:url value="/resources/js/require/main"/>" src="<c:url value="/resources/js/require/require.js"/>"></script>
</head>
<body>
	<div ng-app="myApp" ng-controller="myCtrl">
		ming:<input type="text" ng-model="firstName"><br>
		xing:<input type="text" ng-model="lastName"><br>
		index:<input type="text" ng-model="index.size"><br>
	</div>
	<div>
	<span id="span_text"></span>
	</div>
</body>
</html>