package smarthome.factory.method;

import smarthome.model.GoogleLock;
import smarthome.model.SmartLock;

public class GoogleLockInstaller extends LockInstaller {
    @Override
    public SmartLock createLock() {
        return new GoogleLock();
    }
}