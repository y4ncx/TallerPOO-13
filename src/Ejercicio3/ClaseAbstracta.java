package Ejercicio3;

public abstract class ClaseAbstracta {

    abstract String  MetodoAbstracto();

    default void metodoDefault() {
        System.out.println("Este es un método predeterminado.");
    }
}








