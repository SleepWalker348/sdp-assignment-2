package smarthome.model;

public class GoogleLock implements SmartLock {
    private boolean locked = false;

    @Override
    public void lock() {
        this.locked = true;
        System.out.println("[Google Lock] Locked via Google Assistant API.");
    }

    @Override
    public void unlock() {
        this.locked = false;
        System.out.println("[Google Lock] Unlocked via Google Assistant API.");
    }

    @Override
    public boolean isLocked() {
        return locked;
    }
}