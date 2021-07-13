package primeirosPassos.Construtores.pessoa;

public class Pessoa {
    public String nome = "Severino Armando";

    public String getNome() {
        return nome;
    }

    public String falarMeuProprioNome(){
        return  "Olá, meu nome é "+ getNome();
    }

    public String andar(){
        return "Andando..";
    }

}
