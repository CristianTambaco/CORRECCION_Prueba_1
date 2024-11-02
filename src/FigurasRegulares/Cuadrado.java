package FigurasRegulares;

public class Cuadrado {

    // Atributos
    private double lado;

    //metodo constructor
    public Cuadrado(){

    }

    //getter
    public double getLado() {
        return lado;
    }

    //setter
    public void setLado(double lado) {
        this.lado = lado;
    }

    //metodos personalizados
    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

}
