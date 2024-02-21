package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    public List<Product> getUserdetails()
    {
        return productRepo.findAll();
    }
    public Product addUser(Product user)
    {
        return productRepo.save(user);
    }

    public Optional<Product> findUser(Long billno)
    {
        return productRepo.findById(billno);
    }

    public Product editProduct(Long billno,Product product)
    {
        Product productAvail=productRepo.findById(billno).orElse(null);
        if (productAvail!=null) 
        {
            productAvail.setProductname(product.getProductname()); 
            productAvail.setQuantity(product.getQuantity());
            productAvail.setPrice(product.getPrice());
            productAvail.setTotalbill(product.getTotalbill());
            return productRepo.saveAndFlush(productAvail);           
        }
        else
        return null;
    }
    public String deleteUser(Long billno)
    {
        productRepo.deleteById(billno);
        return("User deleted");
    }
}
