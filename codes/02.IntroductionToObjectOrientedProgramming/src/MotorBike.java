public class MotorBike {
    // State
    // Behaviour
    private int speed;

    MotorBike(){
        // speed = 5;
        this(5);
    }
    //when a user defined constructor is used then the
    //default constructor is not used
    MotorBike(int speed){
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed >0 )
            this.speed = speed;
    }

    public void increaseSpeed(int howMuch){
        setSpeed(this.speed+howMuch);
    }

    public void decreaseSpeed(int howMuch){
        //here the validation will be done by setSpeed itself so it reduces extra code
        setSpeed(this.speed-howMuch);
    }

    void start() {
        System.out.println("Bike Started");
    }
}