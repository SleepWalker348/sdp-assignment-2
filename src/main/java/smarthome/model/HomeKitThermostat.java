package smarthome.model;

public class HomeKitThermostat implements Thermostat {
    private double temp = 20.0;

    @Override
    public void setTargetTemperature(double temp) {
        this.temp = temp;
        System.out.println("[HomeKit Thermostat] Temperature set to " + temp + "°C via HomeKit.");
    }

    @Override
    public double getCurrentTemperature() {
        return temp;
    }
}