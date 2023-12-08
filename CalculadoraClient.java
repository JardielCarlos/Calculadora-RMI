import java.rmi.Naming;
import java.util.Scanner;

public class CalculadoraClient {
  public static void main(String[] args) {
    try {
      Calculadora c = (Calculadora) Naming.lookup("rmi://192.168.0.8:1099/CalculadoraService");
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite o primeiro valor: ");
      Integer valor1 = scanner.nextInt();
      System.out.print("Digite o Segundo valor: ");
      Integer valor2 = scanner.nextInt();
      System.out.print("Digite a operação desejada: ");
      System.out.print("1 - Adição ");
      System.out.print("2 - Subtração ");
      System.out.print("3 - Multiplicação ");
      System.out.print("4 - Divisão ");
      Integer operacao = scanner.nextInt();

      scanner.close();
      if (operacao == 1) {
        System.out.println("Resultado: " + c.getSoma(valor1, valor2));
      } else if (operacao == 2) {
        System.out.println("Resultado: " + c.getSubtracao(valor1, valor2));
      } else if (operacao == 3) {
        System.out.println("Resultado: " + c.getMultiplicacao(valor1, valor2));
      } else if (operacao == 4) {
        System.out.println("Resultado: " + c.getDivisao(valor1, valor2));
      } else {
        System.out.println("Operação Inválida!!");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
