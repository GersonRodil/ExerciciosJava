import java.util.Scanner;

public class Prog01 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // pede pra digitar uma palavra várias vezes
        // só pára quando a pessoa responder "banana"
        String texto;
        int voltas = 0;
        do{
            // Imprime o número da tentativa antes de digitar
            System.out.print("Digite uma palavra (tentativa " + (voltas + 1) + "): ");
            texto = leitura.next();
            voltas++; // soma mais 1 em voltas

            // Se errar 7 vezes, encerra e diz qual era a palavra secreta
            if (!texto.equalsIgnoreCase("banana") && voltas == 7) {
                System.out.println("A palavra secreta era \"banana\"");
                break;
            }

            }while(!texto.equalsIgnoreCase("banana"));

        System.out.println("Você tentou "+voltas+" vezes\n");
        }
    }