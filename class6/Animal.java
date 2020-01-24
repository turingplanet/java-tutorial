public class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public void greet() {
        System.out.println("Hello, I am " + this.name);
    }
}