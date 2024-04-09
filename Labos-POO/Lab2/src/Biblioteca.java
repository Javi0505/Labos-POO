import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    List<Libro> listalibros = new ArrayList<Libro>();

    public void agregarLibro(Libro libro) {

        listalibros.add(libro);
        System.out.println("Libro agregado :)");

    }

    public void mostrarLibros() {
        for (Libro libro : listalibros) {
            System.out.println("ISBN: " + libro.getISBN());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Nombre del libro" + libro.getNombre());
            System.out.println("Numero de paginas: " + libro.getPaginas());
        }
    }
}