package dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.HibernateConfiguration;
import model.Categoria;
import model.Discussao;
import model.PossuirCategoriaDiscussao;

public class DAODiscussao implements IDAODiscussao {
	private Session session;
	
	public DAODiscussao(){
		HibernateConfiguration config = new HibernateConfiguration();
		this.session = config.getSession();
	}
	
	@Override
	public Discussao getDiscussao(int id) {
		Discussao output = this.session.get(Discussao.class, id);
		return output;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Discussao> getDiscussoes() {
		List<Discussao> output = null;
		String hql = "FROM Discussao d";
		Query query = this.session.createQuery(hql);
		output = query.getResultList();
		return output;
	}

	@Override
	public void adicionarOuAlterarDiscussao(Discussao d) {
		Transaction t = this.session.beginTransaction(); //início da transação
		this.session.saveOrUpdate(d);
		t.commit(); //finalizando transação
		t = this.session.beginTransaction(); //início da transação
		for (PossuirCategoriaDiscussao p: d.getCategorias()) {
			this.session.saveOrUpdate(p);
		}
		t.commit(); //finalizando transação
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Discussao> getDiscussoes(String filtroDiscussoes) {
		List<Discussao> output = null;
		String hql = "FROM Discussao d WHERE d.titulo LIKE '%"+filtroDiscussoes+"%'";
		Query query = this.session.createQuery(hql);
		output = query.getResultList();
		return output;
	}

	@Override
	public void apagarDiscussao(Discussao d) {
		Transaction t = this.session.beginTransaction();
		this.session.delete(d);
		t.commit();
	}
	
}
