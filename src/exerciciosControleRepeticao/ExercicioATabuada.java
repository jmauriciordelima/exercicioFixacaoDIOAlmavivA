package exerciciosControleRepeticao;

public class ExercicioATabuada {

    public void calculadora(int numero) {

        System.out.printf("Tabuada do [%d]%n", numero);

        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= i; j++) {
                System.out.printf("%d X %d = %d%n", numero, j, (j * numero));
            }
        }
    }
}
