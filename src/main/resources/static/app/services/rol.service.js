angular.module('productosJM').service('RolService', function($http) {
    this.getRoles = function() {
        return $http.get('/api/rol/getRoles');
    };
    this.createRol = function(rol) {
        return $http.post('/api/rol/createRol', rol);
    };
    this.updateRol = function(id, rol) {
        return $http.put('/api/rol/updateRol/' + id, rol);
    };
    this.deleteRol = function(id) {
        return $http.delete('/api/rol/deleteRol/' + id);
    };
});