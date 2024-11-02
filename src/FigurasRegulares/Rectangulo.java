package FigurasRegulares;

class Rectangulo {

    //Atributos
    private double ancho;
    private double altura;

    //Constructor
    public Rectangulo() {

    }

    //getters
    public double getAncho() {
        return ancho;
    }

    public double getAltura() {
        return altura;
    }

    //setters
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //metodos personalizados
    public double calcularArea() {
        return ancho * altura;
    }

    public double calcularPerimetro() {
        return 2 * (ancho + altura);
    }

}
