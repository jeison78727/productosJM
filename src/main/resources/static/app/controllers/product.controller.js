angular.module('productosJM').controller('ProductController', function($scope, ProductService) {
    $scope.products = [];

    $scope.loadProducts = function() {
        ProductService.getProducts().then(function(response) {
            $scope.products = response.data;
        });
    };

    $scope.createProduct = function(product) {
        ProductService.createProduct(product).then(function() {
            $scope.loadProducts();
        });
    };

    $scope.updateProduct = function(id, product) {
        ProductService.updateProduct(id, product).then(function() {
            $scope.loadProducts();
        });
    };

    $scope.deleteProduct = function(id) {
        ProductService.deleteProduct(id).then(function() {
            $scope.loadProducts();
        });
    };

    $scope.loadProducts();
});rol.controller.js