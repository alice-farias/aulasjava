import java.util.Scanner;
public class QuintaClasse {
    public static void main(String[] args) {

        Scanner notas = new Scanner(System.in);

        System.out.println("Digite sua nota de português");
        int nota1 = notas.nextInt();

        System.out.println("Digite sua nota de biologia");
        int nota2 = notas.nextInt();

        System.out.println("Digite sua nota de matemática");
        int nota3 = notas.nextInt();

        System.out.println("Digite sua nota de geografia");
        int nota4 = notas.nextInt();

       int resultado = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua média é: " + resultado );

        if(resultado >= 6) {
            System.out.println("Parabéns! Você foi aprovado.");
        } else if (resultado == 5) {
            System.out.println("Você está de recuperação!");
        } else {
            System.out.println("Sinto muito! Você foi reprovado.");
        }

    }
}
