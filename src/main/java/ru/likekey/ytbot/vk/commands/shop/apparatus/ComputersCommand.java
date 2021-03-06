package ru.likekey.ytbot.vk.commands.shop.apparatus;

import ru.likekey.ytbot.entity.Computer;
import ru.likekey.ytbot.entity.User;
import ru.likekey.ytbot.vk.commands.VkCommand;
import ru.likekey.ytbot.vk.keyboards.MyKeyboards;

import java.util.List;

public class ComputersCommand extends VkCommand {

    public final static int totalComputers = 10;

    public ComputersCommand(Integer vkId) {
        super(vkId);
    }

    @Override
    public void run() throws Exception {
        sendMessage("Загрузка компьютеров...");

        User user = userServices.getUser(getVkId());
        user.setPlace("BUY_COMPUTERS");
        userServices.updateUser(user);

        Computer computer = userServices.getComputer(1);

        String msg = computer.getName() +
                "\nЦена: " + computer.getPrice() + "\uD83D\uDC6B Подписчиков" +
                "\nДобавит: " + computer.getPower() + "\uD83D\uDCFA Просмотров за видео";

        boolean checker = true;
        List<Computer> userComputers = userServices.getUserComputers(getVkId());
        for (Computer computer1 : userComputers) {
            if (computer.getId() == computer1.getId()) checker = false;
        }
        if (checker) {
            sendMessage(msg, MyKeyboards.getBuyingKeyboard(totalComputers, 1, 2), computer.getPhoto());
        } else {
            sendMessage(msg, MyKeyboards.getBuyingKeyboard(totalComputers, 2), computer.getPhoto());
        }
    }
}
