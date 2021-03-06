package ru.likekey.ytbot.dao;

import ru.likekey.ytbot.entity.Computer;

import java.util.List;

public interface ComputerDao {
    public Computer getComputer(int id);
    public List<Computer> getUserComputers(int vkId);
    public void addComputerToUser(int vkId, Computer computer);
}
