var app = angular.module('myApp', []);

app.controller('personFormCtrl', function($scope,$http) {
	 console.log('called');
	 $scope.person = {firstName:'',middleName:'',lastName:''};
	 $scope.submit = function() {
		 console.log('called');
	     console.log($scope.person.firstName);
	     var person = {firstName:$scope.person.firstName,middleName:$scope.person.middleName,lastName:$scope.person.lastName};
		 $http.post('rest/person/saveUserDetails', person).then(function(data){
			 alert('hurray!!');
			 console.log(data);
		 });
	    };
	
    $scope.reset = function() {
        $scope.person.firstName ='' ;
        $scope.person.middleName ='' ;
        $scope.person.lastName ='' ;
    };
   
});

