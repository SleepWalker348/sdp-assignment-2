package smarthome.factory.abstractfactory;

import smarthome.model.*;

public class HomeKitFactory implements SmartHomeFactory {
    @Override
    public SmartLock createLock() {
        return new HomeKitLock();
    }

    @Override
    public Thermostat createThermostat() {
        return new HomeKitThermostat();
    }

    @Override
    public SecurityCamera createCamera() {
        return new HomeKitCamera();
    }
}