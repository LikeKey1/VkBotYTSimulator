package ru.likekey.ytbot.vk.commands.shop.apparatus.computers;

import ru.likekey.ytbot.entity.Computer;
import ru.likekey.ytbot.entity.User;
import ru.likekey.ytbot.vk.commands.VkCommand;
import ru.likekey.ytbot.vk.commands.shop.apparatus.ComputersCommand;
import ru.likekey.ytbot.vk.keyboards.MyKeyboards;

import java.util.List;

public class TheNextComputerCommand extends VkCommand {

    private int computerId;

    public TheNextComputerCommand(Integer vkId, int computerId) {
        super(vkId);
        this.computerId = computerId;
    }

    @Override
    public void run() throws Exception {
        Computer computer;
        try {
            computer = userServices.getComputer(computerId);
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            sendMessage("Такого фото нет!");
            return;
        }
        User user = userServices.getUser(getVkId());
        List<Computer> userComputers = userServices.getUserComputers(getVkId());

        boolean checker = true;
        for (Computer computer1 : userComputers) {
            if (computer.getId() == computer1.getId()) checker = false;
        }

        String msg = computer.getName() +
                "\nЦена: " + computer.getPrice() + "\uD83D\uDC6B Подписчиков" +
                "\nДобавит: " + computer.getPower() + "\uD83D\uDCFA Просмотров за видео";

        if (checker) {
            if (computerId == ComputersCommand.totalComputers) {
                sendMessage(msg, MyKeyboards.getBuyingKeyboard(computerId-1, computerId, 1), computer.getPhoto());
            } else if (computerId == 1) {
                sendMessage(msg, MyKeyboards.getBuyingKeyboard(ComputersCommand.totalComputers, computerId, 2), computer.getPhoto());
            } else {
                sendMessage(msg, MyKeyboards.getBuyingKeyboard(computerId-1, computerId, computerId+1), computer.getPhoto());
            }
        } else {
            if (computerId == ComputersCommand.totalComputers) {
                sendMessage(msg, MyKeyboards.getBuyingKeyboard(computerId-1, 1), computer.getPhoto());
            } else if (computerId == 1) {
                sendMessage(msg, MyKeyboards.getBuyingKeyboard(ComputersCommand.totalComputers, 2), computer.getPhoto());
            } else {
                sendMessage(msg, MyKeyboards.getBuyingKeyboard(computerId-1, computerId+1), computer.getPhoto());
            }
        }
    }
}
