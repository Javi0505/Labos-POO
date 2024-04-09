public class Professor extends Person{
    private double salary;
    private String faculty;
    private String subject;
    public Professor(){
        super();
        this.salary = 0.0;
        this.faculty = "";
        this.subject = "";
    }
    public Professor(String name, String telephone, String email, double salary, String faculty, String subject){
        super(name, telephone, email);
        this.salary = salary;
        this.faculty = faculty;
        this.subject = subject;
    }
    // Getters and setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Methods
    public void giveLecture() {
        System.out.println("Giving a lecture about OOP");
    }
    public String getInfo() {
        return "Nombre: " + getName() + ", Telefono: " + getTelephone() + ", Correo: " + getEmail() + ", Salario: " + getSalary() + ", Facultad: " + getFaculty() + ", Materia: " + getSubject();
    }
}
