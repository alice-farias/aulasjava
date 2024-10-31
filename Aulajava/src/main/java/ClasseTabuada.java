import java.util.Scanner;

public class ClasseTabuada {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        System.out.println("Digite o número que você deseja ver a tabuada");
        int tabuada = numero.nextInt();

        System.out.println("1 x " + tabuada + "= " + tabuada * 2);
        System.out.println("1 x " + tabuada + "= " + tabuada * 3);
        System.out.println("1 x " + tabuada + "= " + tabuada * 4);


    }
}
