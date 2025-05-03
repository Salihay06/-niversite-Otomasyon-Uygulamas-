public class Professor {
    private String firstName;
    private String lastName;
    private Department department;

    public Professor(String firstName, String lastName, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    public void getInfo() {
        System.out.println("Profesör Adı: " + firstName + " " + lastName);
        System.out.print("Bölümü: ");
    department.getInfo();
    }
} 