package com.starter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.starter.model.Product;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {

//		repo.getData().forEach(System.out::println);
//		repo.getProdCode().forEach(System.out::println);
//		List<Object[]> obj = repo.getProdCodeCost();
//		for(Object ob:obj) {
//			Object p[] = (Object[])ob;
//			System.out.println(p[0]+" "+p[1]);	
//		}
		
//		repo.getDataWithCondition(2.0).forEach(System.out::println);
		repo.getDataInfo(2.0).forEach(System.out::println);
				
	}

}
