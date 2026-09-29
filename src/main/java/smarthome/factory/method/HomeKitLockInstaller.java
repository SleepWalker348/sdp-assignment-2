package smarthome.factory.method;

import smarthome.model.HomeKitLock;
import smarthome.model.SmartLock;

public class HomeKitLockInstaller extends LockInstaller {
    @Override
    public SmartLock createLock() {
        return new HomeKitLock();
    }
}