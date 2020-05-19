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

import com.sinfloo.demo.interfaceService.IConquistaService;
import com.sinfloo.demo.modelo.conquista;

@Controller
@RequestMapping("/conquista")
public class controllerConquista {

	@Autowired
	private IConquistaService service;
	
	@GetMapping("/mapa")
	public String listarConquista(Model model) {
		List<conquista>conquista=service.listar();
		model.addAttribute("conquista", conquista);
		return "conquista"; 
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("conquista", new conquista());
		return "formConquista";
	}
	
	@PostMapping("/save")
	public String guardar(@Validated conquista p, Model model) {
		service.save(p);
		return "redirect:/mapa";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<conquista>conquista=service.listarId(id);
		model.addAttribute("conquista",conquista);
		return "formConquista";
	}
}
