package recursividade;

public class MainRecurssion {
    public static void main(String[] args) {

        Somatorio somatorio = new Somatorio();

//        try {
//            int resultado = somatorio.AgoraSomaDeVerdade(15);
//            System.out.println(resultado);
//        } catch (NumeroAbaixoDeZero e) {
//            System.err.println("Ocorreu um erro: " + e.getMessage());
//        }

        int resultado = somatorio.AgoraSomaDeVerdade(10);
           System.out.println(resultado);

    }
}


