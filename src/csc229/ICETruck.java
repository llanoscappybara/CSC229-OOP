package csc229.dealership;

public abstract class ICETruck extends Vehicle{
    protected String transmissionType;
    protected double oilCapacity;
    protected double gasTankSize;
    protected double milesPerGallon;
    protected double truckBedLength;
    protected double towingCapacity;
//constructor
  public ICETruck(String modelTrim, int year, double price, String tireBrand, int topSpeed, 
                String entertainmentSystemManufacturer, String seatStyle, int modelYear, String transmissionType, 
                double oilCapacity, double gasTankSize, double milesPerGallon,
                 double truckBedLength, double towingCapacity){
    super(transmissionType, year, towingCapacity, transmissionType, topSpeed, transmissionType, transmissionType, modelYear);
    this.transmissionType = transmissionType;
    this.oilCapacity = oilCapacity;
    this.gasTankSize = gasTankSize;
    this.milesPerGallon = milesPerGallon;
    this.truckBedLength = truckBedLength;
    this.towingCapacity = towingCapacity;
    }
//getters and setters
    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

   public double getOilCapacity() {
        return oilCapacity;
    }

    public void setOilCapacity(double oilCapacity) {
        this.oilCapacity = oilCapacity;
    }

    public double getGasTankSize() {
        return gasTankSize;
    }

    public void setGasTankSize(double gasTankSize) {
        this.gasTankSize = gasTankSize;
    }

      
    public double getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(double milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }
    
    public double getTruckBedLength() {
        return this.truckBedLength;
    }
    
    public double getTowingCapacity() {
        return this.towingCapacity;
    }
    
    public void setTruckBedLength(double truckBedLength) {
        this.truckBedLength = truckBedLength;
    }
    
    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    // Getters and setter

    @Override
    public String toString() {
        return (
                super.toString() +
                "\nTransmission Type: " + transmissionType +
                "\nOil Capacity: " + oilCapacity +
                "\nGas Tank Size: " + gasTankSize +
                "\nMiles Per Gallon: " + milesPerGallon+
                "\nTruck Bed Length: " + truckBedLength +
                "\nTowing Capacity: " + towingCapacity
                 );
    }
   
}
