public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    public void greet() {
        System.out.println("MiaoMiao..., I am " + this.name);
    }
}
