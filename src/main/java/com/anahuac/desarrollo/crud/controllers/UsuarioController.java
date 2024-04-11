package com.anahuac.desarrollo.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anahuac.desarrollo.crud.dao.UsuarioRepository;
import com.anahuac.desarrollo.crud.entities.Usuario;
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
	
	@RequestMapping("/usuario/new")
	public  String newUsuario(Model modelo) {
		modelo.addAttribute("user", new Usuario());
		return "add";
	}
	
	//método delete
	//el id es una variable que se pasa (como lo de postman, literal)
	//el value debe ser identico a lo que dice el html
	@RequestMapping(value="/delete/{id}")
	public String delete(@PathVariable Integer id)
	{
		userService.deleteUser(id);
		return "redirect:/users";
	}
	
	//METODO READ ALL
	@GetMapping("/users")
	public String showUserList(Model modelo) {
		modelo.addAttribute("users", userService.findAll());
		return "users";
	}
	
	//METODO EDITAR
	@GetMapping(value="/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		model.addAttribute("user",userService.getUsuarioById(id));
		return "add";
	}
	
	
	//METODO AÑADIR
	@RequestMapping(value="add",method = RequestMethod.POST)
	public String saveUsuario(Usuario usuario) {
		userService.crearUsuario(usuario);
		System.out.println(">>>>Save usuario");
		return "redirect:/users";
	}
	
	
	
}
