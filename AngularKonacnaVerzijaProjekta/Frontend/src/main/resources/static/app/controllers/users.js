angular.module('AddressBook')
// Creating the Angular Controller
.controller('UsersController', function($http, $scope, AuthService) {
	console.log('UsersController')
	var edit = false;
	$scope.buttonText = 'Create';
	var init = function() {
		$http.get('http://localhost:9994/api/users').success(function(res) {
			$scope.users = res;
			console.log('$scope.users',$scope.users)
			$scope.userForm.$setPristine();
			$scope.message='';
			$scope.appUser = null;
			$scope.buttonText = 'Kreiraj';
			
		}).error(function(error) {
			$scope.message = error.message;
		});
	};
	$scope.initEdit = function(appUser) {
		edit = true;
		$scope.appUser = appUser;
		$scope.message='';
		$scope.buttonText = 'Update';
	};
	$scope.initAddUser = function() {
		edit = false;
		$scope.appUser = null;
		$scope.userForm.$setPristine();
		$scope.message='';
		$scope.buttonText = 'Kreiraj';
	};
	$scope.deleteUser = function(appUser) {
		$http.delete('http://localhost:9994/api/users/'+appUser.id).success(function(res) {
			$scope.deleteMessage ="Uspješno!";
			init();
		}).error(function(error) {
			$scope.deleteMessage = error.message;
		});
	};
	var editUser = function(){
		$http.put('http://localhost:9994/api/users', $scope.appUser).success(function(res) {
			$scope.appUser = null;
			$scope.confirmPassword = null;
			$scope.userForm.$setPristine();
			$scope.message = "Uspješno izmjenjeno";
			init();
		}).error(function(error) {
			$scope.message =error.message;
		});
	};
	var addUser = function(){
		$http.post('http://localhost:9994/api/users', $scope.appUser).success(function(res) {
			$scope.appUser = null;
			$scope.confirmPassword = null;
			$scope.userForm.$setPristine();
			$scope.message = "Korisnik kreiran";
			init();
		}).error(function(error) {
			$scope.message = error.message;
		});
	};
	$scope.submit = function() {
		if(edit){
			editUser();
		}else{
			addUser();	
		}
	};
	init();

});
