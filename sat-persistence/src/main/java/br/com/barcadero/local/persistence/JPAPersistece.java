package br.com.barcadero.local.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAPersistece {
	public static EntityManager manager;
	 private static final String PERSISTENCE_UNIT_NAME = "SAT-LOCAL";
     private static EntityManagerFactory factory;
	static {
		 factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		 manager = factory.createEntityManager();
	}

}
