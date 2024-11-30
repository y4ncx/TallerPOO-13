package Ejercicio1;

public class Rectangulo extends Figura{
    private int ancho;
    private int alto;

    public Rectangulo(int base, int altura){
        this.ancho = base;
        this.alto = altura;

    }

    @Override
    public  double calcularArea(){
        return (ancho * alto);
    }
}
