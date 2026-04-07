package exerciciosControleRepeticao;

public class ExercicioBIMC {

    public void calculoIMC(double altura, double peso) {

        String menssagem = "";
        double imc = peso / (Math.pow(altura, 2));

        if (imc <= 18.5) {
            menssagem = "Abaixo do peso";
        } else if ((imc > 18.5) && (imc <= 24.9)) {
            menssagem = "Peso ideal";
        } else if ((imc > 24.9) && (imc <= 29.9)) {
            menssagem = "Levemente acima do peso";
        } else if ((imc > 29.9) && (imc <= 35.9)) {
            menssagem = "Ovesidade Grau I";
        } else if ((imc > 35.9) && (imc <= 39.9)) {
            menssagem = "Obesidade Grau II";
        } else {
            menssagem = "Obesidade III (Mórbida)";
        }

        System.out.printf("Seu IMC é de [%.2f] - %s%n", imc, menssagem);
    }
}