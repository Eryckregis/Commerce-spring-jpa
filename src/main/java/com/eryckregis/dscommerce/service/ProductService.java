package com.eryckregis.dscommerce.service;

import com.eryckregis.dscommerce.dto.ProductDTO;
import com.eryckregis.dscommerce.entities.Product;
import com.eryckregis.dscommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository Repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Optional<Product> result = Repository.findById(id);
        Product product = result.get();
        ProductDTO dto = new ProductDTO(product);
        return dto;

    }

}
