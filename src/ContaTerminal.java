import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

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
        DecimalFormat df = new DecimalFormat("#.00");
        String saldoFormatado = df.format(saldo);
        
        //exibir na tela
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo "+ saldoFormatado +" já está disponível para saque");



    }
}
