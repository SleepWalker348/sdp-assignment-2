package smarthome.model;

public interface Thermostat {
    void setTargetTemperature(double temp);
    double getCurrentTemperature();
}