package Room;

import Enums.Floor;
import Enums.RoomType;
import Library.Reserva;

public class Room implements Reserva {

    private int ID;
    private int cantidadPersonas;
    private Floor floor;
    private RoomType tipo;
    private boolean estaReservado;

    public Room(){

    }

    public Room(int ID, int cantidadPersonas, Floor floor, RoomType tipo, boolean estaReservado) {
        this.ID = ID;
        this.cantidadPersonas = cantidadPersonas;
        this.floor = floor;
        this.tipo = tipo;
        this.estaReservado = estaReservado;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public RoomType getTipo() {
        return tipo;
    }

    public void setTipo(RoomType tipo) {
        this.tipo = tipo;
    }

    public boolean isEstaReservado() {
        return estaReservado;
    }

    public void setEstaReservado(boolean estaReservado) {
        this.estaReservado = estaReservado;
    }

    @Override
    public boolean reserve() {
        if (!estaReservado){
            estaReservado = true;
            return true;
        } else return false;
    }

    @Override
    public boolean cancelReserve() {
        if (estaReservado){
            estaReservado = false;
            return true;
        } else return false;
    }

    @Override
    public boolean isReserved() {

        return estaReservado;
    }
    public void showDataRooms(){
        System.out.println("Detalles de la sala " + ID);
        if (tipo == RoomType.MEETINGS)
            System.out.println("Tipo de sala: Sala de Reuniones");
        else if(tipo == RoomType.GROUP_STUDY)
            System.out.println("Tipo de sala: Sala de estudio grupal");
        else
            System.out.println("Tipo de sala: Sala de estudio individual");
        System.out.println("Capacidad " + cantidadPersonas);
        if (floor == Floor.FIRST_FLOOR)
            System.out.println("Nivel: Primer piso");
        else if(floor == Floor.SECOND_FLOOR)
            System.out.println("Nivel: Segundo piso");
        else
            System.out.println("Nivel: Tercer piso");
        System.out.println("Reservada: " + (isReserved() ? "Si" : "No"));
    }
}