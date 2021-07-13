package Data;

import java.time.Instant;
import java.util.Date;

public class Exemplo001 {
    public static void main(String[] args) {
        Date novaData = new Date();
        Instant dataAtual = novaData.toInstant();

        System.out.println("\n"+"Primeira Forma: "+novaData);

        System.out.println("\n"+"Segunda Forma: "+dataAtual);
    }
}
