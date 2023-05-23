package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {
	@Id
	@GeneratedValue	
	private int id;
	@OneToMany(mappedBy = "categoria")
	private List<possuirCategoriaDiscussao> discussoes;

	public Categoria() {
	}	

	public Categoria(int id, List<possuirCategoriaDiscussao> discussoes) {
		super();
		this.id = id;
		this.discussoes = discussoes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<possuirCategoriaDiscussao> getDiscussoes() {
		return discussoes;
	}

	public void setDiscussoes(List<possuirCategoriaDiscussao> discussoes) {
		this.discussoes = discussoes;
	}
	
	
}
