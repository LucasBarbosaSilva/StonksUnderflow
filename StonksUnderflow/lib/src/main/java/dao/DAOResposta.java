package dao;

import hibernate.HibernateConfiguration;
import model.Resposta;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DAOResposta implements IDAOResposta{
	private final Session session;

	public DAOResposta() {
		HibernateConfiguration config = new HibernateConfiguration();
		this.session = config.getSession();
	}
	
	@Override
	public Resposta getResposta(int id) {
		return this.session.get(Resposta.class, id);
	}
	
	@Override
	public void adicionarOuAlterarResposta(Resposta r) {
		Transaction t = this.session.beginTransaction();
		this.session.saveOrUpdate(r);
		t.commit();
	}
	
	@Override
	public void apagarResposta(Resposta r) {
		Transaction t = this.session.beginTransaction();
		this.session.delete(r);
		t.commit();
	}
	
}
