package com.sinfloo.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sinfloo.demo.interfaceService.IDragonService;
import com.sinfloo.demo.modelo.dragon;

@Controller
@RequestMapping
public class controlador {

	@Autowired
	private IDragonService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<dragon> dragon = service.listar();
		model.addAttribute("dragons", dragon);
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("dragon", new dragon());
		return "form";
	}
	
	@PostMapping("/save")
	public String guardar(@Validated dragon p, Model model) {
		service.save(p);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<dragon>dragon=service.listarId(id);
		model.addAttribute("dragon",dragon);
		return "form";
	}
	
	@GetMapping("/eliminar/{id}")
	public String delete(@PathVariable int id, Model model) {
		service.delete(id);
		return "redirect:/listar";
	}
	

	
	
}
