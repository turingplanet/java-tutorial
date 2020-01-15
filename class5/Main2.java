public class Main2 {

    public static void main(String[] args) {
        Student3 student = new Student3();
        System.out.println(student.getName()); // David
        student.setName("Enoch");
        System.out.println(student.getName()); // Enoch
    }
}
