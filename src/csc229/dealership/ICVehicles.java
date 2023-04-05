package csc229.dealership;

public abstract class ICECars extends Vehicles{
  protected String transmissionType;
  protected double oilCapacity;
  protected double gasTankSize;
  protected double sunroofSize;
  protected double milesPerGallon;
//constructor
  public ICECars(String transmissionType, double oilCapacity, double gasTankSize, 
                 double sunroofSize, double milesPerGallon){
    this.transmissionType = transmissionType;
    this.oilCapacity = oilCapacity;
    this.gasTankSize = gasTankSize;
    this.sunroofSize = sunroofSize;
    this.milesPerGallon = milesPerGallon;
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

    public double getSunroofSize() {
        return sunroofSize;
    }

    public void setSunroofSize(double sunroofSize) {
        this.sunroofSize = sunroofSize;
    }

    public double getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(double milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }
    @Override
    public String toString() {
        return  "\nTransmission Type: " + transmissionType +
                "\nOil Capacity: " + oilCapacity +
                "\nGas Tank Size: " + gasTankSize +
                "\nSunroof Size: " + sunroofSize +
                "\nMiles Per Gallon: " + milesPerGallon;
    }
}
