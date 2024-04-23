package Book;

import Enums.Floor;
import Library.Reserva;

public class Book implements Reserva {

    private String ISBN;
    private String title;
    private String author;
    private Floor floor;
    private boolean estaPrestado;

    public Book(){

    }

    public Book(String ISBN, String title, String author, Floor floor, boolean estaPrestado) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.floor = floor;
        this.estaPrestado = estaPrestado;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public boolean isEstaPrestado() {
        return estaPrestado;
    }

    public void setEstaPrestado(boolean estaPrestado) {
        this.estaPrestado = estaPrestado;
    }

    @Override
    public boolean reserve() {
        if (!estaPrestado){
            estaPrestado = true;
            return true;
        } else return false;
    }

    @Override
    public boolean cancelReserve() {
        if (estaPrestado){
            estaPrestado = false;
            return true;
        } else return false;
    }

    @Override
    public boolean isReserved() {

        return estaPrestado;
    }

    public void showDataBooks(){
        System.out.println("ISBN: " + getISBN() + "\n"
        + "Titulo: " + getTitle() + "\n"
        + "Autor: " + getAuthor() + "\n"
        + "Ubicacion: " + getFloor() + "\n"
        + "Estado de prestamo: " + isEstaPrestado() + "\n");
    }
}