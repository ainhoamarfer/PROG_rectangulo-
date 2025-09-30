import java.util.Scanner;

public class Rectangulo {

//     Atributos (siempre privados)

    private double base;
    private double altura;

//    Getters y Setters (clic derech + Generate > getters

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

//    Constructores

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

//    Funciones

    public double calcularArea(){

        return this.base * this.altura;
    }

    public double calcularPerimetro(){

        return (this.base + this.altura) * 2;
    }




//La clase rectángulo NO puede usar System.out.println()
}
