public class Vehicle {

    public Vehicle() {}

    public void testSpeed(int speed) throws TooFastException {
        if (speed > 90) {
            throw new TooFastException(speed);
        }
        System.out.println("Speed OK: " + speed);
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();

        try {
            v.testSpeed(80);
            v.testSpeed(120);
        } catch (TooFastException e) {
            e.printStackTrace();
        }
    }
}
