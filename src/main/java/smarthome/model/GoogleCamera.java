package smarthome.model;

public class GoogleCamera implements SecurityCamera {
    @Override
    public void startStreaming() {
        System.out.println("[Google Camera] Streaming live feed to Google Nest display.");
    }

    @Override
    public void enableMotionDetection() {
        System.out.println("[Google Camera] Motion detection armed.");
    }
}