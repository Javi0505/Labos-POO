public class Libro {
    private int ISBN;
    private String nombre;

    private String autor;
    private int paginas;

    public Libro(String nombre, String autor, int paginas) {
        this.ISBN = GeneradorISBN.generadorISBN();
        this.nombre = nombre;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro(int ISBN, String nombre, String autor, int paginas) {
        this.ISBN = ISBN;
        this.nombre = nombre;
        this.autor = autor;
        this.paginas = paginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }
}
