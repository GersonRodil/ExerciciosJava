import java.util.Scanner;
import java.util.InputMismatchException;

public class Prog03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 0;
        double altura = 0.0;

        boolean idadeValida = false;
        boolean alturaValida = false;

        // Laço para validar a entrada da idade
        while (!idadeValida) {
            try {
                System.out.print("Digite sua idade (inteiro): ");
                idade = scanner.nextInt();
                idadeValida = true; // Se a leitura for bem-sucedida, sai do laço
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro para a idade.");
                scanner.nextLine(); // Limpa o buffer do scanner para evitar um loop infinito
            }
        }

        // Laço para validar a entrada da altura
        while (!alturaValida) {
            try {
                System.out.print("Digite sua altura (ex: 1,75): ");
                altura = scanner.nextDouble();
                alturaValida = true; // Se a leitura for bem-sucedida, sai do laço
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número decimal para a altura.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }

        System.out.println("\nDados cadastrados com sucesso!");
        System.out.println("Idade: " + idade + " anos | Altura: " + altura + "m");

        scanner.close();
    }
}