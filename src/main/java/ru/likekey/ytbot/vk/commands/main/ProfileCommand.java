package ru.likekey.ytbot.vk.commands.main;

import ru.likekey.ytbot.entity.User;
import ru.likekey.ytbot.vk.commands.VkCommand;
import ru.likekey.ytbot.vk.keyboards.MyKeyboards;

public class ProfileCommand extends VkCommand {

    public ProfileCommand(Integer vkId) {
        super(vkId);
    }

    @Override
    public void run() throws Exception {
        User user = userServices.getUser(getVkId());
        String msg = "Ваш профиль:" +
                "\n\uD83D\uDD0E ID: " + user.getId() +
                "\n\uD83D\uDC51 Рейтинг: " + user.getDetails_id().getRating() +
                "\n\uD83D\uDCFA Просмотров: " + user.getDetails_id().getViews() +
                "\n\uD83D\uDCFD Видео: " + user.getDetails_id().getVideos() +
                "\n\uD83D\uDC6B Подписчиков: " + user.getDetails_id().getSubscribers() +
                "\n\uD83D\uDD38 Крутость: " + user.getDetails_id().getCoolness();

        sendMessage(msg, MyKeyboards.getStartKeyboard());
    }
}
