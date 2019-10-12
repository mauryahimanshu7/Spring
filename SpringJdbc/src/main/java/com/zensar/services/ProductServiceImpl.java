package com.zensar.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.daos.ProductDao;
import com.zensar.daos.ProductDaoImpl;
import com.zensar.entities.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> findAllProducts() {

		return productDao.getAll();
	}

	public Product findProductById(int productId) {

		return productDao.getById(productId);
	}

	@Override
	public void addProduct(Product product) {

		productDao.insert(product);

	}

	@Override
	public void updateProduct(Product product) {

		productDao.update(product);

	}

	@Override
	public void removeProduct(Product product) {

		productDao.delete(product);
	}

	@Override
	public List<Product> findProductsByPriceRange(float max, float min) {
		List<Product> list = productDao.getAll();
		List<Product> listPrice = new ArrayList<Product>();

		for (Product p : list) {

			if (p.getPrice() < max && p.getPrice() > min) {
				listPrice.add(p);
			}

		}

		return listPrice;
	}

	@Override
	public List<Product> findProductByName(String name) {

		List<Product> list = productDao.getAll();
		List<Product> listName = new ArrayList<Product>();
		for (Product p : list) {

			if (p.getName() == name) {
				listName.add(p);
			}

		}

		return listName;
	}

	@Override
	public List<Product> findProductByBrand(String brand) {
		List<Product> list = productDao.getAll();
		List<Product> listBrand = new ArrayList<Product>();
		for (Product p : list) {

			if (p.getBrand() == brand) {
				listBrand.add(p);
			}

		}

		return listBrand;

	}

	@Override
	public long getProductCount() {
		long count = 0;
		List<Product> list = productDao.getAll();
		for (Product p : list) {
			count++;
		}
		return count;
	}

}
