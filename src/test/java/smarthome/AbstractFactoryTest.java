package smarthome;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import smarthome.factory.abstractfactory.*;
import smarthome.model.*;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {

    @Test
    @DisplayName("5. HomeKitFactory creates consistent HomeKit product family")
    void testHomeKitFamilyConsistency() {
        SmartHomeFactory factory = new HomeKitFactory();
        assertTrue(factory.createLock() instanceof HomeKitLock);
        assertTrue(factory.createThermostat() instanceof HomeKitThermostat);
        assertTrue(factory.createCamera() instanceof HomeKitCamera);
    }

    @Test
    @DisplayName("6. GoogleHomeFactory creates consistent Google product family")
    void testGoogleFamilyConsistency() {
        SmartHomeFactory factory = new GoogleHomeFactory();
        assertTrue(factory.createLock() instanceof GoogleLock);
        assertTrue(factory.createThermostat() instanceof GoogleThermostat);
        assertTrue(factory.createCamera() instanceof GoogleCamera);
    }

    @Test
    @DisplayName("7. TuyaSmartFactory creates consistent Tuya product family")
    void testTuyaFamilyConsistency() {
        SmartHomeFactory factory = new TuyaSmartFactory();
        assertTrue(factory.createLock() instanceof TuyaLock);
        assertTrue(factory.createThermostat() instanceof TuyaThermostat);
        assertTrue(factory.createCamera() instanceof TuyaCamera);
    }

    @Test
    @DisplayName("8. ZigbeeFactory creates consistent 4th family products")
    void testZigbeeFamilyConsistency() {
        SmartHomeFactory factory = new ZigbeeFactory();
        assertTrue(factory.createLock() instanceof ZigbeeLock);
        assertTrue(factory.createThermostat() instanceof ZigbeeThermostat);
        assertTrue(factory.createCamera() instanceof ZigbeeCamera);
    }

    @Test
    @DisplayName("9. FactoryProvider dynamically selects HomeKit factory")
    void testFactoryProviderHomeKit() {
        SmartHomeFactory factory = FactoryProvider.getFactory("homekit");
        assertTrue(factory instanceof HomeKitFactory);
    }

    @Test
    @DisplayName("10. FactoryProvider dynamically selects Zigbee factory")
    void testFactoryProviderZigbee() {
        SmartHomeFactory factory = FactoryProvider.getFactory("zigbee");
        assertTrue(factory instanceof ZigbeeFactory);
    }

    @Test
    @DisplayName("11. Negative Scenario: FactoryProvider throws on invalid ecosystem")
    void testFactoryProviderInvalidEcosystem() {
        assertThrows(IllegalArgumentException.class, () -> FactoryProvider.getFactory("playstation"));
    }

    @Test
    @DisplayName("12. Negative Scenario: FactoryProvider throws on null input")
    void testFactoryProviderNullEcosystem() {
        assertThrows(IllegalArgumentException.class, () -> FactoryProvider.getFactory(null));
    }
}