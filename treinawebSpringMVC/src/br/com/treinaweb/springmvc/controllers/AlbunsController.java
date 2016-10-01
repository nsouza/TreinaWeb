package br.com.treinaweb.springmvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.ResponseBody;
=======
>>>>>>> 9a612dfa21bcbe611938b2f65a0303ba1252ec56

import br.com.treinaweb.springmvc.domain.Album;
import br.com.treinaweb.springmvc.repositories.RepositorioAlbum;

@Controller
@RequestMapping("/albuns")
public class AlbunsController {
	
	@Autowired
<<<<<<< HEAD
	private RepositorioAlbum repositorio;
	
	@RequestMapping(value="/listar", method = RequestMethod.GET)
	public String listar(Model model){
		List<Album> albuns = repositorio.findAll();
=======
	private RepositorioAlbum respositorio;
	
	@RequestMapping(value="/listar", method = RequestMethod.GET)
	public String listar(Model model){
		List<Album> albuns = respositorio.findAll();
>>>>>>> 9a612dfa21bcbe611938b2f65a0303ba1252ec56
		model.addAttribute("albuns", albuns);
		return "album.listar.tiles";
	}
	
	@RequestMapping(value="/adicionar", method = RequestMethod.GET)
	public String adicionar(Model model){
		model.addAttribute("album", new Album());
		return "album.adicionar.tiles";
		
	}
	
	@RequestMapping(value="/adicionar", method = RequestMethod.POST)
	public String adicionar(@ModelAttribute("album") @Valid Album novoAlbum,BindingResult result, Model model){
		if(result.hasErrors()){
			return "album.adicionar.tiles";
		}
		
<<<<<<< HEAD
		repositorio.save(novoAlbum);
=======
		respositorio.save(novoAlbum);
>>>>>>> 9a612dfa21bcbe611938b2f65a0303ba1252ec56
		return "redirect:/albuns/listar";
	}
	
	@RequestMapping(value="alterar/{id}", method = RequestMethod.GET)
	public String alterar(@PathVariable("id") Long id, Model model){
<<<<<<< HEAD
		Album albumASerAlterado = repositorio.findOne(id);
		model.addAttribute("album", albumASerAlterado);
=======
		Album albumASerAlterado = respositorio.findOne(id);
		model.addAttribute("albuem", albumASerAlterado);
>>>>>>> 9a612dfa21bcbe611938b2f65a0303ba1252ec56
		return "album.alterar.tiles";	
	}

	@RequestMapping(value="/alterar", method = RequestMethod.POST)
	public String alterar(@ModelAttribute("album") @Valid Album album, BindingResult result){
		if(result.hasErrors()){
			return "album.alterar.tiles";
		}
<<<<<<< HEAD
		repositorio.save(album);
		return "redirect:/albuns/listar";
=======
		respositorio.save(album);
		return "redirect:/albuns/listtar";
>>>>>>> 9a612dfa21bcbe611938b2f65a0303ba1252ec56
	}
	
	@RequestMapping(value="/excluir/{id}", method = RequestMethod.GET)
	public String excluir(@PathVariable("id") Long id){
<<<<<<< HEAD
		repositorio.delete(id);
		return "redirect:/albuns/listar";
	}
	
	@RequestMapping(value = "/porNome/{nome}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Album pesquisarPorNome(@PathVariable("nome") String nomeAlbum){
		return repositorio.findByNome(nomeAlbum);
	}
=======
		respositorio.delete(id);
		return "redirect:/albuns/listar";
	}
	
>>>>>>> 9a612dfa21bcbe611938b2f65a0303ba1252ec56
	
}











