package Data;
import java.util.Date;

public class Exemplo002 {
    public static void main(String[] args) {
        Long tempoCorrente = System.currentTimeMillis();

        System.out.println(tempoCorrente);

        Date tempoAtual = new Date(tempoCorrente);

        System.out.println(tempoAtual);
    }
}
