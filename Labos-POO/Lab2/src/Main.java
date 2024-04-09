public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien anios de soledad", "Gabriel Garcia Marquez", 173);
        Libro libro2 = new Libro("IT", "Stephen King", 1502);

        Biblioteca biblioteca = new Biblioteca();

        System.out.println("***************");
        biblioteca.agregarLibro(libro1);
        biblioteca.mostrarLibros();

        System.out.println("************");
        biblioteca.agregarLibro(libro2);
        biblioteca.mostrarLibros();

    }
}
