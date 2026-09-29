package smarthome.factory.abstractfactory;

import smarthome.model.SecurityCamera;
import smarthome.model.SmartLock;
import smarthome.model.Thermostat;

public interface SmartHomeFactory {
    SmartLock createLock();
    Thermostat createThermostat();
    SecurityCamera createCamera();
}