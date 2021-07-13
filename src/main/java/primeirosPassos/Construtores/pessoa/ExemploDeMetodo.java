package primeirosPassos.Construtores.pessoa;

public class ExemploDeMetodo {
    public static void main(String[] args) {
        Pessoa falarNome =  new Pessoa();
        System.out.println(falarNome.falarMeuProprioNome());

        System.out.println(falarNome.andar());
    }
}
