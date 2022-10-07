package evaluativo_fundamentos;
import java.util.Scanner;

public class Evaluativo_01 {

    static Scanner lea = new Scanner(System.in);


    public static void Menu() {

        String opcion = "0";
        while (!opcion.equals("7")) {

            System.out.println("------------ BIENVENIDOS ------------\n -- Parte I - CRUD CON LISTAS --\n\n1.Agregar\n2.Listar\n3.Consultar\n4.Eliminar\n\n" +
                    " -- Parte II - JUEGOS --\n5.Adivinar un número\n6.Cuentas bancarias\n7.Salir");
            System.out.println("\nIngrese un valor numérico entre 1 y 7 > ");

            opcion = lea.next();
            boolean bandera = ValidarOpcion(opcion);
            if (bandera) {
                switch (opcion) {
                    case "1":
                        Agregar();
                        break;
                    case "7":
                        System.out.println("Hasta luego");
                        System.exit(0);

                    default:
                        break;
                }

            }

        }
        lea.close();

    }

    public static void Agregar() {
        System.out.println("Estamos en Agregar...");
    }

    public static boolean ValidarOpcion(String op) {
        try {
            Integer.parseInt(op);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }


    public static void main(String[] args) {
        Menu();

    }
}
