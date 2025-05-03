public class Course {
    private String name;
    private Professor instructor;
    private Department department;

    public Course(String name, Professor instructor, Department department) {
        this.name = name;
        this.instructor = instructor;
        this.department = department;
    }

    public void getInfo() {
        System.out.println("Ders Adı: " + name);
        System.out.print("Eğitmen: ");
        instructor.getInfo();
        System.out.print("Bölüm: ");
        department.getInfo();
    }
} 