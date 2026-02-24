package MeriSargsyan.Day2;

public class LightBulb {
    boolean isOn;
    int brightness; // 0 - 100

    void turnOn() {
        isOn = true;
    }

    void turnOff() {
        isOn = false;
    }

    void setBrightness(int value) {
        if (isOn && value >= 0 && value <= 100) {
            brightness = value;
        }
    }

    void printStatus() {
        if (isOn) {
            System.out.println("Լույսը միացված է");
            System.out.println("Լուսավորություն: " + brightness);
        } else {
            System.out.println("Լույսը անջատված է");
        }
        System.out.println("------------------");
    }

    public static void main(String[] args) {

        LightBulb room1 = new LightBulb();
        LightBulb room2 = new LightBulb();

        room1.turnOn();
        room1.setBrightness(80);

        room1.printStatus();
        room2.printStatus();
    }
}

