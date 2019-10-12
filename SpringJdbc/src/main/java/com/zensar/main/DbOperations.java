package com.zensar.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.ProductService;
import com.zensar.services.ProductServiceImpl;

public class DbOperations {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("dbconfig.xml");
		ProductService productService = ctx.getBean("productServiceImpl", ProductService.class);
		List<Product> products = productService.findAllProducts();
		for (Product p : products) {
			System.out.println(p);

		}
		Product p = productService.findProductById(1001);
		// System.out.println(p);
		if (p != null) {

			p.setName("mobile");
			p.setBrand("fox");
			p.setPrice(400);
			productService.updateProduct(p);
		} else {
			System.out.println("product not found!");
		}

		// Product product1 = new Product(1012, "led-tvv","intex" , 60000);
		// productService.updateProduct(product1);
	}

}
