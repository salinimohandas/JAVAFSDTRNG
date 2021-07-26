var app = angular.module('myApp',["ngRoute"])

app.config(function($routeProvider){
	$routeProvider.when("/one",{
		templateUrl: "one.html"
	}).when("/two",{
		templateUrl: "two.html"
	})
})