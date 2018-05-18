	var mainModule = angular.module('mainModule', ['ngRoute']);

	
	
	mainModule.config(function($routeProvider) {
		$routeProvider

			.when('/', {
				templateUrl : 'vijesti.html',
				controller  : 'vijestiController'
			})

			.when('/nesto', {
				templateUrl : 'nesto.html',
				controller  : 'nestoController'
			})

			.when('/proba', {
				templateUrl : 'proba.html',
				controller  : 'probaController'
			})
			
			.when('/kontakt', {
				templateUrl : 'kontakt.html',
				controller  : 'kontaktController'
			});
	});


