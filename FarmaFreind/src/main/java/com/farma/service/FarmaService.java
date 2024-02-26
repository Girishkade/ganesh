package com.farma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farma.model.Product;
import com.farma.repository.FarmaRepository;

@Service
public class FarmaService  {

	@Autowired
	FarmaRepository repository;
	
	public Product addProduct(Product product)
	{
		return repository.save(product);
	}
	
	
	public List<Product> getProduct(Product product)
	{
		 return repository.findAll();
		
	}
	
	


	public void deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}
	/*public Product updateProduct(Integer id,Product product )
	{
		Product produ=repository.findById(id).orElse(null);
		produ.setName(product.getName());
		produ.setPrice(product.getPrice());
		produ.setId(product.getQuantity());
		return repository.save(product);
	}
	*/
	
	 public Product updateProduct(Integer id, Product updatedProduct) {
	        Product product = repository.findById(id).orElse(null);
	        if (product != null) {
	            // Update product fields with values from updatedProduct
	            product.setName(updatedProduct.getName());
	            product.setPrice(updatedProduct.getPrice());
	            product.setQuantity(updatedProduct.getQuantity());
	            // Similarly, update other fields as needed
	            repository.save(product);
	        }
	        return product;
	    }
	
	
}
