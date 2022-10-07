package objetos;

public class Objeto_Auto {
    public static void main(String[] args) {
        Auto obj1=new Auto("Blanco","Mazda","2020",45.9,2.7,10);//Valores exclusivos de cada objeto
    
        System.out.println("CREACIÓN DEL PRIMER AUTO\n");
        System.out.println(obj1);
        obj1.Acelerar(40);
        System.out.println("\nAUTO ACELERADO CON +40 DE VELOCIDAD");
        System.out.println(obj1);

        Electrico electrico = new Electrico();
        electrico.color="Verde";
        electrico.fabricante="MBW";
        electrico.modelo="2010";
        electrico.peso=230.4;
        electrico.largo=233.7;
        electrico.velocidad=10;
        electrico.motorElectrico="233";
        System.out.println("\nCREACIÓN DEL AUTO ELÉCTRICO\n");
        System.out.println(electrico);
        electrico.Acelerar(50);
        System.out.println("\nAUTO ELÉCTRICO ACELERADO CON +50 DE VELOCIDAD");
        System.out.println(electrico);
    }
}
