package com.moraes.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.moraes.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public List listar() {

		Categoria cat1 = new Categoria(1, "Pessoas");
		Categoria cat2 = new Categoria(2, "Animais");

		List categorias = new ArrayList();
		categorias.add(cat1);
		categorias.add(cat2);

		return categorias;
	}
}
