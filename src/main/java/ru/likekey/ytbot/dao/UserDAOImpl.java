package ru.likekey.ytbot.dao;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.likekey.ytbot.entity.Computer;
import ru.likekey.ytbot.entity.User;
import ru.likekey.ytbot.entity.UserDetail;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    private static SessionFactory sessionFactory;

    public UserDAOImpl() {
        if (sessionFactory == null) {
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(User.class)
                    .addAnnotatedClass(UserDetail.class)
                    .addAnnotatedClass(Computer.class)
                    .buildSessionFactory();
        }
    }

    @Override
    public void saveUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            UserDetail userDetail = new UserDetail();
            user.setDetails_id(userDetail);
            session.save(user);
        } finally {
            session.getTransaction().commit();
        }
    }

    @Override
    public void updateUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            session.saveOrUpdate(user);
        } finally {
            session.getTransaction().commit();
        }
    }

    @Override
    public User getUser(int vkId) {
        Session session = sessionFactory.getCurrentSession();
        List<User> user;
        try {
            session.beginTransaction();
            user = session.createQuery("from User where vkId = " + vkId).getResultList();
        } finally {
            session.getTransaction().commit();
        }
        if (user.size() == 0) return null;
        return user.get(0);
    }

    @Override
    public void checkUserInDB(int vkId) {
        User user = getUser(vkId);
        if (user == null) {
            User newUser = new User(vkId);
            saveUser(newUser);
        }
    }

    @Override
    public List<User> getTopBySubscribers() {
        Session session = sessionFactory.getCurrentSession();
        List<UserDetail> users;
        List<User> readyUsers = new ArrayList<>();
        try {
            session.beginTransaction();
            users = session.createQuery("from UserDetail order by subscribers desc").setMaxResults(10).getResultList();
            for (UserDetail userDetail : users) {
                Hibernate.initialize(userDetail);
                readyUsers.add(userDetail.getUsers_id());
            }
        } finally {
            session.getTransaction().commit();
        }
        return readyUsers;
    }

    @Override
    public List<User> getTopByViews() {
        Session session = sessionFactory.getCurrentSession();
        List<UserDetail> users;
        List<User> readyUsers = new ArrayList<>();
        try {
            session.beginTransaction();
            users = session.createQuery("from UserDetail order by views desc").setMaxResults(10).getResultList();
            for (UserDetail userDetail : users) {
                Hibernate.initialize(userDetail);
                readyUsers.add(userDetail.getUsers_id());
            }
        } finally {
            session.getTransaction().commit();
        }
        return readyUsers;
    }

    @Override
    public List<User> getTopByRating() {
        Session session = sessionFactory.getCurrentSession();
        List<UserDetail> users;
        List<User> readyUsers = new ArrayList<>();
        try {
            session.beginTransaction();
            users = session.createQuery("from UserDetail order by rating desc").setMaxResults(10).getResultList();
            for (UserDetail userDetail : users) {
                Hibernate.initialize(userDetail);
                readyUsers.add(userDetail.getUsers_id());
            }
        } finally {
            session.getTransaction().commit();
        }
        return readyUsers;
    }

    @Override
    public List<User> getTopByCoolness() {
        Session session = sessionFactory.getCurrentSession();
        List<UserDetail> users;
        List<User> readyUsers = new ArrayList<>();
        try {
            session.beginTransaction();
            users = session.createQuery("from UserDetail order by coolness desc").setMaxResults(10).getResultList();
            for (UserDetail userDetail : users) {
                Hibernate.initialize(userDetail);
                readyUsers.add(userDetail.getUsers_id());
            }
        } finally {
            session.getTransaction().commit();
        }
        return readyUsers;
    }
}
