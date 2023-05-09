public class Divisao implements Calculo{
    @Override
    public float fazerConta(float num1, float num2) {
        if (num1 ==0 || num2 == 0){
            //lançar erro
            return 0;
        }

        float teste = 0;

        if (num1> num2){
            teste = num1/num2;
        } else {
            teste = num2/num1;
        }

        return teste;
    }
}
