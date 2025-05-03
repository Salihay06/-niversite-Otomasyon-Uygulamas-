public class Test {
    public static void main(String[] args) {
        Department philosophy = new Department("Philosophy");
        
        Professor aliVeli = new Professor("Ali", "Veli", philosophy);
        Professor ayseFatma = new Professor("Ayşe", "Fatma", philosophy);
        
        Course ethics = new Course("Ethics", aliVeli, philosophy);
        Course ontology = new Course("Ontology", ayseFatma, philosophy);
        
        Student zeynepGul = new Student("Zeynep", "Gül", ethics);
        Student metinSaglam = new Student("Metin", "Sağlam", ontology);
        Student muratAtilgan = new Student("Murat", "Atılgan", ethics);
        
        System.out.println("=== Bölüm Bilgileri ===");
        philosophy.getInfo();
        
        System.out.println("\n=== Profesör Bilgileri ===");
        aliVeli.getInfo();
        ayseFatma.getInfo();
        
        System.out.println("\n=== Ders Bilgileri ===");
        ethics.getInfo();
        ontology.getInfo();
        
        System.out.println("\n=== Öğrenci Bilgileri ===");
        zeynepGul.getInfo();
        metinSaglam.getInfo();
        muratAtilgan.getInfo();
    }
} 