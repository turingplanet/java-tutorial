public class CatMain {
    public static void main(String[] args) {
        Animal cat = new Cat("cat");
        cat.greet(); // MiaoMiao..., I am cat
        Animal dog = new Dog("dog");
        dog.greet(); // WangWang..., I am dog
    }
}