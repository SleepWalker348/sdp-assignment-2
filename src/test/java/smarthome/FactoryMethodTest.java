package smarthome;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import smarthome.factory.method.*;
import smarthome.model.*;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {

    @Test
    @DisplayName("1. HomeKitLockInstaller should create HomeKitLock")
    void testHomeKitLockCreation() {
        LockInstaller installer = new HomeKitLockInstaller();
        SmartLock lock = installer.createLock();
        assertTrue(lock instanceof HomeKitLock);
    }

    @Test
    @DisplayName("2. GoogleLockInstaller should create GoogleLock")
    void testGoogleLockCreation() {
        LockInstaller installer = new GoogleLockInstaller();
        SmartLock lock = installer.createLock();
        assertTrue(lock instanceof GoogleLock);
    }

    @Test
    @DisplayName("3. TuyaLockInstaller should create TuyaLock")
    void testTuyaLockCreation() {
        LockInstaller installer = new TuyaLockInstaller();
        SmartLock lock = installer.createLock();
        assertTrue(lock instanceof TuyaLock);
    }

    @Test
    @DisplayName("4. Factory Method business logic should execute successfully")
    void testInstallerBusinessLogic() {
        LockInstaller installer = new HomeKitLockInstaller();
        assertDoesNotThrow(installer::installAndVerifySecurity);
    }
}