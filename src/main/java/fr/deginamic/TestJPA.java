package fr.deginamic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.deginamic.persistence.Article;

public class TestJPA {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("compta-jpa");
		EntityManager em = entityManagerFactory.createEntityManager();

		// 1ère Requet
		Article a = em.find(Article.class, 1);
		System.out.println("**********************************FIST ARTICLE**********************************");
		System.out.println(a);
		
		// 2nd Requet
		Query query = em.createQuery("select a from Article a where a.mReference=:ref");
		query.setParameter("ref", "A01");
		Article a2 = (Article) query.getResultList().get(0);
		
		System.out.println("**********************************SECOND ARTICLE**********************************");

		System.out.println(a2);
		
		
		/* Query query = em.createNativeQuery("SELECT * FROM PIZZA");
		 
		  List<Object[]> rows = query.getResultList();
		  for (Object[] row : rows) {
			  for(Object o : row){
				  System.out.println(o);
			  }
		  
		  }
		 */
		
		em.close();
		entityManagerFactory.close();
	}

}
