import java.util.Scanner;

/*-------------------------------------------------------------------
  Ex 1.4: Ovos das galinhas
  - calcular quantas caixas de ovos cheias podem ser levadas ao mercado
  - calcular quantos ovos sobram

  TAREFA:
  - peça para o usuário informar quantos ovos suas galinhas botaram no dia
  - considere que cada caixa comporta 12 ovos
  - calcule e imprima quantas caixas cheias ele poderá levar ao mercado
  - calcule e imprima quantos ovos sobram
  - use a operação de divisão inteira (/) e resto da divisão (%)
-------------------------------------------------------------------*/
public class
Ex01_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Dados do usuário
        System.out.println("Quantos ovos suas galinhas botaram no dia? ");
        int ovos = teclado.nextInt();

        // Calcular caixas completas e sobrantes.
        int caixa = ovos / 12;
        int sobrantes = ovos % 12;

        // Mostrar o resultado.

        System.out.printf("Caixas: %d, Sobrantes %d\n", caixa, sobrantes);



    }
}
