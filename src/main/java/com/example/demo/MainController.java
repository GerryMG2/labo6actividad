package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {
	
	
	@Autowired
	private servicecontribuyenteimp serviceContri = new servicecontribuyenteimp();
	@Autowired
	private serviceImportanciaImpl serviceImpor = new serviceImportanciaImpl();
	
	
	@GetMapping(path = "/inicio")
	public ModelAndView index(contribuyente ct) {
		ModelAndView mav = new ModelAndView();
			
		mav.setViewName("index");
		
		mav.addObject("lista", serviceImpor.getlistimportancia());
		
		
		return mav;
	}
	
	
	@PostMapping(path = "/registro")
	public ModelAndView registrar(@ModelAttribute contribuyente est, BindingResult result) {
	
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("index");
		}else {
			Boolean resolve = serviceContri.save(est);
			if(resolve) {
				mav.setViewName("ok");
				mav.addObject("msg", "Se guardo con exito!");
			}else {
				mav.setViewName("ok");
				mav.addObject("msg", "hubo un problema al guardar");
			}
		}
		
		
		return mav;
	}
	
	
	@GetMapping(path = "/listado")
	public ModelAndView listado() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("listado");
		try {
			System.out.println("entra al try");
			List<contribuyente> ests = serviceContri.getall();
			System.out.println(ests.size());
			mav.addObject("contri", ests);
			mav.addObject("lista", serviceImpor.getlistimportancia());
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		return mav;
	}

}
