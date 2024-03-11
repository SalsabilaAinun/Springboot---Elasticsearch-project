package com.ainun.elasticsearch.repository;

import com.ainun.elasticsearch.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepository extends ElasticsearchRepository<Product, Integer> {
}
