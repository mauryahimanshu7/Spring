package com.zensar.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 * @author HIMANSHU MAURYA
 * @creation_date 10th Oct 2019 4.44PM
 * @version 3.0
 * @copyright zensar TEchnologies. All rights recieved
 * @description it is dao class
 *  * 			used in persistence layer
 *  
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Product> getAll() {

		return (List<Product>) hibernateTemplate.find("from Product");
	}

	@Override
	public Product getById(int productId) {

		return hibernateTemplate.get(Product.class, productId);
	}

	@Override
	public void insert(Product product) {
		hibernateTemplate.save(product);

	}

	@Override
	public void update(Product product) {
		hibernateTemplate.update(product);

	}

	@Override
	public void delete(Product product) {
		hibernateTemplate.delete(product);
	}

}
