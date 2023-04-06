package csc229.dealership;

public class Tesla extends EV{
    
    // Constructor
    public Tesla(String modelTrim, int year, double price, String tireBrand, int topSpeed,
    String entertainmentSystemManufacturer, String seatStyle, int modelYear,
    double sunroofSize, boolean selfDriving, double milesPerKilowattHour)
    {
        super(modelTrim, year, price, tireBrand, topSpeed, entertainmentSystemManufacturer, 
        seatStyle, modelYear, sunroofSize, selfDriving, milesPerKilowattHour);
    }

    // Getters and setters

 // toString method
    @Override
    public String toString() {
        return ("This is a Tesla -> " +
        		super.toString());
    }
}
