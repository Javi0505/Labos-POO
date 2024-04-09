public class Student extends Person{

    private String studentNumber;
    private double CUM;
    private boolean isSolvent;
    public Student() {
        super();
        this.studentNumber = "";
        this.CUM = 0.0;
    }
    public Student(String name, String telephone, String email, String studentNumber, double CUM) {
        super(name, telephone, email); // call constructor in superclass
        this.studentNumber = studentNumber;
        this.CUM = CUM;
    }

    // Getters and Setters
    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double getCUM() {
        return CUM;
    }

    public void setCUM(double CUM) {
        this.CUM = CUM;
    }

    public void setSolvent(boolean solvent) {
        isSolvent = solvent;
    }

    // Methods
    public void attendClasses() {
        System.out.println("Writing important stuff");
    }

    public void attendPractices() {
        System.out.println("Listening to instructor and coding");
    }

    public String getInfo() {
        return "Nombre: " + getName() + ", Telefono: " + getTelephone() + ", Correo: " + getEmail() + ", Num Estudiante: " + getStudentNumber() + ", CUM: " + getCUM();
    }
}


