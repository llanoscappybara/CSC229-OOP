package csc229.dealership;

public abstract class Vehicle{
    protected String modelTrim;
    protected int year;
    protected double price;
    protected String tireBrand;
    
  
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
