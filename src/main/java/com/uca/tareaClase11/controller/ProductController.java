package com.uca.tareaClase11.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.tareaClase11.domain.Product;

@Controller
public class ProductController {
	
	@GetMapping("/producto")
	public ModelAndView ingrearProducto() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		mav.addObject("product", new Product());
		return mav;
	}
	
	@PostMapping("/guardar")
	public ModelAndView validarProducto(@Valid @ModelAttribute Product product, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("index");
		} else {
			mav.addObject("productName", product.getNombre());
			mav.setViewName("saved");
		}
		return mav;
	}

}
