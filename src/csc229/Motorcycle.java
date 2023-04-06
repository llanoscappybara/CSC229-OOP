package csc229.dealership;

public abstract class Motorcycle extends Vehicle{
// Constructor
  protected String transmissionType;
  protected double oilCapacity;
  protected double gasTankSize;
  protected String sidecarStyle;
  protected double milesPerGallon;
//constructor
public Motorcycle(String modelTrim, int year, double price, String tireBrand, int topSpeed, 
                 String entertainmentSystemManufacturer, String seatStyle, int modelYear, String transmissionType, 
                 double oilCapacity, double gasTankSize, 
                 String sidecarStyle, double milesPerGallon){
    super(sidecarStyle, year, milesPerGallon, sidecarStyle, topSpeed, transmissionType, sidecarStyle, modelYear);
    this.transmissionType = transmissionType;
    this.oilCapacity = oilCapacity;
    this.gasTankSize = gasTankSize;
    this.sidecarStyle = sidecarStyle;
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

    public String getSidecarStyle() {
        return sidecarStyle;
    }

    public void setSidecarStyle(String sidecarStyle) {
        this.sidecarStyle = sidecarStyle;
    }
      
    public double getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(double milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
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
                "\nSidecar Style: " + sidecarStyle
             );
    }
   
}
