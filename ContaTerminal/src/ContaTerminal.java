import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Por favor digite o número da sua Agencia");
            int agencia = scanner.nextInt();

            System.out.println("Por favor digite o número a Conta");
            int conta = scanner.nextInt();

            System.out.println("Por favor digite o seu saldo");
            double saldo = scanner.nextDouble();

            System.out.println("Ola, cliente" + " " + nome + " " +sobrenome + " " +  "Obrigado por criar uma conta em nosso banco, sua agência é"+ " " + agencia + " " + "e sua conta é" + " " + conta + " " + "e seu saldo é" + " " + saldo + " " + "já está disponivél para saque.");

            scanner.close();
            System.out.println("Obrigado por utilizar nossos serviços!");



    }
}  
