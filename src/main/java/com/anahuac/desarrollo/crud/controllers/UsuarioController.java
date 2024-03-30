package com.anahuac.desarrollo.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anahuac.desarrollo.crud.dao.UsuarioRepository;
import com.anahuac.desarrollo.crud.services.UsuarioCRUDService;

@Controller
public class UsuarioController {
	@Autowired
	private UsuarioCRUDService userService;
	
	@RequestMapping("/test")
	public  String test(Model modelo) {
		modelo.addAttribute("mensaje", "este es el mensaje");
		return "test";
	}
	@RequestMapping("/users")
	public  String userService(Model modelo) {
		modelo.addAttribute("user", userService.findAll() );
		return "users";
	}
	@RequestMapping(value="/delete/{id}")
	public String delete(@PathVariable Integer id)
	{
		userService.deleteUser(id);
		return "redirect:/index";
	}
	//@GetMapping("/index")
	//public String showUserList(Model modelo) {
		
	//}
}
