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

import com.sinfloo.demo.interfaceService.ISubditoService;
import com.sinfloo.demo.modelo.subdito;

@Controller
@RequestMapping("/subdito")
public class controllerSubdito {

	@Autowired
	private ISubditoService service;
	
	@GetMapping("/listarSubdito")
	private String listarSubdito(Model model) {
		List<subdito> subdito = service.listarSubdito();
		model.addAttribute("subdito", subdito);
		return "subdito";
	}

	@GetMapping("/newSubdito")
	private String agregarSubdito(Model model) {
		model.addAttribute("subdito", new subdito());
		return "formSubdito";
	}
	
	@PostMapping("/saveSubdito")
	public String guardar(@Validated subdito s, Model model) {
		service.saveSubdito(s);
		return "redirect:/subdito/listarSubdito";
	}
	
	@GetMapping("/editarSubdito/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<subdito>subdito=service.listarIdSubdito(id);
		model.addAttribute("subdito",subdito);
		return "formSubdito";
	}
	
	@GetMapping("/eliminarSubdito/{id}")
	public String delete(@PathVariable int id, Model model) {
		service.deleteSubdito(id);
		return "redirect:/subdito/listarSubdito";
	}
}
