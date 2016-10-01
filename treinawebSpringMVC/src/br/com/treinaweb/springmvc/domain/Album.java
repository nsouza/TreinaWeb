package br.com.treinaweb.springmvc.domain;

<<<<<<< HEAD
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
=======
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
>>>>>>> 9a612dfa21bcbe611938b2f65a0303ba1252ec56
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="alb_albuns")
public class Album {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="alb_id")
	private long id;
	
	@NotNull(message="O nome é obrigatório")
	@NotEmpty(message="O nome é obrigatório")
<<<<<<< HEAD
	@Size(min = 4, max = 10, message="O valor deve estar entre 4 e 10")
=======
	@Size(min = 4, max = 10, message="O valode deve estar entre 4 e 10")
>>>>>>> 9a612dfa21bcbe611938b2f65a0303ba1252ec56
	@Column(name="alb_name", length = 10, nullable = false)
	private String nome;
	
	@NotNull(message="O campo é obrigatorio")
	@Min(value = 1990 , message="O deve deve ser lançado a partir de 1990")
	@Max(value = 2030, message="O ano não pode ser maior que 2030")
	@Column(name="alb_ano_lancamento", nullable = false)
	private int anoDeLancamento;
	
<<<<<<< HEAD
	@OneToMany(mappedBy = "album", fetch = FetchType.EAGER, cascade = CascadeType.MERGE, orphanRemoval = true)
	private Set<Musica> musica;
=======
	
>>>>>>> 9a612dfa21bcbe611938b2f65a0303ba1252ec56
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}
	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}
<<<<<<< HEAD
	
	public Set<Musica> getMusica() {
		return musica;
	}
	public void setMusica(Set<Musica> musica) {
		this.musica = musica;
	}
=======
>>>>>>> 9a612dfa21bcbe611938b2f65a0303ba1252ec56

	

}
