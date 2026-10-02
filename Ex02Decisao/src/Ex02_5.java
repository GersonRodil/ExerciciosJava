/*-------------------------------------------------------------------
  Ex 2.5: Tipos de triangulo
  - informar o comprimento de três retas (double) 
  - descobrir se eles formam um triangulo
  - descobrir o tipo do triangulo

  TAREFA:
  - peça para o usuário informar três medidas do tipo double
  - verifique se as três medidas podem representar os lados de um
    triângulo
  - se não formarem um triângulo, imprima uma mensagem informando isso
  - se formarem um triângulo, diga se ele é equilátero, isósceles ou
    escaleno

  DICA:
  - A operação lógica "E" em java é &&
  - A operação lógica "OU" em java é ||
  - A operação lógica "NÃO" em java é !

  FORMULA:
  - três lados formam um triângulo quando cada lado é menor que a soma
    dos outros dois
  - portanto, verifique as três condições:
    lado1 < lado2 + lado3
    lado2 < lado1 + lado3
    lado3 < lado1 + lado2
  - as medidas também precisam ser maiores que zero

  CLASSIFICACAO:
  - equilátero: os três lados são iguais
  - isósceles: apenas dois lados são iguais
  - escaleno: os três lados são diferentes
-------------------------------------------------------------------*/
import java.util.Scanner;

public class Ex02_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir as três medidas (tipo double)
        System.out.print("Informe a primeira medida: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Informe a segunda medida: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Informe a terceira medida: ");
        double lado3 = scanner.nextDouble();

        // 2. Verificar se formam um triângulo
        // Condição 1: Os lados precisam ser maiores que zero
        boolean ladosPositivos = (lado1 > 0 && lado2 > 0 && lado3 > 0);

        // Condição 2: Cada lado deve ser menor que a soma dos outros dois
        boolean regraTriangulo = (lado1 < lado2 + lado3) &&
                (lado2 < lado1 + lado3) &&
                (lado3 < lado1 + lado2);

        // Se ambas as condições forem verdadeiras, é um triângulo válido
        if (ladosPositivos && regraTriangulo) {

            // 3. Descobrir o tipo do triângulo
            if (lado1 == lado2 && lado2 == lado3) {
                // Se todos os lados são iguais
                System.out.println("As medidas formam um triângulo EQUILÁTERO.");

            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                // Como o equilátero já foi descartado no 'if' acima,
                // se cairmos aqui significa que apenas dois lados são iguais
                System.out.println("As medidas formam um triângulo ISÓSCELES.");

            } else {
                // Se não é equilátero nem isósceles, só pode ter os 3 lados diferentes
                System.out.println("As medidas formam um triângulo ESCALENO.");
            }

        } else {
            // Se não passar na validação inicial
            System.out.println("As medidas informadas NÃO formam um triângulo válido.");
        }

        scanner.close();
    }
}
