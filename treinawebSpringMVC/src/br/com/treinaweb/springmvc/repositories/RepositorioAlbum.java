package br.com.treinaweb.springmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.springmvc.domain.Album;

public interface RepositorioAlbum extends JpaRepository<Album, Long> {

<<<<<<< HEAD
	Album findByNome(String nome);
=======
>>>>>>> 9a612dfa21bcbe611938b2f65a0303ba1252ec56
}
