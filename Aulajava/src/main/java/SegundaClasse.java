import java.util.Scanner;
public class SegundaClasse {

    public static void main(String[] args) {

        Scanner nome = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");

        String nomeUsuario = nome.next();

        Scanner idade = new Scanner(System.in);
        System.out.println("Digite sua idade: ");

        int idadeUsuario = idade.nextInt();

        Scanner peso = new Scanner(System.in);
        System.out.println("Digite seu peso: ");

        double pesoUsuario = peso.nextDouble();

        Scanner altura = new Scanner(System.in);
        System.out.println("Digite sua altura: ");

        double alturaUsuario = altura.nextDouble();

        System.out.println("O meu nome é: " + nomeUsuario);
        System.out.println("A minha idade é: " + idadeUsuario);
        System.out.println("O meu peso é: " + pesoUsuario);
        System.out.println("A minha altura é: " + alturaUsuario);







    }
}
