package main.java.it.epicode.library.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import main.java.it.epicode.library.entities.User;

public class UserDaoImpl implements UserDao{

    private static final String PERSISTENCE_UNIT = "JPA_Sample";
    private EntityManager em;

    public UserDaoImpl() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        em = emf.createEntityManager();
    }

    @Override
    public void addUser(User user) {
        try {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw e;
        }
    }
}
