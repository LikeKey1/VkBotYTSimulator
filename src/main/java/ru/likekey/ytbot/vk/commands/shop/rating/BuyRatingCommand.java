package ru.likekey.ytbot.vk.commands.shop.rating;

import ru.likekey.ytbot.entity.User;
import ru.likekey.ytbot.vk.commands.VkCommand;
import ru.likekey.ytbot.vk.keyboards.MyKeyboards;

public class BuyRatingCommand extends VkCommand {

    public BuyRatingCommand(Integer vkId) {
        super(vkId);
    }

    @Override
    public void run() throws Exception {
        User user = userServices.getUser(getVkId());
        user.setPlace("BUY_RATING");
        userServices.updateUser(user);

        sendMessage("Выберите количество рейтинга, которое хотите купить. \n" +
                "1 Рейтинг стоит 5000 подписчиков", MyKeyboards.getBuyRatingKeyboard());
    }
}
