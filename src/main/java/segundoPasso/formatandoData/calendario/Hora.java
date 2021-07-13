package segundoPasso.formatandoData.calendario;

import java.util.Calendar;

//Algumas conversões de data/hora

public class Hora {
    public static void main(String[] args) {
        Calendar hora = Calendar.getInstance();


        System.out.printf("%tc\n", hora);

        System.out.printf("%tF\n",hora);

        System.out.printf("%tD",hora);

        System.out.printf("%tr\n",hora);

        System.out.printf("%tT\n",hora);
    }
}
