public class Car {
    String model;
    int year;
    public Car(String m) {
        this.model = m;
    }
    public Car(String m, int y) {
        this.model = m;
        this.year = y;
    }
    public static void main(String[] args) {
        Car car = new Car("BMW X5");
        System.out.printf("Model: %s, Year: %s\n", car.model, car.year);
        car = new Car("Subaru WRX", 2019);
        System.out.printf("Model: %s, Year: %s\n", car.model, car.year);
    }
}