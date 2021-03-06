package ru.likekey.ytbot.dao;

import ru.likekey.ytbot.entity.Computer;
import ru.likekey.ytbot.entity.User;
import ru.likekey.ytbot.entity.UserDetail;

import java.util.List;

public interface UserDAO {
    public void saveUser(User user);
    public void updateUser(User user);
    public User getUser(int vkId);
    public void checkUserInDB(int vkId);
    public List<User> getTopBySubscribers();
    public List<User> getTopByViews();
    public List<User> getTopByRating();
    public List<User> getTopByCoolness();
}
