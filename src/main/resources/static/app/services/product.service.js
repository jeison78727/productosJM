angular.module('productosJM').service('ProductService', function($http) {
    this.getProducts = function() {
        return $http.get('/api/product/getProducts');
    };
    this.createProduct = function(product) {
        return $http.post('/api/product/createProduct', product);
    };
    this.updateProduct = function(id, product) {
        return $http.put('/api/product/updateProduct/' + id, product);
    };
    this.deleteProduct = function(id) {
        return $http.delete('/api/product/deleteproduct/' + id);
    };
});