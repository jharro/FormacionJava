package objetos;

public class Objeto_Auto {
    public static void main(String[] args) {
        Auto obj1=new Auto("Azul","Mazda","2021",340.8,2.13);//Valores exclusivos de cada objeto
        obj1.Acelerar(25);
        System.out.println(obj1);

        Electrico electrico = new Electrico();
        electrico.color="Verde";
        electrico.fabricante="MBW";
        electrico.modelo="2010";
        electrico.peso=230.4;
        electrico.largo=233.7;
        electrico.velocidad=34;

        electrico.motorElectrico="233";
        System.out.println(electrico);
    }
}
