import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Instructor> instructors = new ArrayList<>();
        ArrayList<Professor> professors = new ArrayList<>();

        int opcion;
        do {
            System.out.println("\n*** Menu ***");
            System.out.println("1. Register a student");
            System.out.println("2. Register an instructor");
            System.out.println("3. Register a professor");
            System.out.println("4. Show list of students");
            System.out.println("5. Show list of instructors");
            System.out.println("6. Show list of professors");
            System.out.println("7. Exit");
            System.out.print("Select an option: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Student name: ");
                    String studentName = scanner.next();
                    System.out.print("Student telephone: ");
                    String studentTelephone = scanner.next();
                    System.out.print("Student email: ");
                    String studentEmail = scanner.next();
                    String c = scanner.next();
                    System.out.print("Student ID: ");
                    String studentNum = scanner.next();
                    System.out.print("Student CUM: ");
                    double studentCum = scanner.nextDouble();
                    students.add(new Student(studentName, studentTelephone, studentEmail, studentNum, studentCum));
                    break;
                case 2:
                    System.out.print("Instructor name: ");
                    String instructorName = scanner.next();
                    System.out.print("Instructor telephone: ");
                    String instructorTelephone = scanner.next();
                    System.out.print("Instructor email: ");
                    String instructorEmail = scanner.next();
                    System.out.print("Instructor number of employee");
                    String instructorNumberEmployee = scanner.next();
                    System.out.print("Instructor CUM");
                    double instructorCum = scanner.nextDouble();
                    System.out.print("Instructor Salary");
                    double instructureSalary = scanner.nextDouble();
                    System.out.print("Instructor Signature");
                    String instrucorSignature = scanner.next();
                    instructors.add(new Instructor(instructorName, instructorTelephone, instructorEmail, instructorNumberEmployee, instructorCum, instructureSalary, instrucorSignature));
                    break;
                case 3:
                    System.out.print("Professor Name: ");
                    String nombreProfesor = scanner.next();
                    System.out.print("Professor Telephone: ");
                    String telefonoProfesor = scanner.next();
                    System.out.print("Professor Email: ");
                    String correoProfesor = scanner.next();
                    System.out.print("Professor Salary: ");
                    double salarioProfesor = scanner.nextDouble();
                    System.out.print("Professor Faculty: ");
                    String facultadProfesor = scanner.next();
                    System.out.print("Professor Signature: ");
                    String materiaProfesor = scanner.next();
                    professors.add(new Professor(nombreProfesor, telefonoProfesor, correoProfesor, salarioProfesor, facultadProfesor, materiaProfesor));
                    break;
                case 4:
                    System.out.println("*** Lista de estudiantes ***");
                    for (Student student : students) {
                        System.out.println(student.getInfo());
                    }
                    break;
                case 5:
                    System.out.println("*** Lista de instructores ***");
                    for (Instructor instructor : instructors) {
                        System.out.println(instructor.getInfo());
                    }
                    break;
                case 6:
                    System.out.println("*** Lista de profesores ***");
                    for (Professor professor : professors) {
                        System.out.println(professor.getInfo());
                    }
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no válida, por favor seleccione otra");
            }
        } while (opcion != 7);



        scanner.close();
    }
}