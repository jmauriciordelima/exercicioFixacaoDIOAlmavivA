import java.time.Year;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioA {

    private static final int ANO_MINIMO = Year.now().getValue() - 150;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = entrada.nextLine().trim();

        int anoNascimento = lerAnoNascimento(entrada);

        entrada.close();

        if (anoNascimento == -1) {
            System.out.printf("Olá %s, infelizmente não consegui calcular sua idade.%n", nome);
        } else {
            int idade = Year.now().getValue() - anoNascimento;
            System.out.printf("Olá %s, você tem %d anos de idade.%n", nome, idade);
        }

    }

    private static int lerAnoNascimento(Scanner entrada) {
        int tentativa = 3;

        while (tentativa-- > 0) {
            System.out.print("Informe o seu ano de nascimento com [4] dígitos: ");
            try {
                int ano = entrada.nextInt();
                entrada.nextLine();

                int anoAtual = Year.now().getValue();

                if (ano < ANO_MINIMO || ano > anoAtual) {
                    System.out.printf("Ano inválido. Informe um ano entre %d e %d.%n", ANO_MINIMO, anoAtual);
                } else {
                    return ano;
                }

            } catch (InputMismatchException e) {
                entrada.nextLine(); // para limpar o buffer
                System.out.println("Formato inválido. Insira apenas números.");
            }

            if (tentativa > 0) {
                System.out.printf("Tentativas restantes: %d%n", tentativa);
            }

        }
        return -1;
    }
}