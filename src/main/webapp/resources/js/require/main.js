//获取项目目录
function getRootPath() {
	// 获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp
	var curWwwPath = window.document.location.href;
	// 获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
	var pathName = window.document.location.pathname;
	var pos = curWwwPath.indexOf(pathName);
	// 获取主机地址，如： http://localhost:8083
	var localhostPaht = curWwwPath.substring(0, pos);
	// 获取带"/"的项目名，如：/uimcardprj
	var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
	return (localhostPaht + projectName);
}
//require配置
requirejs.config({
	//By default load any module IDs from js/lib
	baseUrl : getRootPath() + '/resources/js',
	//except, if the module ID starts with "app",
	//load it from the js/app directory. paths
	//config is relative to the baseUrl, and
	//never includes a ".js" extension since
	//the paths config could be for a directory.
	paths : {
		"index" : 'index/index',
		"angular" : "//cdn.bootcss.com/angular.js/1.5.8/angular.min",
		"user_index" : "user/index",
		"jquery" : "//cdn.bootcss.com/jquery/3.1.0/jquery.min"
	},
	shim : {
		"angular":{
            exports:"angular"
        },
	}
});
// Start the main app logic.
requirejs([ 'jquery', 'index', 'angular' , 'user_index'], function($, index, angular, userIndex) {
	//jQuery, canvas and the app/sub module are all
	//loaded and can be used here now.
	//alert(index.color);
	var app = angular.module('myApp', []);
	app.controller('myCtrl', function($scope) {
		$scope.firstName = "nin试试g";
		$scope.lastName = "li";
		$scope.index = index;
	});
	$("#span_text").html(userIndex.init().name);
});