package segundoPasso.formatandoData;

import java.util.Date;
import java.text.SimpleDateFormat;
public class DateFormat {
    public static void main(String[] args) {
        Date data = new Date();

        SimpleDateFormat formatado = new SimpleDateFormat("dd/mm/yyyy");

//        SimpleDateFormat hora = new SimpleDateFormat("hh:mm:ss:mmmm");
//
//        String daHora = hora.format(data);

        String dataFormatada = formatado.format(data);

        System.out.println("\n"+"Data formatada ao modo Português" + "\n" +dataFormatada );

//        System.out.println(daHora);
    }
}
