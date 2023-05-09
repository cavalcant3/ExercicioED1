public class Fatorial {
    public int fatoriais(int n){
        int resultado=0;
        if (n>1){

           resultado = n * fatoriais(n-1);
        }
        if (n==1){
            return n;

        }
        return resultado;
    }
}
