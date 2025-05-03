public class Student {
    private String firstName;
    private String lastName;
    private Course course;

    public Student(String firstName, String lastName, Course course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }

    public void getInfo() {
        System.out.println("Öğrenci Adı: " + firstName + " " + lastName);
        System.out.print("Aldığı Ders: ");
        course.getInfo();
    }
} 