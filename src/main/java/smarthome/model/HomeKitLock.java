package smarthome.model;

public class HomeKitLock implements SmartLock {
    private boolean locked = false;

    @Override
    public void lock() {
        this.locked = true;
        System.out.println("[HomeKit Lock] Locked via HomeKit HomeKitDaemon API.");
    }

    @Override
    public void unlock() {
        this.locked = false;
        System.out.println("[HomeKit Lock] Unlocked via HomeKit HomeKitDaemon API.");
    }

    @Override
    public boolean isLocked() {
        return locked;
    }
}