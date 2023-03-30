package recursividade;

public class Somatorio {
    public int SomatorioRecursivo(int n) throws NumeroAbaixoDeZero {
        if (n<0){

            throw new NumeroAbaixoDeZero("Numero Abaixo de zero");
        }
        AgoraSomaDeVerdade(n);


        return n;
    }
    public int AgoraSomaDeVerdade(int n){
        if (n < 0) {
//            throw new NumeroAbaixoDeZero("Número abaixo de zero: " + n);
            return 0;
        }
         else {
            return n + AgoraSomaDeVerdade(n - 1);
        }
    }


}
