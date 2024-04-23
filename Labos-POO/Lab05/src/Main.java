import java.util.Scanner;

import Library.*;
import Room.Room;
import Book.Book;

public class Main {

    static Library lib = new Library();
    static Room room = new Room();
    static Book libro = new Book();
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {

            System.out.println("--- MENU DE RESERVA ---");
            System.out.println("1. Salas");
            System.out.println("2. Libros");
            System.out.println("3. Salir");
            System.out.print("Escoja la opcion que desee: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    menuSalas();
                    break;
                case 2:
                    menuLibros();
                    break;
                case 3:
                    System.out.println("Ha escogido salir del menu");
                    break;
                default:
                    System.out.println("Escoja una opcion valida");
                    break;
            }

        }while(opcion != 3);

    }

    public static void menuSalas(){

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("--- MENU SALAS ---");
            System.out.println("1. Mostrar salas disponibles");
            System.out.println("2. Mostrar salas reservadas");
            System.out.println("3. Mostrar detalles de una sala");
            System.out.println("4. Reservar sala");
            System.out.println("5. Cancelar reserva de una sala");
            System.out.println("6. Salir");
            System.out.print("Escoja una opcion que desee: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("----- SALAS DISPONIBLES -----");
                    lib.printAvailableRooms();
                    break;
                case 2:
                    System.out.println("----- SALAS RESERVADAS -----");
                    lib.printReservedRooms();
                    break;
                case 3:
                    System.out.print("Escriba el identificador de la sala que quiere ver: ");
                    int idSala = sc.nextInt();
                    Room sala = lib.obtainRoom(idSala);
                    if (sala != null) {
                        System.out.println("----- DETALLES DE LA SALA -----");
                        sala.showDataRooms();
                    } else {
                        System.out.println("La sala no existe.");
                    }
                    break;
                case 4:
                    System.out.print("Escriba el identificador de la sala que quiere reservar: ");
                    int idReserva = sc.nextInt();
                    Room salaReserva = lib.obtainRoom(idReserva);
                    if (salaReserva != null) {
                        if (!salaReserva.isReserved()) {
                            salaReserva.reserve();
                            System.out.println("La sala ha sido reservada exitosamente.");
                        } else {
                            System.out.println("La sala ya esta reservada.");
                        }
                    } else {
                        System.out.println("La sala no existe.");
                    }
                    break;
                case 5:
                    System.out.print("Escriba el identificador de la sala de la que desea cancelar la reserva: ");
                    int idCancelacion = sc.nextInt();
                    Room salaCancelacion = lib.obtainRoom(idCancelacion);
                    if (salaCancelacion != null) {
                        if (salaCancelacion.isReserved()) {
                            salaCancelacion.cancelReserve();
                            System.out.println("La reserva de la sala ha sido cancelada exitosamente.");
                        } else {
                            System.out.println("La sala no esta reservada.");
                        }
                    } else {
                        System.out.println("La sala no existe.");
                    }
                    break;

                case 6:
                    System.out.println("Ha salido del menu");
                    break;
                default:
                    System.out.println("Escoja una opcion valida");
                    break;

            }

        }while(opcion != 6);

    }

    public static void menuLibros(){

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("--- MENU LIBROS ---");
            System.out.println("1. Mostrar libros disponibles");
            System.out.println("2. Mostrar libros prestados");
            System.out.println("3. Mostrar detalles de un libro");
            System.out.println("4. Prestar libro");
            System.out.println("5. Devolver libro");
            System.out.println("6. Salir");
            System.out.print("Escoja una opcion que desee: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    lib.printAvailableBooks();
                    break;
                case 2:
                    lib.printBorrowedBooks();
                    break;
                case 3:
                    System.out.print("Escriba el ISBN del libro que desea ver: ");
                    String isbn = sc.nextLine();
                    Book libro = lib.obtainBook(isbn);
                    if (libro != null) {
                        System.out.println("----- DETALLES DEL LIBRO -----");
                        libro.showDataBooks();
                    } else {
                        System.out.println("El libro no existe.");
                    }
                    break;
                case 4:
                    System.out.print("Escriba el ISBN del libro que desea reservar: ");
                    String isbnReserva = sc.nextLine();
                    Book libroReserva = lib.obtainBook(isbnReserva);
                    if (libroReserva != null) {
                        if (!libroReserva.isEstaPrestado()) {
                            libroReserva.reserve();
                            System.out.println("El libro ha sido reservado exitosamente.");
                        } else {
                            System.out.println("El libro ya esta prestado.");
                        }
                    } else {
                        System.out.println("El libro no existe.");
                    }
                    break;
                case 5:
                    System.out.print("Escriba el ISBN del libro que desea devolver: ");
                    String isbnDevolucion = sc.nextLine();
                    Book libroDevolucion = lib.obtainBook(isbnDevolucion);
                    if (libroDevolucion != null) {
                        if (libroDevolucion.isEstaPrestado()) {
                            libroDevolucion.cancelReserve();
                            System.out.println("El libro ha sido devuelto exitosamente.");
                        } else {
                            System.out.println("El libro no esta prestado.");
                        }
                    } else {
                        System.out.println("El libro no existe.");
                    }
                    break;
                case 6:
                    System.out.println("Ha salido del menu");
                    break;
                default:
                    System.out.println("Escoja una opcion valida");
                    break;

            }

        }while(opcion != 6);

    }

}