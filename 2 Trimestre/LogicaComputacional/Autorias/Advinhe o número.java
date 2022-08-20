import java.util.Random;
import java.util.Scanner;

public class Main

// Escreva um código que gera um número aleatório entre 0 e 10.
// E peça para um usuário tentar acertar o número até que ele acerte.

{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
		Random random = new Random();
		int numeroAleatorio = random.nextInt(11);
		System.out.println("Olá, seja bem-vindo ao tiro ao alvo dos números.\nIremos gerar um número aleatório de 0 a 10. Você tera que acerta-lo, boa sorte ;)\n");
		System.out.printf("Insira o valor que você acha certo: ");
		int chute = leitor.nextInt();
		int qntVezes = 0;
		while (chute != numeroAleatorio){
		    System.out.printf("Você errou tente novamente!\n\nInsira outro valor: ");
		    qntVezes++;
		    chute = leitor.nextInt();
		}
		System.out.println("\nVocê acertou!! Parabéns\nVocê tentou " + qntVezes + " vezes");
	}
}
