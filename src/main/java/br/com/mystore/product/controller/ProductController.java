package br.com.mystore.product.controller;

import br.com.mystore.product.entity.Product;
import br.com.mystore.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/produtos/adicionar")
    public Product addProduct(@RequestBody Product prod) {

        return service.saveProduct(prod);

    }

    @GetMapping("/produtos/listar")
    public List<Product> listProduct() {

        return service.listAllProduct();

    }

}