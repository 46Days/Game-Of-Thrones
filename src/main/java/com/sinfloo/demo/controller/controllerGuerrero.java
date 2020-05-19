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
import com.sinfloo.demo.interfaceService.IGuerreroService;
import com.sinfloo.demo.modelo.guerrero;

@Controller
@RequestMapping("/guerrero")
public class controllerGuerrero {

	@Autowired
	private IGuerreroService service2;

	@GetMapping("/listarGuerrero")
	private String listarGuerrero(Model model) {
		List<guerrero> guerrero = service2.listar1();
		model.addAttribute("guerrero", guerrero);
		return "guerreros";
	}

	@GetMapping("/newGue")
	private String agregar(Model model) {
		model.addAttribute("guerrero",new guerrero());
		return "formGue";
	}

	@PostMapping("/saveGue")
	public String guardar(@Validated guerrero g, Model model) {
		service2.save1(g);
		return "redirect:/guerrero/listarGuerrero";
	}
	
	@GetMapping("/editarGue/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<guerrero>guerrero=service2.listarId1(id);
		model.addAttribute("guerrero",guerrero);
		return "formGue";
	}
	
	@GetMapping("/eliminarGue/{id}")
	public String delete(@PathVariable int id, Model model) {
		service2.delete1(id);
		return "redirect:/guerrero/listarGuerrero";
	}
	
}
