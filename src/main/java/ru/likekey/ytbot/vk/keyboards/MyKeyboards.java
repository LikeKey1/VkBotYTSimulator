package ru.likekey.ytbot.vk.keyboards;

import com.vk.api.sdk.objects.messages.*;

import java.util.ArrayList;
import java.util.List;

public class MyKeyboards {

    // MAIN
    private static Keyboard startKeyboard;
    private static Keyboard shopKeyboard;

    //SHOP
    private static Keyboard apparatusKeyboard;
    private static Keyboard ratingKeyboard;

    private static Keyboard buyRatingKeyboard;
    private static Keyboard sellRatingKeyboard;

    // Top
    private static Keyboard subscribersTopKeyboard;
    private static Keyboard viewsTopKeyboard;
    private static Keyboard ratingTopKeyboard;
    private static Keyboard coolnessTopKeyboard;


    public static Keyboard getStartKeyboard() {
        if (startKeyboard == null) {
            startKeyboard = new Keyboard();

            List<List<KeyboardButton>> allKey = new ArrayList<>();

            List<KeyboardButton> line1 = new ArrayList<>();
            List<KeyboardButton> line2 = new ArrayList<>();
            List<KeyboardButton> line3 = new ArrayList<>();

            line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Профиль").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));
            line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Выложить видео").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));
            line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Магазин").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));
            line3.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Топ").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));

            allKey.add(line1);
            allKey.add(line2);
            allKey.add(line3);

            startKeyboard.setButtons(allKey);
        }
        return startKeyboard;
    }

    public static Keyboard getShopKeyboard() {
        if (shopKeyboard == null) {
            shopKeyboard = new Keyboard();

            List<List<KeyboardButton>> allKey = new ArrayList<>();

            List<KeyboardButton> line1 = new ArrayList<>();
            List<KeyboardButton> line2 = new ArrayList<>();
            List<KeyboardButton> line4 = new ArrayList<>();

            line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Аппаратура").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));
            line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Рейтинг").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));

            line4.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Назад").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.DEFAULT));

            allKey.add(line1);
            allKey.add(line2);
            allKey.add(line4);

            shopKeyboard.setButtons(allKey);
        }
        return shopKeyboard;
    }

    public static Keyboard getApparatusKeyboard() {
        if (apparatusKeyboard == null) {
            apparatusKeyboard = new Keyboard();

            List<List<KeyboardButton>> allKey = new ArrayList<>();

            List<KeyboardButton> line1 = new ArrayList<>();
            List<KeyboardButton> line2 = new ArrayList<>();
            List<KeyboardButton> line4 = new ArrayList<>();

            line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Компьютеры").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));
            line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Мониторы").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));
            line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Камеры").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));
            line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Микрофоны").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));

            line4.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Назад").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.DEFAULT));

            allKey.add(line1);
            allKey.add(line2);
            allKey.add(line4);

            apparatusKeyboard.setButtons(allKey);
        }
        return apparatusKeyboard;
    }

    public static Keyboard getRatingKeyboard() {
        if (ratingKeyboard == null) {
            ratingKeyboard = new Keyboard();

            List<List<KeyboardButton>> allKey = new ArrayList<>();

            List<KeyboardButton> line1 = new ArrayList<>();
            List<KeyboardButton> line2 = new ArrayList<>();
            List<KeyboardButton> line4 = new ArrayList<>();

            line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Купить рейтинг").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));

            line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Продать рейтинг").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));

            line4.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Назад").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.DEFAULT));

            allKey.add(line1);
            allKey.add(line2);
            allKey.add(line4);

            ratingKeyboard.setButtons(allKey);
        }
        return ratingKeyboard;
    }

    public static Keyboard getBuyRatingKeyboard() {
        if (buyRatingKeyboard == null) {
            buyRatingKeyboard = new Keyboard();

            List<List<KeyboardButton>> allKey = new ArrayList<>();

            List<KeyboardButton> line1 = new ArrayList<>();
            List<KeyboardButton> line2 = new ArrayList<>();
            List<KeyboardButton> line3 = new ArrayList<>();
            List<KeyboardButton> line4 = new ArrayList<>();
            List<KeyboardButton> line5 = new ArrayList<>();
            List<KeyboardButton> line6 = new ArrayList<>();

            line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Купить 1 \uD83D\uDC51").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));
            line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Купить 5 \uD83D\uDC51").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));
            line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Купить 15 \uD83D\uDC51").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));

            line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Купить 50 \uD83D\uDC51").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));
            line3.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Купить 100 \uD83D\uDC51").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));
            line3.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Купить 250 \uD83D\uDC51").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));

            line4.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Купить 500 \uD83D\uDC51").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));
            line4.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Купить 1000 \uD83D\uDC51").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));
            line5.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Купить 2500 \uD83D\uDC51").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));

            line6.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Назад").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.DEFAULT));

            allKey.add(line1);
            allKey.add(line2);
            allKey.add(line3);
            allKey.add(line4);
            allKey.add(line5);
            allKey.add(line6);

            buyRatingKeyboard.setButtons(allKey);
        }
        return buyRatingKeyboard;
    }

