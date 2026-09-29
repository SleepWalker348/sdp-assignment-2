package smarthome.model;

public class ZigbeeThermostat implements Thermostat {
    private double temp = 20.0;

    @Override
    public void setTargetTemperature(double temp) {
        this.temp = temp;
        System.out.println("[Zigbee Thermostat] Target temperature set to " + temp + "°C via Zigbee Mesh.");
    }

    @Override
    public double getCurrentTemperature() {
        return temp;
    }
}