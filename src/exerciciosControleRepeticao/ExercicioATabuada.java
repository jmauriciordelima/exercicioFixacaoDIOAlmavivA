package exerciciosControleRepeticao;

public class ExercicioATabuada {

    private static final int TABUADA_MINIMA = 1;
    private static final int TABUADA_MAXIMA = 1000;
    private static final int TABUADA_ATE = 10;

    public void gerarTabuada(int numero) {

        numero = validarEntrada(numero);

        System.out.printf("Tabuada do [%d]%n", numero);

        for (int i = TABUADA_MINIMA; i <= TABUADA_ATE; i++) {
            System.out.printf("%d X %d = %d%n", numero, i, (i * numero));

        }

    }

    private int validarEntrada(int numero) {


        if (numero < 0) {
            System.out.println("Não existe tabuada negativa. Convertendo para positivo.");
            numero = Math.abs(numero);
        }

        if (numero > TABUADA_MAXIMA) {
            System.out.println("O valor máximo para verificar a tabuada é 1000.\n" +
                    "O valor será convertido para o valor máximo permitido.");
            return TABUADA_MAXIMA;
        }

        return numero;
    }


}