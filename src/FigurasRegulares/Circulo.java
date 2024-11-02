package FigurasRegulares;

class Circulo {

    //atributos
    private double radio;

    //constructor
    public Circulo() {

    }

    //getters
    public double getRadio() {
        return radio;
    }

    //setters
    public void setRadio(double radio) {
        this.radio = radio;
    }

    //metodos personalizados
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

}
