public abstract class EV extends Vehicle{
   protected double sunroofSize;
   protected boolean selfDriving;
   protected double milesPerKilowattHour;
//constructor
  public EV(double sunroofSize, boolean selfDriving, double milesPerKilowattHour){
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
      
 @Override
    public String toString() {
        return "This is a Tesla -> " +
        		    super.toString() +
                "\nSunroof Size: " + sunroofSize +
                "\nSelf-Driving: " + selfDriving +
                "\nMiles Per Kilowatt Hour: " + milesPerKilowattHour;
    }
}
