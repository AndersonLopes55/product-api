package br.com.mystore.product.service;

import br.com.mystore.product.entity.Product;
import br.com.mystore.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product prod) {
        return repository.save(prod);
    }

    public List<Product> listAllProduct() {
        return repository.findAll();
    }
}
