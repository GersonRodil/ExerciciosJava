/*-------------------------------------------------------------------
  Ex 2.4: Entrada de cinema
  - perguntar a idade da pessoa
  - perguntar se a pessoa e estudante
  - calcular o valor da entrada

  TAREFA:
  - peça para o usuário informar a idade como um número inteiro
  - peça para o usuário informar se é estudante usando um char (S/N)
  - considere que o valor normal da entrada é R$ 30,00
  - menores de 18 anos, com idade de 1 a 17, pagam meia entrada
  - estudantes também pagam meia entrada
  - ao final, imprima o valor que a pessoa deve pagar

  DICA:
  - a pessoa paga meia entrada se for menor de idade OU estudante
  - use uma decisão para verificar as duas possibilidades
  - meia entrada corresponde à metade de R$ 30,00
  - lembre-se que a pessoa pode digitar 's' ou 'S' para sim, 
    e 'n' ou 'N' para não

  DESAFIO:
    - crie uma variável booleana chamada eEstudante que seja true 
      se a pessoa for estudante e false caso contrário
    - depois de terminar, conceda desconto de 10% para pessoas 
      com mais de 60 anos (mas não acumula se for estudante)
-------------------------------------------------------------------*/
import java.util.Scanner;

public class Ex02_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Valor normal da entrada
        double valorEntrada = 30.00;

        // 1. Pedir a idade (número inteiro)
        System.out.print("Informe a sua idade: ");
        int idade = scanner.nextInt();

        // 2. Pedir se é estudante (char S/N)
        System.out.print("Você é estudante? (S/N): ");
        char resposta = scanner.next().charAt(0);

        // DESAFIO: Criar variável booleana 'eEstudante'
        boolean eEstudante;
        if (resposta == 'S' || resposta == 's') {
            eEstudante = true;
        } else {
            eEstudante = false;
        }

        // 3. Calcular o valor da entrada (Regras e Dicas)
        if (idade < 18 || eEstudante) {
            // Meia entrada se for menor de idade OU estudante (R$ 15,00)
            valorEntrada = 15.00;
        }
        // DESAFIO: Desconto de 10% para maiores de 60 anos
        // O uso do "else if" garante que o desconto não acumule.
        // Se a pessoa for estudante, ela cai no primeiro "if" e essa parte é ignorada.
        else if (idade > 60) {
            valorEntrada = valorEntrada - (valorEntrada * 0.10); // Desconto de R$ 3,00
        }

        // 4. Imprimir o valor final a pagar
        System.out.printf("O valor que você deve pagar é: R$ %.2f\n", valorEntrada);

        scanner.close();
    }
}
