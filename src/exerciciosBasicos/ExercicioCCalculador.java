package exerciciosBasicos;

import java.util.Scanner;

public class ExercicioCCalculador {

    private static Scanner entrada = new Scanner(System.in);
    private double base;
    private double altura;
    private double area;

    public void calculador() {

        System.out.print("Informe o valor da base: ");
        base = entrada.nextDouble();

        System.out.print("Informe o valor da altura: ");
        altura = entrada.nextDouble();

        area = base * altura;

        System.out.printf("A área do retângulo é de %.2f m².", area);
    }

}
