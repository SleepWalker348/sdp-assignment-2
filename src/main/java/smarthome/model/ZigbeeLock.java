package smarthome.model;

public class ZigbeeLock implements SmartLock {
    private boolean locked = false;

    @Override
    public void lock() {
        this.locked = true;
        System.out.println("[Zigbee Lock] Locked via Zigbee 3.0 Protocol.");
    }

    @Override
    public void unlock() {
        this.locked = false;
        System.out.println("[Zigbee Lock] Unlocked via Zigbee 3.0 Protocol.");
    }

    @Override
    public boolean isLocked() {
        return locked;
    }
}