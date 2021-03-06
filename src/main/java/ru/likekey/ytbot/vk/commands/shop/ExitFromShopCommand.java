package ru.likekey.ytbot.vk.commands.shop;

import ru.likekey.ytbot.entity.User;
import ru.likekey.ytbot.vk.commands.VkCommand;
import ru.likekey.ytbot.vk.keyboards.MyKeyboards;

public class ExitFromShopCommand extends VkCommand {

    public ExitFromShopCommand(Integer vkId) {
        super(vkId);
    }

    @Override
    public void run() throws Exception {
        User user = userServices.getUser(getVkId());
        user.setPlace("MAIN");
        userServices.updateUser(user);
        sendMessage("Вы вернулись в главное меню!", MyKeyboards.getStartKeyboard());
    }
}
