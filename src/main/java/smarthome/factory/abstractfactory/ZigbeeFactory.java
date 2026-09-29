package smarthome.factory.abstractfactory;

import smarthome.model.*;

public class ZigbeeFactory implements SmartHomeFactory {
    @Override
    public SmartLock createLock() {
        return new ZigbeeLock();
    }

    @Override
    public Thermostat createThermostat() {
        return new ZigbeeThermostat();
    }

    @Override
    public SecurityCamera createCamera() {
        return new ZigbeeCamera();
    }
}