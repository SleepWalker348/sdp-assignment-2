package smarthome.model;

public class TuyaThermostat implements Thermostat {
    private double temp = 20.0;

    @Override
    public void setTargetTemperature(double temp) {
        this.temp = temp;
        System.out.println("[Tuya Thermostat] Temperature adjusted to " + temp + "°C via Tuya Cloud.");
    }

    @Override
    public double getCurrentTemperature() {
        return temp;
    }
}