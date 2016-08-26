/**
 * index.js
 */
define(["./index"], function(index) {
	var _this = {};
	_this.init = function() {
		return {name:index.init().color};
	}
	return _this;
});