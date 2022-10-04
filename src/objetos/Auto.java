package objetos;

public class Auto {

    //atributos -> características y que varían de un carro a otro
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad=0;
    //constructores -> permiten crear objetos de la clase. Si no se crea
    // creará uno vacío que permitirá crear objetos sin asignar
    //valores a estos parámetros

    public Auto(String color, String fabricante, String modelo, Double peso, Double largo) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    public Auto(){}

    //comportamiento -> métodos que simbolicen el comportamiento de un carro

    public void Acelerar(Integer cantidad){
        if(cantidad>=0 && cantidad<=120){
            this.velocidad+=cantidad;
        }
    }
//Devuelve un texto con el valor de todas las propiedades
    @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
