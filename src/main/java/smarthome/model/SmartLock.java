package smarthome.model;

public interface SmartLock {
    void lock();
    void unlock();
    boolean isLocked();
}