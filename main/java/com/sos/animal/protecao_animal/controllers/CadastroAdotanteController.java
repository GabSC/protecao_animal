package com.sos.animal.protecao_animal.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sos.animal.protecao_animal.model.Adotante;
import com.sos.animal.protecao_animal.model.Cidade;
import com.sos.animal.protecao_animal.repos.iCidadeRepo;

@Controller
public class CadastroAdotanteController {

	
	private iCidadeRepo cidadeRepo;
	
	
	
	
	public CadastroAdotanteController(iCidadeRepo cidadeRepo) {
		
		this.cidadeRepo = cidadeRepo;
	}

	@GetMapping(path = "/cadastrar/adotante")
	public String cadastrar(Model m) {
		
		Adotante ado = new Adotante();
		
		ado.setNome("reservaldo");
		ado.setCelular("35999659992");
		
		
		Adotante ado2 = new Adotante();
		
		ado2.setNome("reservaldo2");
		ado2.setCelular("35999659992 2");
		
	 List<Cidade>cidades = cidadeRepo.findAll(); // tesat com bootstrap dev para preenchar banco
		
		
		List<Adotante> adotantes = new ArrayList<>();
		
		adotantes.add(ado);
		adotantes.add(ado2);
		
		m.addAttribute("adotante",ado);
		
		m.addAttribute("adoList",adotantes);
		
		m.addAttribute("cidades",cidades);
		
		return "cadastrarAdotante";
		
	}
	
	@PostMapping( value = "/cadastrar/save")
	public String entraDados( @ModelAttribute(value = "adotante") Adotante adotante) { // o nome que está no @modeAttribute
																					//deve ser o mesmo que no th:object
																					//E devemos criar um parametro de mesmo tipo
		
		String n = adotante.getNome();
		
		return "cadastrarAdotante"; //retorna a view que quiser
	}
	
}

