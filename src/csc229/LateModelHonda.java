package csc229.dealership;

public class LateModelHonda extends ICECar{

    
    // Constructor
    public LateModelHonda(String modelTrim, int year, double price, String tireBrand, String transmissionType,
    int topSpeed, int modelYear, double oilCapacity, double gasTankSize, double milesPerGallon) {
      super(transmissionType, oilCapacity, gasTankSize, gasTankSize, milesPerGallon, modelTrim, 
      year, price, tireBrand, topSpeed, tireBrand, transmissionType, modelYear);
    }



    @Override
    public String toString() {
    	return ("This is a Late Model Honda -> " +
        		super.toString());
    }
}
