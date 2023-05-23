package dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.HibernateConfiguration;
import model.Usuario;

public class DAOUsuario implements IDAOUsuario{
private Session session;
	
	public DAOUsuario() {
		HibernateConfiguration config = new HibernateConfiguration();
		this.session = config.getSession();
	}
	
	@Override
	public Usuario getUsuario(int id) {
		 Usuario output = this.session.get(Usuario.class, id);
		 return output;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Usuario> getUsuarios(){
		List<Usuario> output = null;
		String hql = "FROM Usuario u";
		Query query = this.session.createQuery(hql);
		output = query.getResultList();
		return output;
	}
	
	@Override
	public void adicionarOuAlterarUsuario(Usuario u) {
		Transaction t = this.session.beginTransaction(); //início da transação
		this.session.saveOrUpdate(u);
		t.commit(); //finalizando transação
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Usuario> getUsuarios(String filtroNome){
		List<Usuario> output = null;
		String hql = "FROM Usuario u WHERE u.nome LIKE '%"+filtroNome+"%'";
		Query query = this.session.createQuery(hql);
		output = query.getResultList();
		return output;
	}
	
	@Override
	public void apagarUsuario(Usuario u) {
		Transaction t = this.session.beginTransaction();
		this.session.delete(u);
		t.commit();
	}
	
}
