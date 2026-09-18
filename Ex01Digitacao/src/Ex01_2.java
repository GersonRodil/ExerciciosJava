import java.util.Scanner;

/*-------------------------------------------------------------------
  Ex 1.2: Digitar e imprimir
  - só digita um nome e imprime

  TAREFA:
  - altere o programa para pedir nome e sobrenome e imprimir juntos
-------------------------------------------------------------------*/
public class Ex01_2 {
    public static void main(String[] args) {
        // tem que criar um scanner pra poder digitar
        // eu resolvi chamar meu scanner de "teclado". pode ser qualquer nome
        // ESSA LINHA APARECE UMA VEZ SÓ NO PROGRAMA
        Scanner teclado = new Scanner(System.in);

        // avisa o usuário o que é pra ele digitar
        System.out.println("Qual o seu nome?");

        // usa o scanner pra puxar a digitação do teclado para uma variável
        // "teclado" é o nome do scanner. é ele que eu tenho que chamar pra digitar
        String nome = teclado.next();

        // inserir o sobrenome
        System.out.println("Qual o seu sobrenome?");
        String sobrenome = teclado.next();

        // imprime o resultado
        System.out.println("Olá, " + nome + " " + sobrenome + ", como vai?");

        // fecha o scanner
        teclado.close();
    }
}
