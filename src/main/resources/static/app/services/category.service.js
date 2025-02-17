angular.module('productosJM').service('CategoryService', function($http) {
    this.getCategories = function() {
        return $http.get('/api/category/getCategories');
    };
    this.createCategory = function(category) {
        return $http.post('/api/category/createCategory', category);
    };
    this.updateCategory = function(id, category) {
        return $http.put('/api/category/updateCategory/' + id, category);
    };
    this.deleteCategory = function(id) {
        return $http.delete('/api/category/deleteCategory/' + id);
    };
});