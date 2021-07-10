package heranca;

public class Motocicleta extends Veiculo {

    private int cilindradas;
    private String acelera;

    public int getCilindradas(){
        return cilindradas;
    }
    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }

    public String getAcelera(){
        return acelera;
    }
    public void setAcelera(String acelera){
        this.acelera = acelera;
    }
    public double calculaImposto(){
        return this.getValorVenal() * 0.03;
    }
}
