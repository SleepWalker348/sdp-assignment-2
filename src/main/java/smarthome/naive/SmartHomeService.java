package smarthome.naive;

public class SmartHomeService {

    public void setupHome(String ecosystem) {
        if (ecosystem.equalsIgnoreCase("HomeKit")) {
            HomeKitLock lock = new HomeKitLock();
            HomeKitThermostat thermo = new HomeKitThermostat();
            HomeKitCamera camera = new HomeKitCamera();

            lock.lock();
            thermo.setTemp(21.0);
            camera.startStream();

        } else if (ecosystem.equalsIgnoreCase("Google")) {
            GoogleLock lock = new GoogleLock();
            GoogleThermostat thermo = new GoogleThermostat();
            GoogleCamera camera = new GoogleCamera();

            lock.secureDoor();
            thermo.setTargetTemp(21.0);
            camera.enableVideo();

        } else if (ecosystem.equalsIgnoreCase("Tuya")) {
            TuyaLock lock = new TuyaLock();
            TuyaThermostat thermo = new TuyaThermostat();
            TuyaCamera camera = new TuyaCamera();

            lock.lockDevice();
            thermo.setTemperature(21.0);
            camera.startLiveFeed();

        } else {
            throw new IllegalArgumentException("An Unknown Ecosystem: " + ecosystem);
        }
    }
}