package Ejercicio1;

public class PruebaFiguras {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(8, 12);
        System.out.println("El area del Rectangulo es de = " + rectangulo.calcularArea());

        System.out.println();

        Figura triangulo = new Triangulo(12, 20);
        System.out.println("El area del Triangulo es de = " + triangulo.calcularArea());


    }
}
