package ru.likekey.ytbot.vk.commands;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.messages.Keyboard;
import ru.likekey.ytbot.Application;
import ru.likekey.ytbot.services.UserServices;
import ru.likekey.ytbot.services.UserServicesImpl;

import java.util.Random;

public abstract class VkCommand {

    protected static UserServices userServices = new UserServicesImpl();

    private Integer vkId;

    public VkCommand(Integer vkId) {
        this.vkId = vkId;
    }

    public Integer getVkId() {
        return vkId;
    }

    public abstract void run() throws Exception;

    public void sendMessage(String msg) throws ClientException, ApiException {
        Application.vk().messages().send(Application.actor())
                .randomId(new Random().nextInt(10000))
                .message(msg)
                .peerId(getVkId()).execute();
    }

    public void sendMessage(String msg, Keyboard keyboard) throws ClientException, ApiException {
        Application.vk().messages().send(Application.actor())
                .randomId(new Random().nextInt(10000))
                .message(msg)
                .keyboard(keyboard)
                .peerId(getVkId()).execute();
    }

    public void sendMessage(String msg, Keyboard keyboard, String attachment) throws ClientException, ApiException {
        Application.vk().messages().send(Application.actor())
                .randomId(new Random().nextInt(10000))
                .message(msg)
                .keyboard(keyboard)
                .attachment(attachment)
                .peerId(getVkId()).execute();
    }
}
