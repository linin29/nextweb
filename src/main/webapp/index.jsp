<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<!-- data-main attribute tells require.js to load scripts/main.js after require.js loads. -->
<script data-main="<c:url value="/resources/js/require/main"/>" src="<c:url value="/resources/js/require/require.js"/>"></script>
<!-- <script src="//cdn.bootcss.com/angular.js/1.5.8/angular.min.js"></script> -->
</head>
<body>
	<!-- <div ng-app="myApp">
		<p>
			名字 : <input type="text" ng-model="name">
		</p>
		<h1>Hello {{name}}</h1>
	</div> -->
	<div ng-app="myApp" ng-controller="myCtrl">
		ming:<input type="text" ng-model="firstName"><br>
		xing:<input type="text" ng-model="lastName"><br>
		index:<input type="text" ng-model="index.size"><br>
	</div>
<!-- 	<script type="text/javascript">
		var app = angular.module('myApp', []);
		app.controller('myCtrl', function($scope) {
			$scope.firstName = "ning";
			$scope.lastName = "li";
		});
	</script> -->
</body>
</html>
