package com.zensar.services;

/**
 * @author HIMANSHU MAURYA
 * @creation_date 10th Oct 2019 4.44PM
 * @version 1.0
 * @copyright zensar TEchnologies. All rights recieved
 * @description it is dao layer interface
 * 				used in business layer
 *  
 */

import java.util.List;

import com.zensar.entities.Product;

public interface ProductService {
	List<Product> findAllProducts();
	Product findProductById(int productId);

	void addProduct(Product product);

	void updateProduct(Product product);

	void removeProduct(Product product);

	List<Product> findProductsByPriceRange(float max, float min);

	List<Product> findProductByName(String name);

	List<Product> findProductByBrand(String brand);

	long getProductCount();

}
