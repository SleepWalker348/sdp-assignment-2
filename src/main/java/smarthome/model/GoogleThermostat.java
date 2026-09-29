package smarthome.model;

public class GoogleThermostat implements Thermostat {
    private double temp = 20.0;

    @Override
    public void setTargetTemperature(double temp) {
        this.temp = temp;
        System.out.println("[Google Thermostat] Target temperature set to " + temp + "°C via Google Home.");
    }

    @Override
    public double getCurrentTemperature() {
        return temp;
    }
}