package FigurasRegulares;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //objeto Scanner de nombre "ingreso"
        Scanner ingreso = new Scanner(System.in);

        //instanciar o crear objeto de la clase "Cuadrado" con el nombre "cuadrado1"
        Cuadrado cuadrado1 = new Cuadrado();
        //instanciar o crear objeto de la clase "Rectangulo" con el nombre "rectangulo1"
        Rectangulo rectangulo1 = new Rectangulo();
        //instanciar o crear objeto de la clase "Circulo" con el nombre "circulo1"
        Circulo circulo1 = new Circulo();
        //instanciar o crear objeto de la clase "Triangulo" con el nombre "triangulo11"
        Triangulo triangulo1 = new Triangulo();

        //Solicitar datos del cuadrado
        System.out.print("Ingrese el lado del cuadrado: ");
        cuadrado1.setLado(ingreso.nextDouble());

        //mostrar informacion del cuadrado
        System.out.println("Cuadrado");
        System.out.println("Lado: " + cuadrado1.getLado() +
                ", Perímetro: " + cuadrado1.calcularPerimetro() +
                ", Área: " + cuadrado1.calcularArea());

        //Solicitar datos del rectangulo
        System.out.print("Ingrese el ancho del rectangulo: ");
        rectangulo1.setAncho(ingreso.nextDouble());
        System.out.print("Ingrese la altura del rectangulo: ");
        rectangulo1.setAltura(ingreso.nextDouble());

        //mostrar informacion del rectangulo
        System.out.println("Rectangulo");
        System.out.println("Ancho: " + rectangulo1.getAncho() +
                ", Altura: " + rectangulo1.getAltura() +
                ", Perímetro: " + rectangulo1.calcularPerimetro() +
                ", Area: " + rectangulo1.calcularArea());

        //Solicitar datos del circulo
        System.out.print("Ingrese el radio del circulo: ");
        circulo1.setRadio(ingreso.nextDouble());

        //mostrar informacion del circulo
        System.out.println("Circulo");
        System.out.println("Radio: " + circulo1.getRadio() +
                ", Perímetro: " + circulo1.calcularPerimetro() +
                ", Área: " + circulo1.calcularArea());

        //Solicitar datos del triangulo
        System.out.print("Ingrese la base del triangulo: ");
        triangulo1.setBase(ingreso.nextDouble());
        System.out.print("Ingrese la altura del triangulo: ");
        triangulo1.setAltura(ingreso.nextDouble());
        System.out.print("Ingrese el lado 1 del triangulo: ");
        double lado1 = ingreso.nextDouble();
        System.out.print("Ingrese el lado 2 del triangulo: ");
        double lado2 = ingreso.nextDouble();

        //mostrar informacion del triangulo
        System.out.println("Triangulo");
        System.out.println("Base: " + triangulo1.getBase() +
                ", Altura: " + triangulo1.getAltura() +
                ", Perimetro: " + triangulo1.calcularPerimetro(lado1, lado2) +
                ", Area: " + triangulo1.calcularArea());

        // Sumar areas
        double sumaAreas = cuadrado1.calcularArea() + rectangulo1.calcularArea() +
                circulo1.calcularArea() + triangulo1.calcularArea();
        System.out.println("La suma de areas de las figuras: " + sumaAreas);

        // Cerrar el escaner de nombre "ingreso"
        ingreso.close();

    }

}
