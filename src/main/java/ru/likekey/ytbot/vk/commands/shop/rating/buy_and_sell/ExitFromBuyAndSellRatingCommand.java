package ru.likekey.ytbot.vk.commands.shop.rating.buy_and_sell;

import ru.likekey.ytbot.vk.commands.VkCommand;
import ru.likekey.ytbot.vk.commands.shop.RatingCommand;

public class ExitFromBuyAndSellRatingCommand extends VkCommand {

    public ExitFromBuyAndSellRatingCommand(Integer vkId) {
        super(vkId);
    }

    @Override
    public void run() throws Exception {
        new RatingCommand(getVkId()).run();
    }
}
