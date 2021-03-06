package ru.likekey.ytbot.vk.commands.shop;

import ru.likekey.ytbot.entity.User;
import ru.likekey.ytbot.vk.commands.VkCommand;
import ru.likekey.ytbot.vk.keyboards.MyKeyboards;

public class RatingCommand extends VkCommand {

    public RatingCommand(Integer vkId) {
        super(vkId);
    }

    @Override
    public void run() throws Exception {
        User user = userServices.getUser(getVkId());
        user.setPlace("RATING");
        userServices.updateUser(user);
        sendMessage("В этом разделе вы можете приобрести " +
                "или продать рейтинг", MyKeyboards.getRatingKeyboard());
    }
}
