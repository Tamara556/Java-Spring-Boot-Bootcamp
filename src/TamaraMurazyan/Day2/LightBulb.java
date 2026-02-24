package TamaraMurazyan.Day2;

public class LightBulb {

    private boolean isOn;
    private int brightness;

    LightBulb() {
        this.isOn = false;
        this.brightness = 0;
    }

    private void turnOn() {
        this.isOn = true;
        this.brightness = 100;
    }

    private void turnOff() {
        this.isOn = false;
        this.brightness = 0;
    }

    private void setBrightness(int value) {
        if (value >= 0 && value <= 100) {
            this.brightness = value;
            this.isOn = value > 0;
        } else {
            System.out.println("Brightness must be between 0 and 100.");
        }
    }

    private void printStatus() {
        String status = isOn ? "ON" : "OFF";
        System.out.println("LightBulb is " + status + " with brightness " + brightness + "%.");
    }

    static void main() {
        LightBulb room1 = new LightBulb();
        LightBulb room2 = new LightBulb();
        room1.printStatus();

        room1.turnOn();
        room1.printStatus();

        room1.setBrightness(80);
        room1.printStatus();

        room1.turnOff();
        room1.printStatus();

        room2.printStatus();
    }
}
