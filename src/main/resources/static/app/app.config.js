angular.module('productosJM').config(function($routeProvider) {
    $routeProvider
        .when('/categories', {
            templateUrl: 'app/views/category.html',
            controller: 'CategoryController'
        })
        .when('/products', {
            templateUrl: 'app/views/product.html',
            controller: 'ProductController'
        })
        .when('/roles', {
            templateUrl: 'app/views/rol.html',
            controller: 'RolController'
        })
        .when('/users', {
            templateUrl: 'app/views/user.html',
            controller: 'UserController'
        })
        .otherwise({
            redirectTo: '/'
        });
});
