angular.module('productosJM').controller('UserController', function($scope, UserService) {
    $scope.users = [];

    $scope.loadUsers = function() {
        UserService.getUsers().then(function(response) {
            $scope.users = response.data;
        });
    };

    $scope.createUser = function(user) {
        UserService.createUser(user).then(function() {
            $scope.loadUsers();
        });
    };

    $scope.updateUser = function(id, user) {
        UserService.updateUser(id, user).then(function() {
            $scope.loadUsers();
        });
    };

    $scope.deleteUser = function(id) {
        UserService.deleteUser(id).then(function() {
            $scope.loadUsers();
        });
    };

    $scope.loadUsers();
});rol.controller.js