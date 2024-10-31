import java.util.Scanner;

public class CalculandoIMC {
    public static void main(String[] args) {

        Scanner informacoesPessoais = new Scanner(System.in);

        System.out.println("Qual é o seu peso?");
        double peso = informacoesPessoais.nextDouble();

        System.out.println("Qual é a sua altura");
        double altura = informacoesPessoais.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc );

        if(imc <= 18.5) {
            System.out.println("Você está abaixo do peso");
        } else if (imc >= 18.6 && imc <24.9) {
            System.out.println("Parabéns! Você está no peso ideal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Você és levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35.0 && imc <= 39.9){
            System.out.println("Obesidade severa");
        } else{
            System.out.println("Obesidade mórbida ");
        }









        }
    }

