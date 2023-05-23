package dao;

import java.util.List;

import model.Discussao;

public interface IDAODiscussao {
	Discussao getDiscussao(int id);
	List<Discussao> getDiscussoes();
	void adicionarOuAlterarDiscussao(Discussao d);
	List<Discussao> getDiscussoes(String filtroDiscussoes);
	void apagarDiscussao(Discussao d);
}
