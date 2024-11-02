package FigurasRegulares;

class Triangulo {

    //atributos
    private double base;
    private double altura;

    //constructor
    public Triangulo() {

    }

    //getters
    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    //setters
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //metodos personalizados
    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro(double lado1, double lado2) {
        return lado1 + lado2 + base;
    }

}