    public static Keyboard getSellRatingKeyboard() {
        if (sellRatingKeyboard == null) {
            sellRatingKeyboard = new Keyboard();

            List<List<KeyboardButton>> allKey = new ArrayList<>();

            List<KeyboardButton> line1 = new ArrayList<>();
            List<KeyboardButton> line2 = new ArrayList<>();
            List<KeyboardButton> line3 = new ArrayList<>();
            List<KeyboardButton> line4 = new ArrayList<>();
            List<KeyboardButton> line5 = new ArrayList<>();
            List<KeyboardButton> line6 = new ArrayList<>();

            line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Продать 1 \uD83D\uDC51").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));
            line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Продать 5 \uD83D\uDC51").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));
            line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Продать 15 \uD83D\uDC51").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));

            line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Продать 50 \uD83D\uDC51").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));
            line3.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Продать 100 \uD83D\uDC51").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));
            line3.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Продать 250 \uD83D\uDC51").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));

            line4.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Продать 500 \uD83D\uDC51").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));
            line4.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Продать 1000 \uD83D\uDC51").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));
            line5.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Продать 2500 \uD83D\uDC51").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));

            line6.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Назад").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.DEFAULT));

            allKey.add(line1);
            allKey.add(line2);
            allKey.add(line3);
            allKey.add(line4);
            allKey.add(line5);
            allKey.add(line6);

            sellRatingKeyboard.setButtons(allKey);
        }
        return sellRatingKeyboard;
    }

    public static Keyboard getBuyingKeyboard(int previous, int present, int next) {
        Keyboard keyboard = new Keyboard();

        List<List<KeyboardButton>> allKey = new ArrayList<>();

        List<KeyboardButton> line1 = new ArrayList<>();
        List<KeyboardButton> line2 = new ArrayList<>();
        List<KeyboardButton> line4 = new ArrayList<>();

        line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Предыдущее " + previous).setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));
        line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Следующее " + next).setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));

        line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Купить " + present).setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));

        line4.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Назад").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.DEFAULT));

        allKey.add(line1);
        allKey.add(line2);
        allKey.add(line4);

        keyboard.setButtons(allKey);

        return keyboard;
    }

    public static Keyboard getBuyingKeyboard(int previous, int next) {
        Keyboard keyboard = new Keyboard();

        List<List<KeyboardButton>> allKey = new ArrayList<>();

        List<KeyboardButton> line1 = new ArrayList<>();
        List<KeyboardButton> line2 = new ArrayList<>();
        List<KeyboardButton> line4 = new ArrayList<>();

        line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Предыдущее " + previous).setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));
        line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Следующее " + next).setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.PRIMARY));

        line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Уже куплено!").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.NEGATIVE));

        line4.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("Назад").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.DEFAULT));

        allKey.add(line1);
        allKey.add(line2);
        allKey.add(line4);

        keyboard.setButtons(allKey);

        return keyboard;
    }

    public static Keyboard getSubscribersTopKeyboard() {
        if (subscribersTopKeyboard == null) {
            subscribersTopKeyboard = new Keyboard();

            List<List<KeyboardButton>> allKey = new ArrayList<>();

            List<KeyboardButton> line1 = new ArrayList<>();
            List<KeyboardButton> line2 = new ArrayList<>();
            List<KeyboardButton> line3 = new ArrayList<>();

            line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("По просмотрам").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.POSITIVE));
            line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("По рейтингу").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.POSITIVE));
            line3.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("По крутости").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.POSITIVE));

            allKey.add(line1);
            allKey.add(line2);
            allKey.add(line3);

            subscribersTopKeyboard.setButtons(allKey);
            subscribersTopKeyboard.setInline(true);
        }
        return subscribersTopKeyboard;
    }

    public static Keyboard getViewsTopKeyboard() {
        if (viewsTopKeyboard == null) {
            viewsTopKeyboard = new Keyboard();

            List<List<KeyboardButton>> allKey = new ArrayList<>();

            List<KeyboardButton> line1 = new ArrayList<>();
            List<KeyboardButton> line2 = new ArrayList<>();
            List<KeyboardButton> line3 = new ArrayList<>();

            line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("По подписчикам").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.POSITIVE));
            line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("По рейтингу").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.POSITIVE));
            line3.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("По крутости").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.POSITIVE));

            allKey.add(line1);
            allKey.add(line2);
            allKey.add(line3);

            viewsTopKeyboard.setButtons(allKey);
            viewsTopKeyboard.setInline(true);
        }
        return viewsTopKeyboard;
    }

    public static Keyboard getRatingTopKeyboard() {
        if (ratingTopKeyboard == null) {
            ratingTopKeyboard = new Keyboard();

            List<List<KeyboardButton>> allKey = new ArrayList<>();

            List<KeyboardButton> line1 = new ArrayList<>();
            List<KeyboardButton> line2 = new ArrayList<>();
            List<KeyboardButton> line3 = new ArrayList<>();

            line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("По подписчикам").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.POSITIVE));
            line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("По просмотрам").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.POSITIVE));
            line3.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("По крутости").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.POSITIVE));

            allKey.add(line1);
            allKey.add(line2);
            allKey.add(line3);

            ratingTopKeyboard.setButtons(allKey);
            ratingTopKeyboard.setInline(true);
        }
        return ratingTopKeyboard;
    }

    public static Keyboard getCoolnessTopKeyboard() {
        if (coolnessTopKeyboard == null) {
            coolnessTopKeyboard = new Keyboard();

            List<List<KeyboardButton>> allKey = new ArrayList<>();

            List<KeyboardButton> line1 = new ArrayList<>();
            List<KeyboardButton> line2 = new ArrayList<>();
            List<KeyboardButton> line3 = new ArrayList<>();

            line1.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("По подписчикам").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.POSITIVE));
            line2.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("По просмотрам").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.POSITIVE));
            line3.add(new KeyboardButton().setAction(new KeyboardButtonAction().setLabel("По рейтингу").setType(TemplateActionTypeNames.TEXT)).setColor(KeyboardButtonColor.POSITIVE));

            allKey.add(line1);
            allKey.add(line2);
            allKey.add(line3);

            coolnessTopKeyboard.setButtons(allKey);
            coolnessTopKeyboard.setInline(true);
        }
        return coolnessTopKeyboard;
    }
}
