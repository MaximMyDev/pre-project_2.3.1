package web.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class UserDAOImplEntityManager implements UserDAO {

    @PersistenceContext
    //@Autowired
    private EntityManager entityManager;


    @Override
    @Transactional
    public List<User> allUsers() {
        //entityManager.getTransaction().begin();
        //return entityManager.createNamedQuery("from User", User.class).getResultList();
        return entityManager.createQuery("select u from User u").getResultList();
        //        return (List<Customer>) repo.findAll();
    }

    @Override
    @Transactional
    public void add(User user) {
        //entityManager.getTransaction().begin();
        //entityManager.persist(user);
        //entityManager.getTransaction().commit();
    }

    @Override
    @Transactional
    public void delete(User user) {
        //usersList.remove(user.getId());
        ///Session session = sessionFactory.getCurrentSession();
        //session.delete(user);
        //session.remove(user);
        //entityManager.de
        /*
       EntityManager em = HibernateOperations.getEntityManager();
        em.getTransaction().begin();
        Movie movie = em.find(Movie.class, new Long(1L));
        em.remove(movie);
        em.getTransaction().commit();

         */
    }

    @Override
    @Transactional
    public void edit(User user) {
        //usersList.put(user.getId(), user);
        //Session session = sessionFactory.getCurrentSession();
        //session.update(user);
        /*
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(user);
        entityManager.getTransaction().commit();
        entityManager.close();

         */
    }

    @Override
    @Transactional
    public User getById(int id) {
        //return usersList.get(id);
        //Session session = sessionFactory.getCurrentSession();
        //return session.get(User.class, id);
        return null;
    }
}



 /*
    * public List<User> allUsers() {
        //entityManager.getEntityManager();
        //entityManager.getTransaction().begin();
        //entityManager.getTransaction().commit();
        List<User> list = new ArrayList();
        list.add(new User("name", 12, "m"));
        return list;//entityManager.createNamedQuery("from User", User.class).getResultList();
    }
    *     public static EntityManager getEntityManager() {
        return entityManager.createEntityManager();
    }
    * */