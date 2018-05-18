angular.module('AddressBook')
// Creating the Angular Controller
.controller('AddressController', function($http, $scope, AuthService) {
	var edit = false;
	$scope.buttonText = 'Create';
	var init = function() {
		$http.get('http://localhost:9992/api/address').success(function(res) {
			console.log('novosti',res)
			$scope.addressList = res;
			
			//foreach(e in res)
				//console.log('dzenki',res.length)
				$scope.newsListNWT=[];
				$scope.newsListWT=[];
				$scope.newsListRMA=[];
				for( i=0;i<res.length;i++){
					if($cope.collumn=='NWT'){
						$http.get('http://localhost:9991/api/nwt/collumn/address/1').success(function(res){
							$scope.newsListNWT=res;
						}
					}
					else if($cope.collumn=='WT'){
							$http.get('http://localhost:9991/api/nwt/collumn/address/2').success(function(res){
							$scope.newsListWT=res;
						}
					}
					else if($cope.collumn=='RMA'){
							$http.get('http://localhost:9991/api/nwt/collumn/address/3').success(function(res){
							$scope.newsListRMA=res;
						}
					}				
				}
				console.log('1',$scope.newsListNWT);
				console.log('2',$scope.newsListWT);
				console.log('3',$scope.newsListRMA);
					
			
			
			$scope.addressForm.$setPristine();
			$scope.address = null;
			$scope.buttonText = 'Kreiraj';
			
		}).error(function(error) {
			$scope.message = error.message;
		});
	};
	$scope.initEdit = function(address) {
		edit = true;
		$scope.address = address;
		$scope.message='';
		$scope.deleteMessage='';
		$scope.buttonText = 'Edituj';
	};
	$scope.initAddAddress = function() {
		edit = false;
		$scope.address = null;
		$scope.addressForm.$setPristine();
		$scope.message='';
		$scope.deleteMessage='';
		$scope.buttonText = 'Create';
	};
	$scope.deleteAddress = function(address) {
		$http.delete('http://localhost:9992/api/address'+address.id).success(function(res) {
			$scope.deleteMessage ="Uspješno!";
			init();
		}).error(function(error) {
			$scope.deleteMessage = error.message;
		});
	};
	var editAddress = function(){
		$http.put('http://localhost:9992/api/address', $scope.address).success(function(res) {
			$scope.address = null;
			$scope.confirmPassword = null;
			$scope.addressForm.$setPristine();
			$scope.message = "Uspješno editovano";
			init();
		}).error(function(error) {
			$scope.message =error.message;
		});
	};
	var addAddress = function(){
		$http.post('http://localhost:9992/api/address', $scope.address).success(function(res) {
			$scope.address = null;
			$scope.confirmPassword = null;
			$scope.addressForm.$setPristine();
			$scope.message = " Kreirana";
			init();
		}).error(function(error) {
			$scope.message = error.message;
		});
	};
	$scope.submit = function() {
		if(edit){
			editAddress();
		}else{
			addAddress();	
		}
	};
	init();
});
