public class Switch {
    public static void main(String[] args) {

        int DiaSemana = 5;
        String NomeDia;

        switch(DiaSemana){
            case 1: NomeDia="DOMINGO"; break;
            case 2: NomeDia="SEGUNDA"; break;
            case 3: NomeDia="TERCA"; break;
            case 4: NomeDia="QUARTA"; break;
            case 5: NomeDia="QUINTA"; break;
            case 6: NomeDia="SEXTA"; break;
            case 7: NomeDia= "SÁBADO"; break;
            default: NomeDia= "Dia Inválido"; break;
        }

        System.out.println(NomeDia);
    }
}
