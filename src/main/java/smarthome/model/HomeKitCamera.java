package smarthome.model;

public class HomeKitCamera implements SecurityCamera {
    @Override
    public void startStreaming() {
        System.out.println("[HomeKit Camera] Streaming video feed via Secure Video.");
    }

    @Override
    public void enableMotionDetection() {
        System.out.println("[HomeKit Camera] Motion detection armed.");
    }
}