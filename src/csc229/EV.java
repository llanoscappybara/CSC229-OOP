package csc229.dealership;

public abstract class EV extends Vehicle{
   protected double sunroofSize;
   protected boolean selfDriving;
   protected double milesPerKilowattHour;
//constructor
  public EV(String modelTrim, int year, double price, String tireBrand, int topSpeed, 
            String entertainmentSystemManufacturer, String seatStyle, int modelYear, 
            double sunroofSize, boolean selfDriving, double milesPerKilowattHour){
        super(modelTrim, year, milesPerKilowattHour, tireBrand, topSpeed, entertainmentSystemManufacturer, seatStyle, modelYear);
        this.sunroofSize = sunroofSize;
        this.selfDriving = selfDriving;
        this.milesPerKilowattHour = milesPerKilowattHour;
    }
    public double getSunroofSize() {
        return sunroofSize;
    }

    public void setSunroofSize(double sunroofSize) {
        this.sunroofSize = sunroofSize;
    }

    public boolean isSelfDriving() {
        return selfDriving;
    }

    public void setSelfDriving(boolean selfDriving) {
        this.selfDriving = selfDriving;
    }

    public double getMilesPerKilowattHour() {
        return milesPerKilowattHour;
    }

    public void setMilesPerKilowattHour(double milesPerKilowattHour) {
        this.milesPerKilowattHour = milesPerKilowattHour;
    }
      
 @Override
    public String toString() {
        return (
        		    super.toString() +
                "\nSunroof Size: " + sunroofSize +
                "\nSelf-Driving: " + selfDriving +
                "\nMiles Per Kilowatt Hour: " + milesPerKilowattHour
           );
    }
}
