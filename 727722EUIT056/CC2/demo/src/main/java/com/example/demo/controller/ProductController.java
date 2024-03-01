package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
public class ProductController {
   @Autowired
   ProductService productService;
   @PostMapping("/adduser")
   public Product addUser(@RequestBody Product user) {      
       return productService.addUser(user);
   }

   @GetMapping("/findusers")
   public List<Product> findUsers() {
       return productService.getUserdetails();
   }
   
   @GetMapping("/finduser/{billno}")
   public Optional<Product> findUsers(@PathVariable Long billno) {
       return productService.findUser(billno);
   }

   @PutMapping("/edituser/{billno}")
   public Product editUser(@PathVariable Long billno, @RequestBody Product product) {
       return productService.editProduct(billno,product);
   }

   @DeleteMapping("/deleteuser/{billno}")
   public String deleteUser(@PathVariable Long billno)
   {
    return productService.deleteUser(billno);
   }   
   
}
