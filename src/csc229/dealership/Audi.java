package csc229.dealership;

public class Audi extends ICECar{

    // Constructor
    public Audi() {
    }

    // Getters and setter

    @Override
    public String toString() {
        return ("This is an Audi -> " +
                super.tostring())
    }
   
}
