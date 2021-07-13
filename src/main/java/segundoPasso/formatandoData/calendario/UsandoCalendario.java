package segundoPasso.formatandoData.calendario;

import java.util.Calendar;

//Exemplo utilizando a Classe Calendar

public class UsandoCalendario {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        System.out.println(agora.getTime());
        System.out.println(agora.getFirstDayOfWeek());

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias a trás: " + agora.getTime());

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " + agora.getTime());

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + agora.getTime());

    }
}
