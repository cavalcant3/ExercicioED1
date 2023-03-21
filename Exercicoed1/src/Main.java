import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);


        System.out.println("Informe a operação que vocÊ deseja usar" +
                "1 - adicao" +
                "2 - multiplcacao");
        int resposta;
       resposta = ler.nextInt();
        System.out.println(resposta);
    }

}