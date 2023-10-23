import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in); //cria um objeto Scanner para ler a entrada do usuário

		int parametroUm;
		int parametroDois;

		do {
			System.out.println("Digite o primeiro número inteiro:"); //imprime uma mensagem solicitando o primeiro parâmetro
			parametroUm = terminal.nextInt(); //lê o primeiro número inteiro
			System.out.println("Digite o segundo número inteiro:"); //imprime uma mensagem solicitando o segundo parâmetro
			parametroDois = terminal.nextInt(); //lê o segundo número inteiro
			if (parametroUm > parametroDois) { //verifica se o primeiro parâmetro é maior que o segundo
				System.out.println("O segundo parâmetro deve ser maior que o primeiro"); //imprime a mensagem de erro
			}
		} while (parametroUm > parametroDois); //repete o loop enquanto o primeiro parâmetro for maior que o segundo

		try {
			//chama o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		} catch(ParametrosInvalidosException exception) { //captura a exceção customizada
			System.out.println(exception.getMessage()); //imprime a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}

                //fecha o Scanner
                terminal.close();
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		// valida se parametroUm é MAIOR que parametroDois e lança a exceção
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}

		int contagem = parametroDois - parametroUm;
		//realiza o for para imprimir os números com base na variável contagem
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}

	}
}
