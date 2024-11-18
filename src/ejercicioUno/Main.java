package ejercicioUno;

import ejercicioUno.Circulo;
import ejercicioUno.Figura;
import ejercicioUno.Rectangulo;

public class Main {
    public static void main(String[] args) {
        ejercicioUno.Figura rectangulo = new Rectangulo(5);

        rectangulo.calcularArea();
        rectangulo.mostrarArea();

        Figura circulo = new Circulo(7);

        circulo.calcularArea();
        circulo.mostrarArea();
    }
}
