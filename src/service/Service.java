package service;

import model.builder.Contact;
import model.builder.ContactBuilder;
import model.singleton.Logger;
import ui.UIConsole;

public class Service {
    UIConsole console = new UIConsole();

    public void start() {
        console.printMessage("Начало работы.\n");
        Contact contact1 = new ContactBuilder()
                .name("Алексей")
                .surname("Мезенцев")
                .phone("678")
                .email("meza@mail.ru")
                .patronymic("Юрьевич")
                .address("не знает")
                .build();
        Logger.getLogger().addLogInfo("Создана запись\n" + contact1);
        Contact contact2 = new ContactBuilder()
                .surname("Казанова")
                .name("Петр")
                .address("39 подъезд")
                .build();
        Logger.getLogger().addLogInfo("Создана запись\n" + contact2);
        console.printMessage(Logger.getLogger().readLog());
        console.printMessage("Завершение работы");
    }
}