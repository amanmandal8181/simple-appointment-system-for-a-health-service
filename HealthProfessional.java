
public class HealthProfessional {
    private int id;
    private String name;
    private String specialty;

    public HealthProfessional() {
        // Default constructor
    }

    public HealthProfessional(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Specialty: " + specialty);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }
}
