public class Main {
    public static void main(String[] args) {

        System.out.println("Student Information");
        System.out.println("-------------------");

        Student student1 = new Student();
        student1.name = "Tep Abella";
        student1.age = 20;
        student1.course = "BSIT";

        Student student2 = new Student();
        student2.name = "Tiffy Laganse";
        student2.age = 21;
        student2.course = "BSHM";

        student1.displayInfo();
        student2.displayInfo();
    }
}
