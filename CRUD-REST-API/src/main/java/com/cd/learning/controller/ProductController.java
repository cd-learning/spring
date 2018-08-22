package com.cd.learning.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cd.learning.model.Product;
import com.cd.learning.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	public ProductService productService;
  	@RequestMapping(value = "/addProductData", method = RequestMethod.POST)
	public void addAllRecord(@RequestBody Product product) {

		productService.productInsertData(product);
	}

	@RequestMapping(value = "/ProductGetDetails", method = RequestMethod.GET)
	public List<Product> getAllProductDetail() {
		return productService.geAllRecords();
	}

	@RequestMapping(value = "/ProductUpdateDetail/{id}", method = RequestMethod.PUT)
	public void updateProductData(@RequestBody Product product,@PathVariable("id") int id) {

        productService.updateRecord(id,product);
	}

	@RequestMapping(value="/ProductDeleteDetail/{deleteId}", method = RequestMethod.DELETE)
	public void deleteProductData(@RequestBody Product product,@PathVariable("deleteId")int delId) {

		productService.deleteRecord(delId,product);
	}


	@RequestMapping(value="/delete", method = RequestMethod.DELETE)
	public void deleteProductData(@RequestBody Product product) {

		productService.delete(product);
	}
}
