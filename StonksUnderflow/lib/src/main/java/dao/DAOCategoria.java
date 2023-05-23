package dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.HibernateConfiguration;
import model.Categoria;

public class DAOCategoria implements IDAOCategoria{
private Session session;
	
	public DAOCategoria() {
		HibernateConfiguration config = new HibernateConfiguration();
		this.session = config.getSession();
	}
	
	@Override
	public Categoria getCategoria(int id) {
		 Categoria output = this.session.get(Categoria.class, id);
		 return output;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Categoria> getCategorias(){
		List<Categoria> output = null;
		String hql = "FROM Categoria c";
		Query query = this.session.createQuery(hql);
		output = query.getResultList();
		return output;
	}
	
	@Override
	public void adicionarOuAlterarCategoria(Categoria c) {
		Transaction t = this.session.beginTransaction(); //início da transação
		this.session.saveOrUpdate(c);
		t.commit(); //finalizando transação
	}
	
	/*@Override
	@SuppressWarnings("unchecked")
	public List<Categoria> getCategorias(String filtroDiscussoes){
		List<Cliente> output = null;
		String hql = "FROM Categoria c WHERE c.discussoes LIKE '%"+filtroDiscussoes+"%'";
		Query query = this.session.createQuery(hql);
		output = query.getResultList();
		return output;
	}*/
	
	@Override
	public void apagarCategoria(Categoria c) {
		Transaction t = this.session.beginTransaction();
		this.session.delete(c);
		t.commit();
	}
	
}
