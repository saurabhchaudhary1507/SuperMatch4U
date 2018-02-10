var mainApp = angular.module("mainApp", ['ngRoute','ui.grid']);

mainApp.config(function($routeProvider) {
	$routeProvider
		.when('/home', {
			templateUrl: 'home.html',
			controller: 'StudentController'
		})
		.when('/viewStudents', {
			templateUrl: 'viewStudent.html',
			controller: 'StudentController'
		}).when('/users', {
			templateUrl: 'users.html',
			controller: 'userController'
		})
		.otherwise({
			redirectTo: '/home'
		});
});

mainApp.controller('StudentController', function($scope) {
	$scope.students = [
		{name: 'Mark Waugh', city:'New York'},
		{name: 'Steve Jonathan', city:'London'},
		{name: 'John Marcus', city:'Paris'}
	];

	$scope.message = "Click on the hyper link to view the students list.";
});

mainApp.controller('userController', function($scope,$http) {

	console.log('called');
	$scope.gridOptions = {
	        excludeProperties: '__metadata',
	    };
	$scope.persons='';
	$http.get('rest/person/users').success(function(response){
		console.log(response);
		$scope.gridOptions.data = response;
	});
});