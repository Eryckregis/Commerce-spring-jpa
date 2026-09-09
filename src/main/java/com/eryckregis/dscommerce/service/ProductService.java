package com.eryckregis.dscommerce.service;

import com.eryckregis.dscommerce.dto.ProductDTO;
import com.eryckregis.dscommerce.entities.Product;
import com.eryckregis.dscommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Product product = repository.findById(id).get();
        return new ProductDTO(product);
    }


}
