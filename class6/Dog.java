public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void greet() {
        System.out.println("WangWang..., I am " + this.name);
    }
    public void run() {
        System.out.println("I am running!");
    }
}