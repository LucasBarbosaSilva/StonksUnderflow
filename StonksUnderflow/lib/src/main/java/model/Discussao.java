package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import utils.ENUMStatusDiscussao;

@Entity
@Table(name = "discussao")
public class Discussao {
	@Id
	@GeneratedValue
	private int id;
	private String titulo;
	private String descricao;
	private ENUMStatusDiscussao status;
	@OneToMany(mappedBy = "discussao")
	private List<PossuirCategoriaDiscussao> categorias;
	@ManyToOne
	@JoinColumn(name="codigo_usuarioFK", referencedColumnName = "id")
	private Usuario usuario;
	
	public Discussao() {
		//Para o hibernate
	}

	public Discussao(int id, String titulo, String descricao, ENUMStatusDiscussao status,
			List<PossuirCategoriaDiscussao> categorias, Usuario usuario) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.status = status;
		this.categorias = categorias;
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ENUMStatusDiscussao getStatus() {
		return status;
	}

	public void setStatus(ENUMStatusDiscussao status) {
		this.status = status;
	}

	public List<PossuirCategoriaDiscussao> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<PossuirCategoriaDiscussao> categorias) {
		this.categorias = categorias;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	
}
