public class FanRunner{
    public static void main(String[] args) {
        Fan fan = new Fan("Manufacturer 1",0.34567,"GREEN");
        System.out.println(fan);

        fan.switchOn();
        fan.setSpeed((byte)3);
        System.out.println(fan);



    }
}