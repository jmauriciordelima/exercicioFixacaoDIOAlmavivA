package exerciciosControleRepeticao;

import java.util.Scanner;

public class ExercicioATeste {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ExercicioATabuada tabuada = new ExercicioATabuada();

        System.out.print("Informe qual tabuada deseja verificar -> ");
        int numeroUsuario = entrada.nextInt();
        tabuada.calculadora(numeroUsuario);

    }
}
