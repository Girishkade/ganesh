package com.farma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farma.model.Product;
import com.farma.service.FarmaService;

@RestController
public class FarmaController {

	@Autowired
	FarmaService service;
	
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product)
	{
		Product pro=service.addProduct(product);
		return pro;
	}
	
	@GetMapping("/get")
	public List<Product> getProduct(Product product)
	{
		List<Product> pro=service.getProduct(product);
		return pro;
	}
	
	@DeleteMapping("/del/{id}")
	public void deleteProduct(@PathVariable Integer id)
	{
		service.deleteProduct(id);
	}
	
	/*
	 * @PutMapping("/update/{id}") public Product updateProduct(@PathVariable
	 * Integer id,@RequestBody Product product) { Product produc
	 * =service.updateProduct(id, product); return produc; }
	 */
			/*@PostMapping("/update/{id}")
			    public ResponseEntity<Product> updateUser(@PathVariable Integer id, @RequestBody Product updatedUser) {
			        Product user = service.updateProduct(id, updatedUser);
			        if (user != null) {
			            return ResponseEntity.ok(user);
			        } else {
			            return ResponseEntity.notFound().build();
			        }
}*/
	
	 /*@PutMapping("/{id}")
	    public ResponseEntity<Product> updateProduct(@PathVariable Integer id, @RequestBody Product updatedProduct) {
	        Product product = service.updateProduct(id, updatedProduct);
	        if (product != null) {
	            return ResponseEntity.ok(product);
	        } else {
	            return ResponseEntity.notFound().build();
	        }*/
	
	 @PutMapping("/{id}")
	    public ResponseEntity<Product> updateProduct(@PathVariable Integer id, @RequestBody Product updatedProduct) {
	        Product product = service.updateProduct(id, updatedProduct);
	        if (product != null) {
	            return ResponseEntity.ok(product);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }


}
