package recursividade;

public class FAtorial {
    public float fatorialRecursivo(float n){
        if (n == 0 || n == 1) {
            return 1;
        }
        return  n * fatorialRecursivo(n-1);


    }
}
