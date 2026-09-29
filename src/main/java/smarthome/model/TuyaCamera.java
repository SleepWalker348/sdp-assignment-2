package smarthome.model;

public class TuyaCamera implements SecurityCamera {
    @Override
    public void startStreaming() {
        System.out.println("[Tuya Camera] Streaming RTMP live video stream.");
    }

    @Override
    public void enableMotionDetection() {
        System.out.println("[Tuya Camera] Motion detection armed.");
    }
}