package dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.HibernateConfiguration;
import model.Moderador;

public class DAOModerador implements IDAOModerador{
	private Session session;
	
	public DAOModerador() {
		HibernateConfiguration config = new HibernateConfiguration();
		this.session = config.getSession();
	}
	
	@Override
	public Moderador getModerador(int id) {
		 Moderador output = this.session.get(Moderador.class, id);
		 return output;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Moderador> getModeradores(){
		List<Moderador> output = null;
		String hql = "FROM Moderador m";
		Query query = this.session.createQuery(hql);
		output = query.getResultList();
		return output;
	}
	
	@Override
	public void adicionarOuAlterarModerador(Moderador m) {
		Transaction t = this.session.beginTransaction(); //início da transação
		this.session.saveOrUpdate(m);
		t.commit(); //finalizando transação
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Moderador> getModeradores(String filtroNome){
		List<Moderador> output = null;
		String hql = "FROM Moderador m WHERE m.nome LIKE '%"+filtroNome+"%'";
		Query query = this.session.createQuery(hql);
		output = query.getResultList();
		return output;
	}
	
	@Override
	public void apagarModerador(Moderador m) {
		Transaction t = this.session.beginTransaction();
		this.session.delete(m);
		t.commit();
	}
	
}
