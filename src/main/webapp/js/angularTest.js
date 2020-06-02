var app = angular.module("myApp",[]);
    app.controller('carController',function ($scope,$http) {
        $scope.submitForm = function () {
        	alert(3);
           console.log($scope.car);
        }
    });
