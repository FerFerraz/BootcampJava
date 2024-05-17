import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		System.out.println("Seja bem vindo(a) ao Banco MaxCred!");
		
		DadosConta dadosConta = new DadosConta();	
		Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
		
		System.out.println("Digite o número da conta");
		int numConta = scanner.nextInt();
		
		System.out.println("Digite o saldo do cliente");
		double saldo = scanner.nextDouble();
		
		System.out.println("Digite a agência da conta");
		String agencia  = scanner.next();
		
		System.out.println("Digite o nome do cliente");
		String nomeCliente  = scanner.next();
			
		
		System.out.println("Olá " + nomeCliente +  ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numConta +
				" e seu saldo de R$ " + saldo + " já está disponível para saque!" );
	
		
	}

}
