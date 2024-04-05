package Interfaces;

public class Car implements Brake,Media,Engine{


    @Override
    public void brake() {
        System.out.println("this is break");

    }

    @Override
    public void acc() {
        System.out.println("this is acc");

    }

    @Override
    public void start() {
        System.out.println("this is start");

    }

    @Override
    public void stop() {
        System.out.println("This is stop");

    }
}
