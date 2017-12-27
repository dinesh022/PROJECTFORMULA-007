package com.spring.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.spring.dao.*;
import com.spring.model.Product;
import com.spring.model.Users;
@Controller
public class HomeController {
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/")
	public String index()
	{
		
		return "index";
	}	

	@RequestMapping("/productList")
	public String getProducts(Model model){
		List<Product>products=productDao.getAllProducts();
	    model.addAttribute("products", products);
	    return "productList";
	}





}

