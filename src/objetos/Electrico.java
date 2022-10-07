package objetos;

public class Electrico extends Auto {

    String motorElectrico;



    public Electrico(String color, String fabricante, String modelo, Double peso, Double largo, Integer velocidad, String motorElectrico) {
        super(color, fabricante, modelo, peso, largo, velocidad);
        this.motorElectrico = motorElectrico;
    }

    public Electrico(){}

    @Override
    public void Acelerar(Integer cantidad){
        Integer nuevaVelocidad=cantidad*2;
        super.Acelerar(nuevaVelocidad);

    }
    @Override
    public String toString() {
        return "Electrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
