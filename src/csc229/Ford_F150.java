package csc229.dealership;

public class Ford_F150 extends ICETruck{
    
    // Constructor
    public Ford_F150(String modelTrim, int year, double price, String tireBrand, String transmissionType,
    int topSpeed, String entertainmentSystemManufacturer, String seatStyle, int modelYear,
    double oilCapacity, double gasTankSize, double milesPerGallon, double truckBedLength,
    double towingCapacity) {
        super(modelTrim, year, price, tireBrand, topSpeed, entertainmentSystemManufacturer, seatStyle, 
        modelYear, transmissionType, oilCapacity, gasTankSize, milesPerGallon, truckBedLength, towingCapacity);
        
    }
 // toString method
    @Override
    public String toString() {
        return ("This is a Ford F150 -> " +
        		super.toString());
                
    }
}

