package ru.likekey.ytbot.vk.commands.shop.apparatus.computers;

import ru.likekey.ytbot.vk.commands.VkCommand;
import ru.likekey.ytbot.vk.commands.shop.ApparatusCommand;

public class ExitFromComputersCommand extends VkCommand {

    public ExitFromComputersCommand(Integer vkId) {
        super(vkId);
    }

    @Override
    public void run() throws Exception {
        new ApparatusCommand(getVkId()).run();
    }
}
