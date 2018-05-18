	mainModule.controller('kontaktController',[ '$scope','$http', function($scope,$http) {
		$scope.message = 'KontaKt us! JK. This is just a demo.';
		
		
		
	    $scope.pretragaPrestupnici = function () {
	        $http.get('localhost:9994/findall')
	        .success(function (data) {
	            console.log(data)
	        })
	    }
	    $scope.pretragaPrestupnici();
	}]);
	
	//mainModule.controller('homePretragaController', ['$scope', '$http', '$log', function ($scope, $http, $log, ngAuthSettings) {
