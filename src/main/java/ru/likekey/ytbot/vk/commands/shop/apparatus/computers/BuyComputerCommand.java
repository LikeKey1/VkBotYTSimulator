package ru.likekey.ytbot.vk.commands.shop.apparatus.computers;

import com.vk.api.sdk.objects.messages.Keyboard;
import ru.likekey.ytbot.entity.Computer;
import ru.likekey.ytbot.entity.User;
import ru.likekey.ytbot.entity.UserDetail;
import ru.likekey.ytbot.vk.commands.VkCommand;
import ru.likekey.ytbot.vk.commands.shop.apparatus.ComputersCommand;
import ru.likekey.ytbot.vk.keyboards.MyKeyboards;

import java.util.List;

public class BuyComputerCommand extends VkCommand {

    private int computerId;

    public BuyComputerCommand(Integer vkId, int computerId) {
        super(vkId);
        this.computerId = computerId;
    }

    @Override
    public void run() throws Exception {
        sendMessage("Компьютер покупается...");

        User user = userServices.getUser(getVkId());
        UserDetail userDetail = user.getDetails_id();
        Computer computer = userServices.getComputer(computerId);

        List<Computer> userComputers = userServices.getUserComputers(getVkId());

        boolean checker = true;
        for (Computer computer1 : userComputers) {
            if (computer.getId() == computer1.getId()) checker = false;
        }

        if (checker) {
            int subscribers = userDetail.getSubscribers();
            int price = computer.getPrice();
            if (subscribers >= price) {
                userServices.addComputerToUser(getVkId(), computer);
                userDetail.setSubscribers(subscribers-price);
                userDetail.setPower(userDetail.getPower()+computer.getPower());
                userServices.updateUser(user);

                Keyboard keyboard;

                if (computerId == ComputersCommand.totalComputers) {
                    keyboard = MyKeyboards.getBuyingKeyboard(computerId-1, 1);
                } else if (computerId == 1) {
                    keyboard = MyKeyboards.getBuyingKeyboard(ComputersCommand.totalComputers, 2);
                } else {
                    keyboard = MyKeyboards.getBuyingKeyboard(computerId-1, computerId+1);
                }

                sendMessage("Ты купил новый компьютер! Теперь ты будешь получать на " +
                        computer.getPower() + " \uD83D\uDCFAпросмотров больше за каждое видео!", keyboard);
            } else {
                sendMessage("Тебе не хватает " + (price - subscribers) + " подписчиков для покупки:(");
            }
        } else {
            sendMessage("Вы уже купили этот компьютер!");
        }

    }
}
