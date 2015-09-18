package br.com.javamagazine.promocoes.service;

import java.util.Collection;

import br.com.javamagazine.promocoes.domain.Pacote;

public interface PacoteService {

	Pacote findByCodigo(Long codigo);

	Collection<Pacote> findAll();

	Pacote create(Pacote pacote);

	Pacote update(Pacote pacote);

	void delete(Pacote pacote);

}
