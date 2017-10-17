package fr.deginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.dialect.identity.SybaseAnywhereIdentityColumnSupport;

import fr.deginamic.persistence.BonCommande;

public class Test {

	public static void main(String ...arg){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("compta-jpa");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		BonCommande b = (BonCommande) em.createQuery("FROM BonCommande B").getResultList().get(0);
		
		b.getArticles().stream().forEach(p -> System.out.println(p.toString()));
		em.close();
		entityManagerFactory.close();
	}
}
