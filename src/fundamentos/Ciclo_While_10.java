package fundamentos;

public class Ciclo_While_10 {
    public static void main(String[] args) {
        // Instrucción while o sentencia while
        // http://www.edu4java.com/es/progbasica/progbasica8.html
        System.out.println("Imprime todo menos 5");
        int count=0;
        while (count<10){
            count++;
            if(count==5)
                continue;
            System.out.println("Hola --> "+count);

        }

        System.out.println("\nImprime hasta que se cumpla y termina");
        int count2=0;
        while (count2<10){
            System.out.println("Hola --> "+count2);
            count2++;
            if(count2==5)
                break;


        }
    }
}
