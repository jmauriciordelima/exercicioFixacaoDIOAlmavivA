package exerciciosControleRepeticao;

public class ExercicioATabuada {

    public void gerarTabuada(int numero) {

        if (validaEntrada(numero) == 0) {
            return;
        }

        System.out.printf("Tabuada do [%d]%n", numero);

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", numero, i, (i * numero));
        }

    }

    private int validaEntrada(int numero) {

        if (numero < 0) {
            System.out.println("Não existe tabuada negativa. Tente novamente!");
            return 0;
        }

        return numero;
    }

}