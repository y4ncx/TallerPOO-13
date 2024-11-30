package Ejercicio1;

public class Triangulo extends Figura{
    private int base;
    private int altura;

    public Triangulo(int base, int altura){
        this.altura = altura;
        this.base = base;

    }

    @Override
    public double calcularArea(){
        return (base * altura) / 2 ;
    }
}
