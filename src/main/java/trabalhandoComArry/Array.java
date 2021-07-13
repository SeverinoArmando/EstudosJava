package trabalhandoComArry;
//Conceitos e declaração de Arrays

public class Array {
    public static void main(String[] args) {
        int[] meuArray1 = new int[8];
        int [] meuArray = {12,32,54,76,6,8,89,64};
//Alterando valor do array
        meuArray[1]=15;

//Executando um laço de repetição da array
        for(int i=0; i<8; i++){
            System.out.println(meuArray[i]);
        }

//        imprimindo o tamanho total da array
        System.out.println(meuArray.length);
    }
}
