package com.ainun.elasticsearch.service;

import com.ainun.elasticsearch.entity.Product;
import com.ainun.elasticsearch.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Iterable<Product> getProducts() {
        return repository.findAll();
    }
    public Product insertProduct(Product product) {
        return repository.save(product);
    }
    public Product updateProduct(Product product, int id) {
        Product updatedProduct = repository.findById(id).get();
        updatedProduct.setPrice(product.getPrice());
        return updatedProduct;
    }
    public void deleteProduct(int id) {
        if(id == 0){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        repository.deleteById(id);
    }
}
