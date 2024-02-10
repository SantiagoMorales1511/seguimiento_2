package co.icesi.edu.model;

public class Billboard {
    private double width;
    private double height;
    private boolean inUse;
    private String brand;

    public Billboard(double width, double height, boolean inUse, String brand) {
        this.width = width;
        this.height = height;
        this.inUse = inUse;
        this.brand = brand;
    }

    // Getter methods
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public boolean isInUse() {
        return inUse;
    }

    public String getBrand() {
        return brand;
    }

    // Setter methods
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double calculateArea(){
        return (width * height);
    }

}

