package ru.likekey.ytbot.vk.commands.shop.rating.buy_and_sell;

import ru.likekey.ytbot.entity.User;
import ru.likekey.ytbot.entity.UserDetail;
import ru.likekey.ytbot.vk.commands.VkCommand;

public class BuyingRatingCommand extends VkCommand {

    private int totalRating;

    public BuyingRatingCommand(Integer vkId, int totalRating) {
        super(vkId);
        this.totalRating = totalRating;
    }

    @Override
    public void run() throws Exception {
        User user = userServices.getUser(getVkId());
        UserDetail userDetail = user.getDetails_id();

        if (userDetail.getSubscribers() >= (totalRating*5000)) {
            userDetail.setSubscribers(userDetail.getSubscribers()-totalRating*5000);
            userDetail.setRating(userDetail.getRating()+totalRating);
            sendMessage("Ты увеличил свой рейтинг! Теперь он равен: " + userDetail.getRating() + "\uD83D\uDC51");
            userServices.updateUser(user);
        } else {
            sendMessage("Для покупки " + totalRating + "\uD83D\uDC51 рейтинга тебе не хватает " + (totalRating*5000-userDetail.getSubscribers()) +
                    "\uD83D\uDC6B подписчиков!");
        }
    }
}
