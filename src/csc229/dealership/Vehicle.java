package csc229.dealership;

public abstract class Vehicle{
    protected String modelTrim;
    protected int year;
    protected double price;
    protected String tireBrand;
    protected int topSpeed;
    protected String entertainmentSystemManufacturer;
    protected String seatStyle;
    protected int modelYear;
    
    //constructor
    
    public Vehicle(String modelTrim, int year, double price, String tireBrand, int topSpeed, 
                   String entertainmentSystemManufacturerer, String seatStyle, int modelYear){
    this.modelTrim = modelTrim;
    this.year = year;
    this.price = price;
    this.tireBrand = tireBrand;
    this.topSpeed = topSpeed;
    this.entertainmentSystemManufacturer = entertainmentSystemManufacturer;
    this.seatStyle = seatStyle;
    this.modelYear = modelYear;
    }
    
    //getters and setters
  
    public String getModelTrim() {
        return modelTrim;
    }

    public void setModelTrim(String modelTrim) {
        this.modelTrim = modelTrim;
    }

    public int getPurchaseYear() {
        return year;
    }

    public void setPurchaseYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTireBrand() {
        return tireBrand;
    }

    public void setTireBrand(String tireBrand) {
        this.tireBrand = tireBrand;
    }
    
    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getEntertainmentSystemManufacturer() {
        return entertainmentSystemManufacturer;
    }

    public void setEntertainmentSystemManufacturer(String entertainmentSystemManufacturer) {
        this.entertainmentSystemManufacturer = entertainmentSystemManufacturer;
    }

    public String getSeatStyle() {
        return seatStyle;
    }

    public void setSeatStyle(String seatStyle) {
        this.seatStyle = seatStyle;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }
    
    @Override
    public String toString() {
        return  "\nModel Trim: " + modelTrim +
                "\nPurchase Year: " + year +
                "\nPrice: " + price +
                "\nTire Brand: " + tireBrand +
                "\nTop Speed: " + topSpeed +
                "\nEntertainment System Manufacturer: " + entertainmentSystemManufacturer +
                "\nSeat Style: " + seatStyle +
                "\nModel Year: " + modelYear +
                "\nSunroof Size: " + sunroofSize +
