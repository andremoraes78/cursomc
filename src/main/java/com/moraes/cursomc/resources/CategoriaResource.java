package com.moraes.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.moraes.cursomc.domain.Categoria;
import com.moraes.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService categoriaService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List listar() {

		Categoria cat1 = new Categoria(1, "Pessoas");
		Categoria cat2 = new Categoria(2, "Animais");

		List categorias = new ArrayList();
		categorias.add(cat1);
		categorias.add(cat2);

		return categorias;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Categoria> findById(@PathVariable Integer id) {
		return ResponseEntity.ok(categoriaService.findById(id));
	}
}
