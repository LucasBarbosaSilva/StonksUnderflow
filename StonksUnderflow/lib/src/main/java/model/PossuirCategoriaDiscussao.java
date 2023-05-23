package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "possuirCategoriaDiscussao")
public class PossuirCategoriaDiscussao implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@ManyToOne
	@JoinColumn(name = "id_discussaoFK", referencedColumnName = "id")
	private Discussao discussao;
	@Id
	@ManyToOne
	@JoinColumn(name = "id_categoriaFK", referencedColumnName = "id")
	private Categoria categoria;
	
	public PossuirCategoriaDiscussao() {
		
	}
	
	public PossuirCategoriaDiscussao(Discussao discussao, Categoria categoria) {
		this.discussao = discussao;
		this.categoria = categoria;
	}
	public Discussao getDiscussao() {
		return discussao;
	}
	public void setDiscussao(Discussao discussao) {
		this.discussao = discussao;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
