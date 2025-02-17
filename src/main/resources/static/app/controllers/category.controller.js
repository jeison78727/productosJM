angular.module('productosJM').controller('CategoryController', function($scope, CategoryService) {
    $scope.categories = [];

    $scope.loadCategories = function() {
        CategoryService.getCategories().then(function(response) {
            $scope.categories = response.data;
        });
    };

    $scope.createCategory = function(category) {
        CategoryService.createCategory(category).then(function() {
            $scope.loadCategories();
        });
    };

    $scope.updateCategory = function(id, category) {
        CategoryService.updateCategory(id, category).then(function() {
            $scope.loadCategories();
        });
    };

    $scope.deleteCategory = function(id) {
        CategoryService.deleteCategory(id).then(function() {
            $scope.loadCategories();
        });
    };

    $scope.loadCategories();
});rol.controller.js