package com.starter;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.starter.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query("select p from com.starter.model.Product p")
	public List<Product> getData();
	
	@Query("select p.prodCode from com.starter.model.Product p")
	public List<String> getProdCode();
	
	@Query("select p.prodCode,p.prodCost from com.starter.model.Product p")
	public List<Object[]> getProdCodeCost();
	
	@Query("select p from com.starter.model.Product p where p.prodCost=?1")
	public List<Product> getDataWithCondition(Double pcost);
	
	@Query("select p from com.starter.model.Product p where p.prodCost=:pcost")
	public List<Product> getDataInfo(Double pcost);
}
