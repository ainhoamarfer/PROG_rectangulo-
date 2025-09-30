import java.awt.*;
import java.util.Scanner;

//Deberemos preguntarle al usuario por la base y la altura de un rectángulo.
//Una vez creado un rectángulo queremos calcular el área de dicho rectángulo y su perimetro.
//perimetro = 2 x base + 2 x altura
//area = base x altura

public class Program {

    public static void main(String[] args) {
        System.out.println("Indica la base");
        Scanner sc = new Scanner(System.in);
        double baseUsuario = sc.nextDouble();
        System.out.println("Indica la altura");
        double alturaUsuario = sc.nextDouble();

        Rectangulo rect = new Rectangulo(baseUsuario, alturaUsuario);
        System.out.println("El area del rectangulo es: " + rect.calcularArea());
        System.out.println("El perimetro del rectangulo es: " + rect.calcularPerimetro());
    }
}
