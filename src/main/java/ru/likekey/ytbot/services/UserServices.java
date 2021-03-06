package ru.likekey.ytbot.services;

import ru.likekey.ytbot.entity.Computer;
import ru.likekey.ytbot.entity.User;
import ru.likekey.ytbot.entity.UserDetail;

import java.util.List;

public interface UserServices {
    public void saveUser(User user);
    public void updateUser(User user);
    public User getUser(int vkId);
    public void checkUserInDB(int vkId);
    public List<User> getTopBySubscribers();
    public List<User> getTopByViews();
    public List<User> getTopByRating();
    public List<User> getTopByCoolness();

    public Computer getComputer(int id);
    public List<Computer> getUserComputers(int vkId);
    public void addComputerToUser(int vkId, Computer computer);
}
