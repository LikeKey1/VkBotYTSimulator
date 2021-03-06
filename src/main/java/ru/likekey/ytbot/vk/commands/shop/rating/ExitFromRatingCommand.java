package ru.likekey.ytbot.vk.commands.shop.rating;

import ru.likekey.ytbot.vk.commands.VkCommand;
import ru.likekey.ytbot.vk.commands.main.ShopCommand;

public class ExitFromRatingCommand extends VkCommand {

    public ExitFromRatingCommand(Integer vkId) {
        super(vkId);
    }

    @Override
    public void run() throws Exception {
        new ShopCommand(getVkId()).run();
    }
}
