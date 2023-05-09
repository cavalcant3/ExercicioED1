import javax.swing.*;

public class Calculadora {
    private int resultado;




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
