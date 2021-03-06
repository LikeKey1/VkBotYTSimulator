package ru.likekey.ytbot.vk.commands.shop;

import ru.likekey.ytbot.entity.User;
import ru.likekey.ytbot.vk.commands.VkCommand;
import ru.likekey.ytbot.vk.keyboards.MyKeyboards;

public class ApparatusCommand extends VkCommand {

    public ApparatusCommand(Integer vkId) {
        super(vkId);
    }

    @Override
    public void run() throws Exception {
        User user = userServices.getUser(getVkId());
        user.setPlace("BUY_APPARATUS");
        userServices.updateUser(user);
        sendMessage("В этом разделе вы можете приобрести " +
                "аппаратуру и повысить количество просмотров за каждое видео.\n " +
                "А чем больше просмотров, тем больше подписчиков!", MyKeyboards.getApparatusKeyboard());
    }
}
