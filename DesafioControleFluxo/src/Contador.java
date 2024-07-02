import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = entrada.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = entrada.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

			} catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
				
				System.out.println(exception.getMessage());
			}
		
		entrada.close();
		}
	
			static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
			//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
			if (parametroUm >= parametroDois) {
				  throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
			} 
			
			int contagem = parametroDois - parametroUm;
			//realizar o for para imprimir os números com base na variável contagem
			for (int base = 1; base <= contagem ; base++ ) {
				System.out.println("Imprimindo número " + base);
			}
			
		}

}
