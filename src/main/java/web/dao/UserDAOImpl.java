package web.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.User;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class UserDAOImpl implements UserDAO {
    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, User> usersList = new HashMap<>();

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    //@SupressWarning("unchecked")
    public List<User> allUsers() {
        //return new ArrayList<>(usersList.values());
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from User").list();
    }

    @Override
    public void add(User user) {
        //user.setId(AUTO_ID.getAndIncrement());
        //usersList.put(user.getId(), user);
        Session session = sessionFactory.getCurrentSession();
        session.persist(user);
        //session.save(user);
    }

    @Override
    public void delete(User user) {
        //usersList.remove(user.getId());
        Session session = sessionFactory.getCurrentSession();
        session.delete(user);
        //session.remove(user);
    }

    @Override
    public void edit(User user) {
        //usersList.put(user.getId(), user);
        Session session = sessionFactory.getCurrentSession();
        session.update(user);
    }

    @Override
    public User getById(int id) {
        //return usersList.get(id);
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }
}

