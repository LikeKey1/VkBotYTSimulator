package ru.likekey.ytbot.vk.commands.shop.rating;

import ru.likekey.ytbot.entity.User;
import ru.likekey.ytbot.vk.commands.VkCommand;
import ru.likekey.ytbot.vk.keyboards.MyKeyboards;

public class SellRatingCommand extends VkCommand {

    public SellRatingCommand(Integer vkId) {
        super(vkId);
    }

    @Override
    public void run() throws Exception {
        User user = userServices.getUser(getVkId());
        user.setPlace("SELL_RATING");
        userServices.updateUser(user);

        sendMessage("Выберите количество рейтинга, которое хотите продать. \n1 Рейтинг стоит 1000 подписчиков",
                MyKeyboards.getSellRatingKeyboard());
    }
}
