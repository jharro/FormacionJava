package evaluativo_fundamentos;
import java.util.Scanner;

public class Evaluativo_01 {

    static Scanner lea = new Scanner(System.in);


    public static void Menu() {

        String opcion = "0";
        while (!opcion.equals("5")) {

            System.out.println("BIENVENIDOS\n1.Agregar\n2.Listar\n3.Consultar\n4.Eliminar\n5.Salir");
            System.out.println("Ingrese un valor numérico entre 1 y 5");

            opcion = lea.next();
            boolean bandera = ValidarOpcion(opcion);
            if (bandera) {
                switch (opcion) {
                    case "1":
                        Agregar();
                        break;
                    case "5":
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
