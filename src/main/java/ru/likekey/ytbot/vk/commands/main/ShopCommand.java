package ru.likekey.ytbot.vk.commands.main;

import ru.likekey.ytbot.entity.User;
import ru.likekey.ytbot.vk.commands.VkCommand;
import ru.likekey.ytbot.vk.keyboards.MyKeyboards;

public class ShopCommand extends VkCommand {

    public ShopCommand(Integer vkId) {
        super(vkId);
    }

    @Override
    public void run() throws Exception {
        User user = userServices.getUser(getVkId());
        user.setPlace("SHOP");
        userServices.updateUser(user);
        sendMessage("Выберите раздел", MyKeyboards.getShopKeyboard());
    }
}
