package exerciciosControleRepeticao;

import java.util.Scanner;

public class ExercicioBTeste {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ExercicioBIMC imc = new ExercicioBIMC();

        System.out.print("Infome a altura. Ex.: 1,62 -> ");
        double altura = entrada.nextDouble();

        System.out.print("Informe o peso. Ex.: 65,50 -> ");
        double peso = entrada.nextDouble();

        imc.calculoIMC(altura, peso);

    }
}
