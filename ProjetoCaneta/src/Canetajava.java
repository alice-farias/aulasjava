import java.sql.SQLOutput;

public class Canetajava {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;


// void significa "sem retorno"
    void rabiscar() {

        if(this.tampada == true) {
            System.out.println("ERRO! A caneta está tampada!");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }

    void tampar() {
        this.tampada = true; // mostrar no final * this significa nome do objeto que chamou.
    }

    void destampar() {
        this.tampada = false; // mostrar no final
    }

    void estado() {
        System.out.println("Esta caneta é do modelo: " + this.modelo);
        System.out.println("Esta caneta tem a cor: " + this.cor);
        System.out.println("Esta caneta tem a ponta: " + this.ponta);
        System.out.println("Esta caneta esta com a carga em: " + this.carga);
        System.out.println("Esta caneta está tampada?" + this.tampada);
    }

    void desenhar() {
        if(this.tampada == true) {
            System.out.println("Não dá pra desenhar com a caneta tampada!");
        } else {
            System.out.println("Estou desenhando");
        }
    }

    void pintar() {
        System.out.println("Não se pinta com caneta");
    }
























}