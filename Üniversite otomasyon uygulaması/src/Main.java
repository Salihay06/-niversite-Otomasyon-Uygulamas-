public class Main {
    public static void main(String[] args) {
        Department philosophy = new Department("Philosphy");
        
        Professor prof = new Professor("Ali", "Veli", philosophy);
        Professor prof1 = new Professor("Ayşe", "Fatma", philosophy);
        
        

        Course ethics= new Course("Ethics", prof1, philosophy);
        Course ontology = new Course("Ontology", prof1, philosophy);
        
        Student ogrenci = new Student("Zeynep ", "Gül", ethics);
        Student ogrenci1 = new Student("Metin ", "Sağlam", ontology);
        Student ogrenci2 = new Student("Murat  ", "Atılgan", ethics);
        
        
        System.out.println("=== Bölüm Bilgileri ===");

        philosophy.getInfo();
        
        System.out.println("\n=== Profesör Bilgileri ===");
        prof.getInfo();
        
        System.out.println("\n=== Ders Bilgileri ===");
        ethics.getInfo();
        ontology.getInfo();
        System.out.println("\n=== Öğrenci Bilgileri ===");
        ogrenci.getInfo();
    }
} 