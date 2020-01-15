public class Student2 {

    String name;
    public Student2(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Student2 student = new Student2("Daniel");
        System.out.println(student.name); // Daniel
    }
}
