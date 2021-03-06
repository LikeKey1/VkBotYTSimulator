package ru.likekey.ytbot.vk.commands.shop.rating.buy_and_sell;

import ru.likekey.ytbot.entity.User;
import ru.likekey.ytbot.entity.UserDetail;
import ru.likekey.ytbot.vk.commands.VkCommand;

public class SellingRatingCommand extends VkCommand {

    private int totalRating;

    public SellingRatingCommand(Integer vkId, int totalRating) {
        super(vkId);
        this.totalRating = totalRating;
    }

    @Override
    public void run() throws Exception {
        User user = userServices.getUser(getVkId());
        UserDetail userDetail = user.getDetails_id();

        if (userDetail.getRating() >= totalRating) {
            userDetail.setSubscribers(userDetail.getSubscribers()+totalRating*1000);
            userDetail.setRating(userDetail.getRating()-totalRating);
            userServices.updateUser(user);
            sendMessage("Вы продали " + totalRating + "\uD83D\uDC51 рейтинга за " +
                    totalRating*1000 + "\uD83D\uDC6B подписчиков. Теперь у вас " + userDetail.getSubscribers() +
                    "\uD83D\uDC6B подписчиков!");
        } else {
            sendMessage("У вас недостаточно рейтинга!");
        }
    }
}
