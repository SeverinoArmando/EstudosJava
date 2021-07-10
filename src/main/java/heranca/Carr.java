package heranca;

public class Carr extends Veiculo {
    private int quantidadeDePortas;
    private  String acelera;

    public int getQuantidadeDePortas(){
        return quantidadeDePortas;
    }
    public void setQuantidadeDePortas(int quantidadeDePortas){
        this.quantidadeDePortas = quantidadeDePortas;
    }
    public String getAcelera(){
        return acelera;
    }

    public void setAcelera(String acelera){
        this.acelera = acelera;
    }


    public double calcularImposto() {
        return this.getValorVenal() * 0.02;
    }
}
