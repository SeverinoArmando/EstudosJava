package heranca;

public class Exemplo001 {

    public static void main(String[] args) {
        Carr automovel = new Carr();
        automovel.setMarca("Nissan");
        automovel.setModelo("March");
        automovel.setQuantidadeDePortas(4);
        automovel.setAcelera("150km");
        automovel.setValorVenal(20000);

        System.out.println("\n"+"O automóvel de marca "+ automovel.getMarca()+ " de modelo "+ automovel.getModelo()+" tem "+automovel.getQuantidadeDePortas()+" portas!");
        System.out.println("E tem aceleração de "+ automovel.getAcelera());
        System.out.println("Seu imposto é de: " + automovel.calcularImposto());

        Motocicleta moto = new Motocicleta();
        moto.setMarca("DUCATI");
        moto.setModelo("STREETFIGHTS");
        moto.setCilindradas(850);
        moto.setAcelera("130km/h");
        moto.setValorVenal(1000);

        System.out.println("\n"+"A Motocicleta da marca "+moto.getMarca()+ " do modelo "+ moto.getModelo()+" tem "+moto.getCilindradas()+" cilindradas!");
        System.out.println("Sua aceleração é de "+ moto.getAcelera());
        System.out.println("Seu imposto é de: "+ moto.calcularImposto());
    }
}
