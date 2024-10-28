public class StudentEnrollment {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1);

        Student student2 = new Student();
        System.out.println(student2);

        Student student3 = new Student("58956", "Michael", "McDonald", 72, "Music");
        System.out.println(student3);

        Student student4 = new Student("12345", "Barney", "Rubble", 31, "Geology");
        System.out.println(student4);
        student4.setMajor("Computer Science");
        System.out.println(student4);


    }
}