package dao;

import java.util.List;

import model.Categoria;

public interface IDAOCategoria {
	Categoria getCategoria(int id);
	List<Categoria> getCategorias();
	void adicionarOuAlterarCategoria(Categoria c);
	List<Categoria> getCategorias(String filtroDiscussoes);
	void apagarCategoria(Categoria c);
}
