package smarthome;

import smarthome.factory.abstractfactory.SmartHomeFactory;
import smarthome.model.SecurityCamera;
import smarthome.model.SmartLock;
import smarthome.model.Thermostat;

public class SmartHomeHub {
    private final SmartLock lock;
    private final Thermostat thermostat;
    private final SecurityCamera camera;

    // Клиент работает ИСКЛЮЧИТЕЛЬНО через абстрактную фабрику
    public SmartHomeHub(SmartHomeFactory factory) {
        this.lock = factory.createLock();
        this.thermostat = factory.createThermostat();
        this.camera = factory.createCamera();
    }

    // Бизнес-сценарий 1: Ночной режим
    public void triggerNightMode() {
        System.out.println("\n=== Executing Night Mode Routine ===");
        lock.lock();
        thermostat.setTargetTemperature(19.0);
        camera.enableMotionDetection();
        System.out.println("Night mode fully activated.");
    }

    // Бизнес-сценарий 2: Режим тревоги / Взлом
    public void handleSecurityBreach() {
        System.out.println("\n=== Security Breach Detected! ===");
        camera.startStreaming();
        lock.lock();
        System.out.println("Emergency protocols engaged across all ecosystem devices.");
    }

    // Бизнес-сценарий 3: Режим энергосбережения (Ушел из дома)
    public void runAwayFromHomeRoutine() {
        System.out.println("\n=== Executing Away-From-Home Routine ===");
        lock.lock();
        thermostat.setTargetTemperature(16.5);
        camera.enableMotionDetection();
        camera.startStreaming();
        System.out.println("House secured and put into energy saving mode.");
    }
}