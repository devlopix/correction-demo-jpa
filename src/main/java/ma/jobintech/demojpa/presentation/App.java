package ma.jobintech.demojpa.presentation;

import javax.persistence.EntityManager;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.fasterxml.classmate.AnnotationConfiguration;

import ma.jobintech.demojpa.domaine.Client;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		EntityManager entityManager = sessionFactory.createEntityManager();

		entityManager.getTransaction().begin();

		Client client = new Client();
		client.setNom("Oumoh");
		client.setPrenom("Hamza");

		entityManager.persist(client);

		entityManager.getTransaction().commit();

		entityManager.close();
	}
}
