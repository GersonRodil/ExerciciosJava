import java.util.Scanner;

/*-------------------------------------------------------------------
  Ex 1.5: Troca de dinheiro
  - informar um valor inteiro em reais, sem os centavos
  - calcular quantas notas e moedas podem ser obtidas na troca

  TAREFA:
  - peça para o usuário informar um valor inteiro em reais, sem os centavos
  - calcule e imprima quantas notas de 50, 10, 5 e 2 reais
    e quantas moedas de 1 real é preciso para fazer esse valor
  - não é necessário usar if em nenhum lugar: use apenas divisão inteira (/)
    e resto da divisão (%)

  DESAFIO:
  - depois de terminar, altere o programa para aceitar um valor double,
    incluindo os centavos
  - calcule e imprima também quantas moedas de 50, 25, 10, 5 e 1 centavo
    podem ser obtidas
-------------------------------------------------------------------*/

public class Ex01_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor em reais (ej. 87.43): ");
        double valor = scanner.nextDouble();

        // Convertemos tudo para centavos puros para evitar erros decimais.
        int centavos = (int) Math.round(valor * 100);

        int notas50 = centavos / 5000;
        int resto = centavos % 5000;

        int notas10 = resto / 1000;
        resto = resto % 1000;

        int notas5 = resto / 500;
        resto = resto % 500;

        int notas2 = resto / 200;
        resto = resto % 200;

        int moedas1 = resto / 100;
        resto = resto % 100;

        int moedas50 = resto / 50;
        resto = resto % 50;

        int moedas25 = resto / 25;
        resto = resto % 25;

        int moedas10 = resto / 10;
        resto = resto % 10;

        int moedas5 = resto / 5;
        resto = resto % 5;

        int cent1 = resto / 1;
        // El último resto ya sería 0, así que no necesitamos hacer resto % 1

        // --- IMPRESSÃO DOS RESULTADOS ---
        System.out.println("Notas de 50: " + notas50);
        System.out.println("Notas de 10: " + notas10);
        System.out.println("Notas de 5: " + notas5);
        System.out.println("Notas de 2: " + notas2);
        System.out.println("Moedas de 1: " + moedas1);
        System.out.println("Moedas de 0.50: " + moedas50);
        System.out.println("Moedas de 0.25: " + moedas25);
        System.out.println("Moedas de 0.10: " + moedas10);
        System.out.println("Moedas de 0.05: " + moedas5);
        System.out.println("Cent de 0.01: " + moedas1);
    }
}