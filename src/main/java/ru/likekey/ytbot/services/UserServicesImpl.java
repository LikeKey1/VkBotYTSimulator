package ru.likekey.ytbot.services;

import ru.likekey.ytbot.dao.ComputerDao;
import ru.likekey.ytbot.dao.ComputerDaoImpl;
import ru.likekey.ytbot.dao.UserDAO;
import ru.likekey.ytbot.dao.UserDAOImpl;
import ru.likekey.ytbot.entity.Computer;
import ru.likekey.ytbot.entity.User;

import java.util.List;

public class UserServicesImpl implements UserServices {

    private UserDAO userDAO = new UserDAOImpl();
    private ComputerDao computerDao = new ComputerDaoImpl();

    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public User getUser(int vkId) {
        return userDAO.getUser(vkId);
    }

    @Override
    public void checkUserInDB(int vkId) {
        userDAO.checkUserInDB(vkId);
    }

    @Override
    public List<User> getTopBySubscribers() {
        return userDAO.getTopBySubscribers();
    }

    @Override
    public List<User> getTopByViews() {
        return userDAO.getTopByViews();
    }

    @Override
    public List<User> getTopByRating() {
        return userDAO.getTopByRating();
    }

    @Override
    public List<User> getTopByCoolness() {
        return userDAO.getTopByCoolness();
    }

    @Override
    public Computer getComputer(int id) {
        return computerDao.getComputer(id);
    }

    @Override
    public List<Computer> getUserComputers(int vkId) {
        return computerDao.getUserComputers(vkId);
    }

    @Override
    public void addComputerToUser(int vkId, Computer computer) {
        computerDao.addComputerToUser(vkId, computer);
    }
}
