package smarthome;

import smarthome.factory.abstractfactory.FactoryProvider;
import smarthome.factory.abstractfactory.SmartHomeFactory;

public class Main {
    public static void main(String[] args) {
        // Симулируем динамический выбор конфигурации (из аргументов или конфига)
        String ecosystemConfig = args.length > 0 ? args[0] : "homekit";

        System.out.println("Initializing Smart Home with ecosystem: " + ecosystemConfig);

        // Динамический выбор фабрики в рантайме (Part E)
        SmartHomeFactory factory = FactoryProvider.getFactory(ecosystemConfig);

        // Передаем абстрактную фабрику клиенту
        SmartHomeHub hub = new SmartHomeHub(factory);

        // Выполняем бизнес-операции (Part F)
        hub.triggerNightMode();
        hub.handleSecurityBreach();
        hub.runAwayFromHomeRoutine();
    }
}