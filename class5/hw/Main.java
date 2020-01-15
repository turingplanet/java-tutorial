package hw;

public class Main {

    public static void main(String[] args) {
        Car newCar = new Car("Subaru");
        newCar.setModel("WRX");
        newCar.setYear(2020);
        System.out.println(newCar.getInfo());
    }
}
