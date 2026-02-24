package MariamHovhannisyan.Day2;

public class LightBulb {

    boolean isOn;
    int brightness; // 0–100

    void turnOn() {
        isOn = true;
    }

    void turnOff() {
        isOn = false;
    }

    void setBrightness(int value) {
        if (!isOn) {
            return;
        }

        if (value >= 0 && value <= 100) {
            brightness = value;
        }
    }

    void printStatus() {
        if (isOn) {
            System.out.println("Light is ON");
            System.out.println("Brightness: " + brightness);
        } else {
            System.out.println("Light is OFF");
            System.out.println("Brightness: " + brightness);
        }
        System.out.println("----------------");
    }

    public static void main(String[] args) {

        LightBulb room = new LightBulb();
        LightBulb room2 = new LightBulb();

        room.turnOn();
        room.setBrightness(80);

        room.printStatus();
        room2.printStatus();
    }
}
