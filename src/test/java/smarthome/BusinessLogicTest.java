package smarthome;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import smarthome.factory.abstractfactory.FactoryProvider;
import smarthome.factory.abstractfactory.SmartHomeFactory;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class BusinessLogicTest {

    @Test
    @DisplayName("13. Business Scenario: Night mode executes without errors")
    void testNightModeRoutine() {
        SmartHomeFactory factory = FactoryProvider.getFactory("homekit");
        SmartHomeHub hub = new SmartHomeHub(factory);
        assertDoesNotThrow(hub::triggerNightMode);
    }

    @Test
    @DisplayName("14. Business Scenario: Security breach routine executes on Google ecosystem")
    void testSecurityBreachRoutine() {
        SmartHomeFactory factory = FactoryProvider.getFactory("google");
        SmartHomeHub hub = new SmartHomeHub(factory);
        assertDoesNotThrow(hub::handleSecurityBreach);
    }

    @Test
    @DisplayName("15. Business Scenario: Away routine executes on new 4th family (Zigbee)")
    void testAwayRoutineOnNewFamily() {
        SmartHomeFactory factory = FactoryProvider.getFactory("zigbee");
        SmartHomeHub hub = new SmartHomeHub(factory);
        assertDoesNotThrow(hub::runAwayFromHomeRoutine);
    }
}