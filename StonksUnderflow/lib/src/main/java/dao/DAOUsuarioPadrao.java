package dao;

import java.util.List;

import javax.persistence.Query;

import model.UsuarioPadrao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.HibernateConfiguration;
import model.Usuario;

public class DAOUsuarioPadrao implements IDAOUsuarioPadrao {
private Session session;
	
	public DAOUsuarioPadrao() {
		HibernateConfiguration config = new HibernateConfiguration();
		this.session = config.getSession();
	}
	
	@Override
	public UsuarioPadrao getUsuarioPadrao(int id) {
		UsuarioPadrao output = this.session.get(UsuarioPadrao.class, id);
		 return output;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<UsuarioPadrao> getUsuariosPadrao(){
		List<UsuarioPadrao> output = null;
		String hql = "FROM Usuario u";
		Query query = this.session.createQuery(hql);
		output = query.getResultList();
		return output;
	}
	
	@Override
	public void adicionarOuAlterarUsuarioPadrao(UsuarioPadrao u) {
		Transaction t = this.session.beginTransaction(); //início da transação
		this.session.saveOrUpdate(u);
		t.commit(); //finalizando transação
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<UsuarioPadrao> getUsuariosPadrao(String filtroNome){
		List<UsuarioPadrao> output = null;
		String hql = "FROM Usuario u WHERE u.nome LIKE '%"+filtroNome+"%'";
		Query query = this.session.createQuery(hql);
		output = query.getResultList();
		return output;
	}
	
	@Override
	public void apagarUsuarioPadrao(UsuarioPadrao u) {
		Transaction t = this.session.beginTransaction();
		this.session.delete(u);
		t.commit();
	}
	
}
