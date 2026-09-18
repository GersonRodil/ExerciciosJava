import java.util.Random;
import java.util.Scanner;

/*-------------------------------------------------------------------
  Ex 1.2: Digitar vários tipos de dados

  TAREFA:
  - leia o programa com cuidado para entender como digitar cada tipo de valor
  - execute e veja o resultado
  - execute passo-a-passo e visualize o valor das variáveis
-------------------------------------------------------------------*/
public class Ex01_3 {
    public static void main(String[] args) {
        // cria um scanner uma vez só no começo
        Scanner teclado = new Scanner(System.in);

        // variável de texto (String)
        String nome;
        System.out.print("Digite seu nome: ");
        nome = teclado.next();
        System.out.printf("Olá, %s, como vai?\n", nome);

        // inteiro
        int idade;
        System.out.print("Qual sua idade? ");
        idade = teclado.nextInt();
        System.out.printf("Que legal, vc tem %d\n", idade);

        // com casas decimais - double
        double altura;
        System.out.print("Qual sua altura? ");
        altura = teclado.nextDouble();
        System.out.printf("Que legal, vc tem %.2f\n", altura);

        // char - um único caractere
        char megaSena;
        System.out.print("Vc joga na mega sena (S/N)? ");
        megaSena = teclado.next().charAt(0); // pega só o 1º caractere da próxima string

        // variável booleana guarda um teste lógico
        boolean jogador = (megaSena == 'S' || megaSena == 's');

        // se sim, gera os numeros da mega sena
        if(jogador) {
            // cria um chutador de números e inicializa
            Random chute = new Random();

            System.out.println("Seus números da Mega-Sena:");

            // for inteiro i começando em zero; enquanto for menor que 6 aumenta de um em um
            for (int i = 0; i < 6; i++) {
                // random.nextInt(60) gera de 0 a 59. Somamos 1 para ficar de 1 a 60.
                int numero = chute.nextInt(60) + 1;
                System.out.print(numero + " ");
            }
            System.out.print("\n"); // pula linha
        } else {
            System.out.print("Pois é, né ");
        }

        // resumo
        System.out.printf("Nome: %s, Idade: %d, Altura: %.2f, Jogador:%c",
                nome, idade, altura, megaSena);
    }

}
