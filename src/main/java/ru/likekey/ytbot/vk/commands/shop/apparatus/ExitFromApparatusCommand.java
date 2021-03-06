package ru.likekey.ytbot.vk.commands.shop.apparatus;

import ru.likekey.ytbot.vk.commands.VkCommand;
import ru.likekey.ytbot.vk.commands.main.ShopCommand;

public class ExitFromApparatusCommand extends VkCommand {

    public ExitFromApparatusCommand(Integer vkId) {
        super(vkId);
    }

    @Override
    public void run() throws Exception {
        new ShopCommand(getVkId()).run();
    }
}
