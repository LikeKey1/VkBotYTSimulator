package ru.likekey.ytbot.vk;

import com.vk.api.sdk.callback.CallbackApi;
import com.vk.api.sdk.objects.messages.Message;
import ru.likekey.ytbot.entity.User;
import ru.likekey.ytbot.services.UserServices;
import ru.likekey.ytbot.services.UserServicesImpl;
import ru.likekey.ytbot.vk.commands.shop.RatingCommand;
import ru.likekey.ytbot.vk.commands.shop.apparatus.ComputersCommand;
import ru.likekey.ytbot.vk.commands.shop.apparatus.ExitFromApparatusCommand;
import ru.likekey.ytbot.vk.commands.shop.apparatus.computers.BuyComputerCommand;
import ru.likekey.ytbot.vk.commands.shop.apparatus.computers.ExitFromComputersCommand;
import ru.likekey.ytbot.vk.commands.shop.apparatus.computers.TheNextComputerCommand;
import ru.likekey.ytbot.vk.commands.main.*;
import ru.likekey.ytbot.vk.commands.shop.ApparatusCommand;
import ru.likekey.ytbot.vk.commands.shop.ExitFromShopCommand;
import ru.likekey.ytbot.vk.commands.shop.rating.BuyRatingCommand;
import ru.likekey.ytbot.vk.commands.shop.rating.ExitFromRatingCommand;
import ru.likekey.ytbot.vk.commands.shop.rating.buy_and_sell.BuyingRatingCommand;
import ru.likekey.ytbot.vk.commands.shop.rating.buy_and_sell.ExitFromBuyAndSellRatingCommand;
import ru.likekey.ytbot.vk.commands.shop.rating.SellRatingCommand;
import ru.likekey.ytbot.vk.commands.shop.rating.buy_and_sell.SellingRatingCommand;

public class MessagesHandler extends CallbackApi {

    private static final UserServices userService = new UserServicesImpl();

    @Override
    public void messageNew(Integer groupId, Message message) {
        parseMessage(groupId, message);
    }

    public static void parseMessage(Integer groupId, Message message) {
        Integer vkId = message.getFromId();
        String[] args = message.getText().split(" ");
        String command = args[0].toLowerCase();

        userService.checkUserInDB(vkId);
        User user = userService.getUser(vkId);
        try {
            switch (user.getPlace()) {
                case "MAIN":
                    switch (command) {
                        case "начать":
                            new StartCommand(vkId).run();
                            break;

                        case "профиль":
                            new ProfileCommand(vkId).run();
                            break;

                        case "выложить":
                            new DownloadNewVideoCommand(vkId).run();
                            break;

                        case "магазин":
                            new ShopCommand(vkId).run();
                            break;

                        case "топ":
                            new TopBySubscribersCommand(vkId).run();
                            break;

                        case "по":
                            if (args.length > 1) {
                                switch (args[1]) {
                                    case "просмотрам":
                                        new TopByViewsCommand(vkId).run();
                                        break;

                                    case "рейтингу":
                                        new TopByRatingCommand(vkId).run();
                                        break;

                                    case "подписчикам":
                                        new TopBySubscribersCommand(vkId).run();
                                        break;

                                    case "крутости":
                                        new TopByCoolnessCommand(vkId).run();
                                        break;
                                }
                            }
                            break;
                    }
                    break;

                case "SHOP":
                    switch (command) {
                        case "назад":
                            new ExitFromShopCommand(vkId).run();
                            break;

                        case "аппаратура":
                            new ApparatusCommand(vkId).run();
                            break;

                        case "рейтинг":
                            new RatingCommand(vkId).run();
                            break;
                    }
                    break;

                case "BUY_APPARATUS":
                    switch (command) {
                        case "назад":
                            new ExitFromApparatusCommand(vkId).run();
                            break;

                        case "компьютеры":
                            new ComputersCommand(vkId).run();
                            break;
                    }
                    break;

                case "BUY_COMPUTERS":
                    switch (command) {
                        case "назад":
                            new ExitFromComputersCommand(vkId).run();
                            break;

                        case "следующее":
                        case "предыдущее":
                            if (args.length > 1) new TheNextComputerCommand(vkId, Integer.parseInt(args[1])).run();
                            break;

                        case "купить":
                            if (args.length > 1) new BuyComputerCommand(vkId, Integer.parseInt(args[1])).run();
                            break;
                    }
                    break;

                case "RATING":
                    switch (command) {
                        case "назад":
                            new ExitFromRatingCommand(vkId).run();
                            break;

                        case "купить":
                            if (args.length > 1) new BuyRatingCommand(vkId).run();
                            break;

                        case "продать":
                            if (args.length > 1) new SellRatingCommand(vkId).run();
                            break;
                    }
                    break;

                case "BUY_RATING":
                    switch (command) {
                        case "назад":
                            new ExitFromBuyAndSellRatingCommand(vkId).run();
                            break;

                        case "купить":
                            if (args.length > 1) new BuyingRatingCommand(vkId, Integer.parseInt(args[1])).run();
                            break;
                    }
                    break;

                case "SELL_RATING":
                    switch (command) {
                        case "назад":
                            new ExitFromBuyAndSellRatingCommand(vkId).run();
                            break;

                        case "продать":
                            if (args.length > 1) new SellingRatingCommand(vkId, Integer.parseInt(args[1])).run();
                            break;
                    }

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
