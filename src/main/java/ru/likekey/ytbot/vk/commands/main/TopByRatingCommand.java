package ru.likekey.ytbot.vk.commands.main;

import com.vk.api.sdk.objects.users.responses.GetResponse;
import ru.likekey.ytbot.Application;
import ru.likekey.ytbot.entity.User;
import ru.likekey.ytbot.vk.commands.VkCommand;
import ru.likekey.ytbot.vk.keyboards.MyKeyboards;

import java.util.List;

public class TopByRatingCommand extends VkCommand {

    public TopByRatingCommand(Integer vkId) {
        super(vkId);
    }

    @Override
    public void run() throws Exception {
        List<User> users = userServices.getTopBySubscribers();
        String msg = "Топ по рейтингу:\n";
        for (int i = 0; i < 10; i++) {
            List<GetResponse> user = Application.vk().users().get(Application.actor()).userIds(
                    String.valueOf(users.get(i).getVkId())).execute();

            msg += (i+1) + ". @id" + users.get(i).getVkId() + " (" + user.get(0).getFirstName() + ") - " +
                    users.get(i).getDetails_id().getRating() + "\uD83D\uDC51\n";
        }
        sendMessage(msg, MyKeyboards.getRatingTopKeyboard());
    }
}
