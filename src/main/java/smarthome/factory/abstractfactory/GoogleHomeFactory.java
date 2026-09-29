package smarthome.factory.abstractfactory;

import smarthome.model.*;

public class GoogleHomeFactory implements SmartHomeFactory {
    @Override
    public SmartLock createLock() {
        return new GoogleLock();
    }

    @Override
    public Thermostat createThermostat() {
        return new GoogleThermostat();
    }

    @Override
    public SecurityCamera createCamera() {
        return new GoogleCamera();
    }
}