package br.com.javamagazine.promocoes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.javamagazine.promocoes.domain.Pacote;

@Repository
public interface PacoteRepository extends CrudRepository<Pacote, Long> {

}
