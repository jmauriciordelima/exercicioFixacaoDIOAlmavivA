package exerciciosBasicos;

import java.util.Scanner;

public class ExercicioBCalculadorArea {

    private static Scanner entrada = new Scanner(System.in);
    private double lado;
    private double area;

    public void calcularArea() {

        System.out.print("Informe o lado a ser calculada: ");
        lado = entrada.nextDouble();

        area = Math.pow(lado, 2);

        System.out.printf("A área é de %.2f m².", area);

    }

}
