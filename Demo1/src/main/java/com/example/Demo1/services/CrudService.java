package com.example.Demo1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import com.example.Demo1.model.Product;
import com.example.Demo1.repo.CrudRepo;

@Service
public class CrudService {

	@Autowired
	private CrudRepo repo;
	
	public List<Product> fetchProductList(){
		
		return repo.findAll();
	}

	public Optional<Product> fetchProductListById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	public Product saveProductToBD(Product product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

	public String deleteProductListById(int id) {
		// TODO Auto-generated method stub
		String result;
		try {
			repo.deleteById(id);
			result="Deleted";
		}
		catch(Exception e) {
			result = "Not Deleted";
		}
		return result;
	}
	
	
}
