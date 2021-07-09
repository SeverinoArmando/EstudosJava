package exercicio;
//Estanciamos a classe carro e usamos seus atributos para construir elementos de uma nova variavel
public class UtilizandoCarro {
    public static void main(String[] args) {
        Carro nome = new Carro();
//Imprimimos uma mensagem e chamamos o nome da Classe Carro

        System.out.println("Qual é a marca do teu Carro? "+ "\n" + nome.getMarca() + "\n");

        System.out.println("Meu carro Suporta " + nome.getAcentos() + " pessoas");

        System.out.println("\n" + "Qual o nome do Motorista?" + "\n" + nome.getMotorista());
    }

}
