package smarthome.model;

public class ZigbeeCamera implements SecurityCamera {
    @Override
    public void startStreaming() {
        System.out.println("[Zigbee Camera] Streaming video via Zigbee Gateway.");
    }

    @Override
    public void enableMotionDetection() {
        System.out.println("[Zigbee Camera] PIR Motion Sensor activated via Zigbee.");
    }
}