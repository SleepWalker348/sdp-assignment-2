package smarthome.factory.abstractfactory;

public class FactoryProvider {
    public static SmartHomeFactory getFactory(String ecosystemType) {
        if (ecosystemType == null) {
            throw new IllegalArgumentException("Ecosystem type cannot be null");
        }

        switch (ecosystemType.trim().toLowerCase()) {
            case "homekit":
                return new HomeKitFactory();
            case "google":
            case "googlehome":
                return new GoogleHomeFactory();
            case "tuya":
            case "tuyasmart":
                return new TuyaSmartFactory();
            default:
                throw new IllegalArgumentException("Unsupported ecosystem: " + ecosystemType);
        }
    }
}