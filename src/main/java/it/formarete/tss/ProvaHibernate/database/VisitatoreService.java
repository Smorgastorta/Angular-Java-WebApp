package it.formarete.tss.ProvaHibernate.database;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import it.formarete.tss.ProvaHibernate.model.Visitatore;

public class VisitatoreService {
	SessionFactory sf = HibernateSF.getSessionFactory();
	Session session;

	@SuppressWarnings("unchecked")
	public List<Visitatore> getVisitatori() {
		session = sf.openSession();
		List<Visitatore> value = session.createSQLQuery("SELECT * FROM Visitatori").list();
		session.close();
		return value;
	}

	public Visitatore getVisitatore(String cod) {
		session = sf.openSession();
		Visitatore v = session.get(Visitatore.class, cod);
		session.close();
		return v;
	}

	public String postVisitatore(Visitatore visitatore) {
		session = sf.openSession();
		session.beginTransaction();
		String cod = (String) this.session.save(visitatore);
		if (this.session.get(Visitatore.class, cod) != null) {
			session.getTransaction().commit();
			session.close();
			return cod;
		} else {
			session.getTransaction().rollback();
			session.close();
			return null;
		}
	}

	public String deleteVisitatore(Visitatore v) {
		session = sf.openSession();
		session.beginTransaction();
		try {
			session.delete(v);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
		}
		session.close();
		return v.getCod_visitatore();

	}
}
