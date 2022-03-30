package dao;


import model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryUtils;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public User findById(int id) {
        return  FactoryUtils.getSessionFactory().openSession().get(User.class, id);
    }

    @Override
    public List<User> findAll() {
        List<User> users = (List<User>)  FactoryUtils.getSessionFactory().
                openSession().createQuery("From User").list();
        return users;
    }

    @Override
    public void deleteById(User user) {
        Session session = FactoryUtils.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }

    @Override
    public void addUser(User user) {
        Session session = FactoryUtils.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }
}

