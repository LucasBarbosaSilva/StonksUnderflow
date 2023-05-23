package model;

import java.util.ArrayList;
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

	@OneToMany(mappedBy = "discussao")
	private List<Resposta> respostas;
	
	public Discussao() {
		//Para o hibernate
	}

	public Discussao(String titulo, String descricao, ENUMStatusDiscussao status,
			List<Categoria> categorias, Usuario usuario) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.status = status;
		List<PossuirCategoriaDiscussao> list = new ArrayList<PossuirCategoriaDiscussao>();
		for (Categoria c: categorias) {
			list.add(new PossuirCategoriaDiscussao(this, c));
		}
		this.categorias = list;
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
