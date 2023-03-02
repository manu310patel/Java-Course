public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();

        ducati.setSpeed(100);
        honda.setSpeed(80);

        ducati.setSpeed(20);
        honda.setSpeed(0);
    }
}
