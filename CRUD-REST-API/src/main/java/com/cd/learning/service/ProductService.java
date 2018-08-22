package com.cd.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cd.learning.model.Product;
import com.cd.learning.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	public ProductRepo productRepo;

	public List<Product> geAllRecords() {

		return productRepo.findAll();

	}


	public void test(Product product) {

		productRepo.save(product);
	}
	public void productInsertData(Product Product) {

		productRepo.save(Product);

	}

	public void updateTopicData(Product topic, int id) {

		for (int i = 0; i < productRepo.findAll().size(); i++) {

		}
	}

	public void updateRecord(int id, Product product) {
		List<Product> list = productRepo.findAll();
		for (int i = 0; i < list.size(); i++) {
			int listOfId = list.get(i).getProductId();
			if (listOfId == id) {
				list.set(i, product);
			}
		}
		productRepo.save(product);

	}

	public void deleteRecord(int delId, Product product) {

		List<Product> getList=productRepo.findAll();
		for(int i=0;i<getList.size();i++) {
			 if(getList.get(i).getProductId() == delId) {
                      getList.remove(i);
			 }
		}
		productRepo.delete(product);


	}
	public void delete(Product product) {
		productRepo.delete(product);
	}
}
