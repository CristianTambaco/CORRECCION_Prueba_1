package FigurasRegulares;

class Circulo {

    //atributos
    private double PI = 3.14;
    private double radio;

    //constructor
    public Circulo() {

    }

    //getters
    public double getRadio() {
        return radio;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    //setters
    public void setRadio(double radio) {
        this.radio = radio;
    }

    //metodos personalizados
    public double calcularArea() {
        return PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * PI * radio;
    }

}
