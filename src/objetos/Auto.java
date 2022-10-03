package objetos;

public class Auto {
    String marca;
    long ancho;
    long largo;
    float velocidad=0;

    public Auto(String marca, long ancho, long largo, float velocidad) {
        this.marca = marca;
        this.ancho = ancho;
        this.largo = largo;
        this.velocidad = velocidad;
    }

    public void Acelerar(float velocidad){
        if (velocidad>0 && velocidad<120){

            float aceleracion=velocidad;
        }
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", ancho=" + ancho +
                ", largo=" + largo +
                ", velocidad=" + velocidad +

                '}';
    }
}
