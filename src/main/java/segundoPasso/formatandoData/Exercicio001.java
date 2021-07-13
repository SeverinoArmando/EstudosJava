package segundoPasso.formatandoData;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio001 {
    public static void main(String[] args) {
        Date dataHora = new Date();

        SimpleDateFormat hora = new SimpleDateFormat("hh:mm:ss:mmm");
        SimpleDateFormat dia = new SimpleDateFormat("dd-mm-yyyy");

        String doDia = dia.format(dataHora);

        String daHora = hora.format(dataHora);

        System.out.println("Atualmente são: " + daHora);

        System.out.println("Do dia: "+ doDia);
    }
}
