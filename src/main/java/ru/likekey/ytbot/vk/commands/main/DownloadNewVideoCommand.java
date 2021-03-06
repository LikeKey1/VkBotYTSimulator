package ru.likekey.ytbot.vk.commands.main;

import ru.likekey.ytbot.entity.User;
import ru.likekey.ytbot.entity.UserDetail;
import ru.likekey.ytbot.vk.commands.VkCommand;

public class DownloadNewVideoCommand extends VkCommand {

    public DownloadNewVideoCommand(Integer vkId) {
        super(vkId);
    }

    @Override
    public void run() throws Exception {
        sendMessage("Вы загружаете видео...\n\n");

        User user = userServices.getUser(getVkId());
        UserDetail userDetail = user.getDetails_id();

        String msg = "Вы загрузили видео и получили:\n";

        userDetail.setMes_sent(userDetail.getMes_sent()+1);
        userDetail.setVideos(userDetail.getVideos()+1);

        int power = userDetail.getPower();
        userDetail.setViews(userDetail.getViews()+power);

        int subscribers = (int) (userDetail.getPower() / 5);
        userDetail.setSubscribers(userDetail.getSubscribers() + subscribers);

        msg += "   \uD83D\uDCFA Просмотров: " + power +
                "   \n\uD83D\uDC6B Подписчиков: " + subscribers;

        userServices.updateUser(user);

        sendMessage(msg);
    }
}
