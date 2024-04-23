import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Cuenta> cuentas;
    public static void main(String[] args) {
        int numeroFactura;
        double montoACancelar;
        Cuenta modificarCuenta;
        cuentas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("---------------------");
            System.out.println("Sistema de banco");
            System.out.println("1. Crear una cuenta de tipo Corriente");
            System.out.println("2. Crear una cuenta de tipo Ahorro");
            System.out.println("3. Depositar");
            System.out.println("4. Retirar");
            System.out.println("5. Generar intereses mensuales");
            System.out.println("6. Pagar una factura");
            System.out.println("7. Mostrar el estado de cuenta");
            System.out.println("8. Mostrar lista de cuentas");
            System.out.println("9. Salir");
            System.out.println("Ingrese una opcion:");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1: {
                    CuentaCorriente cuentaCorriente = new CuentaCorriente();
                    System.out.println("Ingrese la cantidad de dinero con la que desea aperturar su cuenta");
                    double deposito = sc.nextDouble();
                    cuentas.add(cuentaCorriente);
                    System.out.println("Se ha creado una cuenta corriente con numero de cuenta " + cuentaCorriente.getNumeroDeCuenta() + " exitosamente");
                    cuentaCorriente.depositar(deposito);
                    break;
                }
                case 2: {
                    System.out.println("Ingrese la cantidad de dinero con la que desea aperturar su cuenta");
                    double deposito = sc.nextDouble();
                    CuentaAhorro cuentaAhorro = new CuentaAhorro(deposito);
                    cuentas.add(cuentaAhorro);
                    System.out.println("Se ha creado una cuenta de ahorro con numero de cuenta " + cuentaAhorro.getNumeroDeCuenta() + " exitosamente");

                    break;
                }
                case 3: {
                    System.out.println("Ingrese el numero de cuenta al que desea depositar: ");
                    long numeroCuenta = sc.nextLong();
                    Cuenta tempCuenta = buscarCuenta(numeroCuenta, cuentas);

                    if (tempCuenta != null) {
                        System.out.println("Balance antes del depósito: " + tempCuenta.getBalance());
                        System.out.println("Ingrese cuanto desea depositar: ");
                        double deposito = sc.nextDouble();
                        tempCuenta.depositar(deposito);
                        System.out.println("Nuevo balance después del depósito: " + tempCuenta.getBalance());
                    } else {
                        System.out.println("Numero de cuenta no existe");
                    }
                    break;
                }
                case 4:
                    System.out.println("Ingrese el numero de cuenta al que desea retirar: ");
                    long numeroCuenta = sc.nextLong();
                    Cuenta tempCuenta = buscarCuenta(numeroCuenta, cuentas);

                    if (tempCuenta != null) {
                        System.out.println("Balance antes del retiro: " + tempCuenta.getBalance());
                        System.out.println("Ingrese cuanto desea retirar: ");
                        double retiro = sc.nextDouble();

                        if (retiro <= tempCuenta.getBalance()) {
                            tempCuenta.retirar(retiro);
                            System.out.println("Nuevo balance después del retiro: " + tempCuenta.getBalance());
                        } else {
                            System.out.println("Fondos insuficientes. No se puede realizar el retiro.");
                        }
                    } else {
                        System.out.println("Numero de cuenta no existe");
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el numero de cuenta: ");
                    long numberAccount = sc.nextLong();
                    modificarCuenta = null;
                    modificarCuenta = buscarCuenta(numberAccount, cuentas);
                    if(modificarCuenta == null){
                        System.out.println("No se encontro o no existe esta cuenta");
                    }else {
                        System.out.println("Ingrese el porcentaje con la que la cuenta trabaje: ");
                        modificarCuenta.generarInteresesMensuales(sc.nextDouble());
                        System.out.println("Generando intereses mensuales...");
                        System.out.println("Intereses generados exitosamente");
                    }
                    break;
                case 6:
                    System.out.println("Ingrese el numero de cuenta: ");
                    long numberAcc = sc.nextLong();
                    modificarCuenta = null;
                    modificarCuenta = buscarCuenta(numberAcc, cuentas);
                    if(modificarCuenta == null){
                        System.out.println("No se encontro o no existe esta cuenta");
                    }else {
                        System.out.println("Ingrese la factura que quiere pagar: ");
                        numeroFactura = sc.nextInt();
                        System.out.println("Ingrese la cantidad a pagar: ");
                        montoACancelar = sc.nextDouble();
                        modificarCuenta.pagarFactura(numeroFactura, montoACancelar);
                    }

                    break;
                case 7:
                    System.out.println("Ingrese el numero de cuenta al que desea mostrar el estado: ");
                    long numeroAcc = sc.nextLong();
                    Cuenta temporalCuenta = buscarCuenta(numeroAcc,cuentas);

                    if (temporalCuenta != null){
                        temporalCuenta.mostrarDatos();
                    }else {
                        System.out.println("Numero de cuenta no existe");
                    }
                    break;
                case 8:
                    mostrarLista(cuentas);
                    break;
                case 9:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (option != 9);



    }

    //Al proporcionarle una lista de cuentas puede Mostrar una lista de tipo cuenta
    public static void mostrarLista(List<Cuenta> cuentas){
        System.out.println("-------Lista------");
        for(Cuenta cuenta : cuentas){
            System.out.println("-------Cuenta: "+cuenta.getNumeroDeCuenta()+" ------");
            System.out.println("Balance: "+cuenta.getBalance());
            System.out.println("Transacciones: "+cuenta.getContadorTransacciones());
        }

    }

    // Al proporcionarle un numero de cuenta y una lista de tipo cuenta puede devolver un objeto de tipo Cuenta
    public static Cuenta buscarCuenta(long numeroCuenta, List<Cuenta> cuentas) {

        for (Cuenta cuenta : cuentas) {
            if ( cuenta.getNumeroDeCuenta() == numeroCuenta ) {
                return cuenta;
            }
        }
        return null;
    }
}