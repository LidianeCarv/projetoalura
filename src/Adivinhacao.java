import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);

        Scanner leituraNumero = new Scanner(System.in);
        int tentativas = 0;
        System.out.println("Tente adivinhar um número.");

        while (tentativas < 5){
            System.out.println("Digite um número de 0 a 100:");
            int numeroUsuario = leituraNumero.nextInt();
            if (numeroUsuario == numeroAleatorio){
                System.out.println("Parabéns, você acertou! O número é " + numeroUsuario);
                break;
            }
            tentativas++;
            if (tentativas == 5) System.out.println("Você errou! O número é: " + numeroAleatorio);
        }

    }
}
