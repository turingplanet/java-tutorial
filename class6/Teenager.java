public class Teenager extends Person {

    public static void main(String[] args) {
        Teenager teenager = new Teenager();
        teenager.greet(); // I am a teenager.
        teenager.sleep(); // Zzz
    }
    public void greet() {
        System.out.println("I am a teenager.");
    }
}
