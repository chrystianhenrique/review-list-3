import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;
        
        System.out.println("Bem-vindo ao jogo da adivinhação!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100.");
        
        do {
            System.out.print("Digite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;
            
            if (palpite < numeroSecreto) {
                System.out.println("Tente um número maior.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Tente um número menor.");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroSecreto);
        
        scanner.close();
    }
}