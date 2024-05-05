import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;


public class ContaTerminal {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
        
        //variaveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        //coleta de dados
        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, digite o valor do deposito: ");
        saldo = scanner.nextDouble();
        BigDecimal saldoFormatado = new BigDecimal(saldo);
        saldoFormatado.setScale(2, BigDecimal.ROUND_HALF_UP);

        //exibir na tela
        String mensagemCliente = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque",nomeCliente, agencia, numero, saldoFormatado);
        System.out.println(mensagemCliente);



    }
}
