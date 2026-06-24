package OOPS.interfaces;

public class electricCar implements CarControls{
    @Override
    public void turnRight() {
        System.out.println("Electric Right");
    }

    @Override
    public void turnLeft() {
        System.out.println("Electric Left");
    }

    @Override
    public void applyBreaks() {
        System.out.println("Electric Apply brakes");
    }
}
