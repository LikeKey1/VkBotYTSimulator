package ru.likekey.ytbot.vk.commands.main;

import ru.likekey.ytbot.vk.commands.VkCommand;
import ru.likekey.ytbot.vk.keyboards.MyKeyboards;

public class StartCommand extends VkCommand  {

    public StartCommand(Integer vkId) {
        super(vkId);
    }

    @Override
    public void run() throws Exception {
        userServices.checkUserInDB(getVkId());

        sendMessage("Добро пожаловать в игровой бот Симулятор Ютюбера!\n" +
                "Здесь вы можете почувствовать себя настоящим ютюбером - выкладывайте видео, " +
                "получайте просмотры, привлейкайте подписчиков и выходите в топы лучших каналов!", MyKeyboards.getStartKeyboard());
    }
}
