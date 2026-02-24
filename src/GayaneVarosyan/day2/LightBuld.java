package GayaneVarosyan.day2;

public class LightBuld {
    private boolean isOn;
    private int brightness;

    LightBuld() {
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
        System.out.println("LightBuld is " + status + " with brightness " + brightness + "%.");
    }    static void main() {
        LightBuld room1 = new LightBuld();
        LightBuld room2 = new LightBuld();
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
