package smarthome.factory.method;

import smarthome.model.SmartLock;

public abstract class LockInstaller {

    // Factory Method
    public abstract SmartLock createLock();

    // Meaningful Business Logic (Part B Requirement)
    public void installAndVerifySecurity() {
        SmartLock lock = createLock();
        System.out.println("--- Starting lock installation procedure ---");
        lock.unlock();
        System.out.println("Testing mechanism responsiveness...");
        lock.lock();

        if (!lock.isLocked()) {
            throw new IllegalStateException("Security check failed: Lock mechanism does not engage properly!");
        }
        System.out.println("Installation verified successfully! Lock is secure.");
    }
}