package br.com.javamagazine.promocoes.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.javamagazine.promocoes.domain.Pacote;
import br.com.javamagazine.promocoes.service.PacoteService;

@RestController
@RequestMapping(value = "/api/v1/pacotes", produces = MediaType.APPLICATION_JSON_VALUE)
public class PacoteController {

	@Autowired
	private PacoteService service;

	@RequestMapping(value = "/{codigo}", method = RequestMethod.GET)
	public Pacote get(@PathVariable Long codigo) {
		return service.findByCodigo(codigo);
	}

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Pacote> getAll() {
		return service.findAll();
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Pacote create(@RequestBody Pacote pacote) {
		return service.create(pacote);
	}

	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Pacote update(@RequestBody Pacote pacote) {
		return service.update(pacote);
	}

	@RequestMapping(method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void delete(Long codigo) {
		Pacote pacote = service.findByCodigo(codigo);
		service.delete(pacote);
	}

}