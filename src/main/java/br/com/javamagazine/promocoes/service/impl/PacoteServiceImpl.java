package br.com.javamagazine.promocoes.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.javamagazine.promocoes.domain.Pacote;
import br.com.javamagazine.promocoes.repository.PacoteRepository;
import br.com.javamagazine.promocoes.service.PacoteService;

@Service
public class PacoteServiceImpl implements PacoteService {

	@Autowired
	private PacoteRepository repository;

	@Override
	public Pacote findByCodigo(Long codigo) {
		return repository.findOne(codigo);
	}

	@Override
	public Collection<Pacote> findAll() {
		return (Collection<Pacote>) repository.findAll();
	}

	@Override
	public Pacote create(Pacote pacote) {
		return repository.save(pacote);
	}

	@Override
	public Pacote update(Pacote pacote) {
		return repository.save(pacote);
	}

	@Override
	public void delete(Pacote pacote) {
		repository.delete(pacote);
	}

}
