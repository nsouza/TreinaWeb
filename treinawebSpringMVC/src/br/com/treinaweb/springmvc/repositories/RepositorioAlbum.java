package br.com.treinaweb.springmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.springmvc.domain.Album;

public interface RepositorioAlbum extends JpaRepository<Album, Long> {

}
