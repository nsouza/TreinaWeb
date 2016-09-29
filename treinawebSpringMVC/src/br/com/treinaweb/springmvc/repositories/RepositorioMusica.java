package br.com.treinaweb.springmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.springmvc.domain.Musica;

public interface RepositorioMusica extends JpaRepository<Musica, Long>{

}
