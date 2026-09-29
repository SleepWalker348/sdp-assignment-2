package smarthome.factory.method;

import smarthome.model.SmartLock;
import smarthome.model.TuyaLock;

public class TuyaLockInstaller extends LockInstaller {
    @Override
    public SmartLock createLock() {
        return new TuyaLock();
    }
}