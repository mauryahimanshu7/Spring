package com.zensar.daos;

/**
 * @author HIMANSHU MAURYA
 * @creation_date 10th Oct 2019 4.44PM
 * @version 1.0
 * @copyright zensar TEchnologies. All rights recieved
 * @description it is dao layer interface
 * 				used in persistence layer
 *  
 */

import java.util.List;



import com.zensar.entities.Product;

public interface ProductDao {

	List<Product> getAll();

	Product getById(int productId);

	void insert(Product product);

	void update(Product product);

	void delete(Product product);

}
