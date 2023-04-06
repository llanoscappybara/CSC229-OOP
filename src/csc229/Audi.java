package csc229.dealership;

public class Audi extends ICECar{

    // Constructor
    public Audi(String modelTrim, int year, double price, String tireBrand, String transmissionType, int topSpeed,
    String entertainmentSystemManufacturer, String seatStyle, int modelYear, double oilCapacity,
    double gasTankSize, double sunroofSize, double milesPerGallon) 
    {
        super(transmissionType, oilCapacity, gasTankSize, sunroofSize, milesPerGallon, modelTrim, year, 
        price, tireBrand, topSpeed, entertainmentSystemManufacturer, seatStyle, modelYear);
    }

    // Getters and setter

    @Override
    public String toString() {
        return ("This is an Audi -> " +
                super.toString());
    }
   
}