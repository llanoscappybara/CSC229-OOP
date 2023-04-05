package csc229.dealership;

public abstract class ICETruck extends Vehicle{

    // Constructor
  public ICETruck() {
  protected String transmissionType;
  protected double oilCapacity;
  protected double gasTankSize;
  protected double milesPerGallon;
  private double truckBedLength;
  private double towingCapacity;
//constructor
  public ICETruck(String transmissionType, double oilCapacity, double gasTankSize, double milesPerGallon,
                 double truckBedLength, double towingCapacity){
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
        return ("\nTransmission Type: " + transmissionType +
                "\nOil Capacity: " + oilCapacity +
                "\nGas Tank Size: " + gasTankSize +
                "\nMiles Per Gallon: " + milesPerGallon+
                "\nTruck Bed Length: " + truckBedLength +
                "\nTowing Capacity: " + towingCapacity;
                 )
    }
   
}
