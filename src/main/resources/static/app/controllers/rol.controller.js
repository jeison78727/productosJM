angular.module('productosJM').controller('RolController', function($scope, RolService) {
    $scope.roles = [];

    $scope.loadRoles = function() {
        RolService.getRoles().then(function(response) {
            $scope.roles = response.data;
        });
    };

    $scope.createRol = function(rol) {
        RolService.createRol(rol).then(function() {
            $scope.loadRoles();
        });
    };

    $scope.updateRol = function(id, rol) {
        RolService.updateRol(id, rol).then(function() {
            $scope.loadRoles();
        });
    };

    $scope.deleteRol = function(id) {
        RolService.deleteRol(id).then(function() {
            $scope.loadRoles();
        });
    };

    $scope.loadRoles();
});rol.controller.js