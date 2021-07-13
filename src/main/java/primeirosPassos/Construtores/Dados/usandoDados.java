package primeirosPassos.Construtores.Dados;

public class usandoDados {
    public static void main(String[] args) {
        Dados eu = new Dados("Severino",07, 04,1996);

        System.out.println("Nome: "+eu.getNome());
        System.out.println("Data de Nascimento: "+eu.getDataDeNascimento());
        System.out.println("Idade: "+eu.calcularIdade());

        eu.setNome("Severino Armando");
        System.out.println("Nome Completo: "+eu.getNome());
    }
}

