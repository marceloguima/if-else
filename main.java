import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor das suas compras esse ano: ");
        float valorCompras = scanner.nextFloat();
        System.out.println("Quantas vezes você realizou compras na loja neste ano?");
        int frequencia = scanner.nextInt();

        if (valorCompras >= 2000.0 && frequencia >= 10) {
            System.out.println("Parabens! Você está na categoria VIP e ganhou um voucher de desconto.");
        } else if (valorCompras >= 1000.0) {
            System.out.println("Você está na categoria ouro e ganhou pontos extras no programa de fidelidade.");
        } else if (valorCompras >= 500.0 || frequencia >= 5) {
            System.out.println("Você está na categoria prata e ganhou um brinde especial.");
        } else
            System.out.println("Você está na categoria bronze e não recebeu uma premiação especial.");
        {

        }
        scanner.close();
    }
}
