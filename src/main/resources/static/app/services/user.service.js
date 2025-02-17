angular.module('productosJM').service('UserService', function($http) {
    this.getUsers = function() {
        return $http.get('/api/user/getUsers');
    };
    this.createUser = function(user) {
        return $http.post('/api/user/createUser', user);
    };
    this.updateUser = function(id, user) {
        return $http.put('/api/user/updateUser/' + id, user);
    };
    this.deleteUser = function(id) {
        return $http.delete('/api/user/deleteUser/' + id);
    };
});