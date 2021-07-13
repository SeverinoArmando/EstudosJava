package segundoPasso.formatandoData.dataNoJava8;

import java.time.LocalDate;

public class JavaTime {
    public static void main(String[] args) {
//        LocalDate data = LocalDate.now();
//        LocalTime hora = LocalTime.now();
        
        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);
        LocalDate mesPassado =hoje.minusMonths(1) ;

        System.out.println("Hoje é: "+ hoje);
        System.out.println("Ontem foi: " + ontem);
        System.out.println("Data do Mês passado: " + mesPassado);

//        System.out.println(data);
//        System.out.println(hora);
    }
}
