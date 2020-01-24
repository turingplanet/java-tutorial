public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal("animal");
        animal.greet(); // Hello, I am animal
        Dog dog = new Dog("dog");
        dog.greet(); // WangWang..., I am dog
        dog.run(); // I am running!
    }
}
