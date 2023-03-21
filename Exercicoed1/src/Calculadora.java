import javax.swing.*;

public class Calculadora {
    private int resultado;










    public float adicao(float numa, float numb) {

     float resultadoAdicao = 0;

        resultadoAdicao = numa + numb;
        return resultadoAdicao;
    }


    public float multiplcacao(float num1, float num2) {
        float rsultadoMultiplicacao = 0;
         rsultadoMultiplicacao = num1 * num2;

        return rsultadoMultiplicacao;

    }

    public long divisao(long num1, long num2) {

        if (num1 ==0 || num2 == 0){
            //lançar erro
            return 0;
        }

     long teste = 0;

        if (num1> num2){
            teste = num1/num2;
        } else {
            teste = num2/num1;
        }

    return teste;
    }


    public float raizQuadrada(float numero) {
        float resultadoRaizQuadrada =0;
            resultadoRaizQuadrada = numero *numero;

        return resultadoRaizQuadrada;

    }

    public double potenciacao( double x, double y) {
        double resultadoPotenciacao =0;

       resultadoPotenciacao =  Math.pow(x, y);
        return resultadoPotenciacao;


    }
    public double log(double a) {
        double resultadoLog =0;
            resultadoLog = Math.log(a);
        return resultadoLog;


    }




    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
