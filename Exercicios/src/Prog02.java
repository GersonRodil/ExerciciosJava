import java.util.Scanner;

public class Prog02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Preparamos as nossas variáveis iniciais
        double somaAltura = 0.0;
        int contadorPessoas = 0;
        String temMais;

        // 2. Iniciamos o loop que se repete pelo menos uma vez
        do {
            System.out.print("Digite a altura (ex. 1.75): ");
            double altura = scanner.nextDouble();

            somaAltura += altura;
            contadorPessoas++;

            System.out.print("Tem mais pessoas? (s/n): ");
            temMais = scanner.next();

        } while (temMais.equalsIgnoreCase("s"));

        // 3. Calculamos e mostramos o resultado final fora do loop
        double mediaFinal = somaAltura / contadorPessoas;

        System.out.printf("A média de altura das %d pessoas é: %.2f\n", contadorPessoas, mediaFinal);
    }
}