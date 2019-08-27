package com.senai.spring.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.senai.spring.dao.ProductDAO;
import com.senai.spring.model.Product;

@Controller
public class ProductController {
	@Autowired
	private ProductDAO service;
	@RequestMapping("/")
	public String HomePage (Model model) {
		List<Product> listProducts = service.listaAll();
		model.addAttribute("listProducts", listProducts);
		return "index";
	}
	@RequestMapping("/new")
	public String NewProducts (Model model) {
		Product product = new Product ();
		model.addAttribute("product", product);
		
		return "new";
	}
	
}