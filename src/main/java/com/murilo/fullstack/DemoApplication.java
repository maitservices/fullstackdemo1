package com.murilo.fullstack;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.murilo.fullstack.domain.Categoria;
import com.murilo.fullstack.domain.Produto;
import com.murilo.fullstack.repositories.CategoriaRepository;
import com.murilo.fullstack.repositories.ProdutoRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null,"Informatica");
		Categoria cat2 = new Categoria(null,"Escritorio");
		Categoria cat3 = new Categoria(null,"Lojas");
		
		Produto p1 = new Produto(null, "Notebook", new BigDecimal("2000.00"));
		Produto p2 = new Produto(null, "Mouse", new BigDecimal("20.00"));
		Produto p3 = new Produto(null, "Monitor", new BigDecimal("500.00"));
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		
		categoriaRepository.save(Arrays.asList(cat1,cat2,cat3));
		produtoRepository.save(Arrays.asList(p1,p2,p3));
	}
}