package hw;

public class Car {
    private String brand;
    private String model;
    private int year;
    public Car(String brand) {
        this.brand = brand;
        this.model = "xxx";
        this.year = 0;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getInfo() {
        return String.format("Brand: %s, Model: %s, Year: %s", brand, model, year);
    }
}
