package smarthome.model;

public class TuyaLock implements SmartLock {
    private boolean locked = false;

    @Override
    public void lock() {
        this.locked = true;
        System.out.println("[Tuya Lock] Locked via Tuya Cloud API.");
    }

    @Override
    public void unlock() {
        this.locked = false;
        System.out.println("[Tuya Lock] Unlocked via Tuya Cloud API.");
    }

    @Override
    public boolean isLocked() {
        return locked;
    }
}