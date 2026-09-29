package smarthome.factory.abstractfactory;

import smarthome.model.*;

public class TuyaSmartFactory implements SmartHomeFactory {
    @Override
    public SmartLock createLock() {
        return new TuyaLock();
    }

    @Override
    public Thermostat createThermostat() {
        return new TuyaThermostat();
    }

    @Override
    public SecurityCamera createCamera() {
        return new TuyaCamera();
    }
}