package ru.likekey.ytbot.dao;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.likekey.ytbot.entity.Computer;
import ru.likekey.ytbot.entity.User;
import ru.likekey.ytbot.entity.UserDetail;

import java.util.List;

public class ComputerDaoImpl implements ComputerDao {

    private static SessionFactory sessionFactory;

    private UserDAO userDAO = new UserDAOImpl();

    public ComputerDaoImpl() {
        if (sessionFactory == null) {
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(User.class)
                    .addAnnotatedClass(Computer.class)
                    .addAnnotatedClass(UserDetail.class)
                    .buildSessionFactory();
        }
    }

    @Override
    public Computer getComputer(int id) {
        Session session = sessionFactory.getCurrentSession();
        List<Computer> computers;
        try {
            session.beginTransaction();
            computers = session.createQuery("from Computer where id = " + id).getResultList();
        } finally {
            session.getTransaction().commit();
        }
        return computers.get(0);
    }

    @Override
    public List<Computer> getUserComputers(int vkId) {
        Session session = sessionFactory.getCurrentSession();
        List<Computer> computers;
        try {
            session.beginTransaction();
            List<User> users = session.createQuery("from User where vkId = " + vkId).getResultList();
            User user = users.get(0);
            Hibernate.initialize(user.getComputers());
            computers = user.getComputers();
        } finally {
            session.getTransaction().commit();
        }
        return computers;
    }

    @Override
    public void addComputerToUser(int vkId, Computer computer) {
        Session session = sessionFactory.getCurrentSession();
        User user;
        try {
            session.beginTransaction();
            List<User> users = session.createQuery("from User where vkId = " + vkId).getResultList();
            user = users.get(0);
            Hibernate.initialize(user.getComputers());
            user.addComputerToUser(computer);
        } finally {
            session.getTransaction().commit();
        }
        userDAO.updateUser(user);
    }
}
