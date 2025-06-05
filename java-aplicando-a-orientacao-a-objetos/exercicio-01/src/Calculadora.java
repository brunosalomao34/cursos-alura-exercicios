import java.util.Scanner;

public class Calculadora {

    Scanner entrada = new Scanner(System.in);

    public double dobraNumero() {
        System.out.print("Digite um número: ");
        double numero = entrada.nextDouble();

        System.out.print("Dobro do número: ");
        return numero * 2;
    }
}
