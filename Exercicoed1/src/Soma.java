public class Soma implements Calculo{
    @Override
    public float fazerConta(float num1, float num2) {
        float resultadoAdicao = 0;

        resultadoAdicao = num1 + num2;
        return resultadoAdicao;
    }
}
