package exerciciosControleRepeticao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioATeste {

    private static final int OPCAO_SAIR = 0;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ExercicioATabuada tabuada = new ExercicioATabuada();

        int numeroUsuario = -1;
        boolean continuar = true;

        do {

            System.out.println("\nPara finalizar o programa, basta digitar [0].\n");

            try {

                System.out.print("Informe qual tabuada deseja verificar -> ");
                numeroUsuario = entrada.nextInt();

                if (numeroUsuario == OPCAO_SAIR) {
                    continuar = false;
                    System.out.println("Finalizando... até logo!");
                } else {
                    tabuada.gerarTabuada(numeroUsuario);
                }

            } catch (InputMismatchException e) {
                System.out.println("Caractere não identificado, digite um número válido.");
                entrada.next();
            }
        } while (continuar);

        entrada.close();
    }
}
