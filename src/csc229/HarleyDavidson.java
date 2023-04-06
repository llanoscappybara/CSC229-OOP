package csc229.dealership;

public class HarleyDavidson extends Motorcycle{

    // Constructor
    public HarleyDavidson(String modelTrim, int year, double price, String tireBrand, String transmissionType,
    int topSpeed, int modelYear, double oilCapacity, double gasTankSize, double milesPerGallon,
    String sidecarStyle) {
        super(modelTrim, year, price, tireBrand, topSpeed, modelTrim, tireBrand, modelYear, transmissionType, oilCapacity, 
        gasTankSize, sidecarStyle, milesPerGallon);
    }

    // toString method
    @Override
    public String toString() {
        return ("This is a Harley -> " +
        		super.toString());
    }
    
}
